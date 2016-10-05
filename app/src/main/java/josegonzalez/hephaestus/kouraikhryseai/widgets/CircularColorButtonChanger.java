package josegonzalez.hephaestus.kouraikhryseai.widgets;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

/**
 * .___
 * Created by Jose Gonzalez
 *
 * Argentina Sep 2016
 * __.
 */

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
public class CircularColorButtonChanger {

    public CircularColorButtonChanger(final Button firstButton, final Button secondButton){
        firstButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    secondButton.bringToFront();
                    selectButton(secondButton, true, (int) event.getX(), (int) event.getY());
                }
                return false;
            }
        });
        secondButton.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    firstButton.bringToFront();
                    selectButton(firstButton, true, (int) event.getX(), (int) event.getY());
                }
                return false;
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void selectButton(Button button, boolean reveal, int startX, int startY) {
        ViewAnimationUtils.createCircularReveal(button,
                startX,
                startY,
                0,
                button.getHeight()).start();
    }

}
//.___ End of CircularColorButtonChanger __./
