package josegonzalez.hephaestus.kouraikhryseai;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class SandboxActivity extends AppCompatActivity implements View.OnTouchListener{

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);
    }*/

    private float posX;
    private float posY;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = new Button(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.activity_main);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(500, 500);
        layoutParams.leftMargin = 50;
        layoutParams.topMargin = 50;
        button.setLayoutParams(layoutParams);

        button.setOnTouchListener(this);
        constraintLayout.addView(button);
    }

    public boolean onTouch(View view, MotionEvent event) {
        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                posX = view.getX() - event.getRawX();
                posY = view.getY() - event.getRawY();
                break;

            case MotionEvent.ACTION_MOVE:
                view.animate()
                        .x(event.getRawX() + posX)
                        .y(event.getRawY() + posY)
                        .setDuration(0)
                        .start();
                break;

            default:
                return false;
        }

        return true;
    }

}
//.___ End of SandBox Activity __./
