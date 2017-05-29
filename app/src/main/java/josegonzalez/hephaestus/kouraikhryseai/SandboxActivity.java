package josegonzalez.hephaestus.kouraikhryseai;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.List;

import josegonzalez.hephaestus.kouraikhryseai.modules.ButtonModel;
import josegonzalez.hephaestus.kouraikhryseai.modules.ButtonModuleParser;
import josegonzalez.hephaesus.module.JsonModel;

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

        ButtonModuleParser buttonModuleParser = new ButtonModuleParser();
        List<JsonModel> buttonList = buttonModuleParser.JsonToModelParser("sampleScreenButtons.json", this);

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.activity_main);

        for(JsonModel buttonModel : buttonList){
            Button button = new Button(this);

            ConstraintLayout.LayoutParams layoutParams =
                    new ConstraintLayout.LayoutParams(((ButtonModel)buttonModel).getWidth(),
                            ((ButtonModel)buttonModel).getHeight());
            layoutParams.leftMargin = ((ButtonModel)buttonModel).getPositionX();
            layoutParams.topMargin = ((ButtonModel)buttonModel).getPositionY();
            button.setLayoutParams(layoutParams);
            button.setOnTouchListener(this);
            constraintLayout.addView(button);

            button.animate()
                    .x(((ButtonModel)buttonModel).getPositionX())
                    .y(((ButtonModel)buttonModel).getPositionY())
                    .setDuration(0)
                    .start();
        }
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
