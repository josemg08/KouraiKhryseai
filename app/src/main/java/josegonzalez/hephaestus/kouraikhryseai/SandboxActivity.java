package josegonzalez.hephaestus.kouraikhryseai;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import java.util.List;

import josegonzalez.hephaesus.main.module.ButtonModel;
import josegonzalez.hephaesus.main.module.ButtonModuleParser;
import josegonzalez.hephaesus.main.JsonModel;
import josem.gonzaleza.customizableview.utils.FreeMovingButton;

public class SandboxActivity extends AppCompatActivity{

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);
    }*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonModuleParser buttonModuleParser = new ButtonModuleParser();
        List<JsonModel> buttonList = buttonModuleParser.JsonToModelParser("sampleScreenButtons.json", this);

        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.activity_main);

        for(JsonModel buttonModel : buttonList){
            new FreeMovingButton(constraintLayout, new Button(this), (ButtonModel) buttonModel);
        }
    }

}
//.___ End of SandBox Activity __./
