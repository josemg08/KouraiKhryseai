package josem.gonzaleza.customizableview.utils;

import android.support.constraint.ConstraintLayout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import josegonzalez.hephaesus.main.module.ButtonModel;

/**.___
 * Created by Jose Gonzalez on 29/05/17.
 __.*/

public class FreeMovingButton implements View.OnTouchListener{

    private float posX;
    private float posY;

    public FreeMovingButton(ViewGroup layout,
            Button button, ButtonModel buttonModel){
        ConstraintLayout.LayoutParams layoutParams =
                new ConstraintLayout.LayoutParams(buttonModel.getWidth(), buttonModel.getHeight());
        button.setLayoutParams(layoutParams);
        button.setOnTouchListener(this);
        layout.addView(button);

        moveButton(button, buttonModel.getPositionX(), buttonModel.getPositionY());
    }

    private void moveButton(Button button, int positionX, int positionY){
        button.animate()
              .x(positionX)
              .y(positionY)
              .setDuration(0)
              .start();
    }

    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                posX = view.getX() - event.getRawX();
                posY = view.getY() - event.getRawY();
                break;

            case MotionEvent.ACTION_MOVE:
                moveButton((Button) view, (int) (event.getRawX() + posX), (int) (event.getRawY() + posY));
                break;

            default:
                return false;
        }

        return true;
    }
}
//.___ End of FreeMovingButton __./
