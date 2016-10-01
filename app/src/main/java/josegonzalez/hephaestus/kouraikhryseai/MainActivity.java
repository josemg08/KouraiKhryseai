package josegonzalez.hephaestus.kouraikhryseai;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{
    Button accentButton;
    Button primaryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        accentButton = (Button) findViewById(R.id.accent_circular_reveal_button);
        accentButton.setOnTouchListener(this);
        primaryButton = (Button) findViewById(R.id.primary_circular_reveal_button);
        primaryButton.setOnTouchListener(this);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void selectButton(Button button, boolean reveal, int startX, int startY) {
        ViewAnimationUtils.createCircularReveal(button,
                startX,
                startY,
                0,
                button.getHeight()).start();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch(view.getId()){
            case R.id.accent_circular_reveal_button:
                primaryButton.bringToFront();
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    selectButton(primaryButton, true, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
                break;
            case R.id.primary_circular_reveal_button:
                accentButton.bringToFront();
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    selectButton(accentButton, true, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
                break;
        }

        return false;
    }

}
