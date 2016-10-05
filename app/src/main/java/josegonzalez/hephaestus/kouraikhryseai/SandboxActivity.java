package josegonzalez.hephaestus.kouraikhryseai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import josegonzalez.hephaestus.kouraikhryseai.widgets.CircularColorButtonChanger;
import josegonzalez.hephaestus.kouraikhryseai.widgets.CustomButton;

public class SandboxActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);
        CustomButton firstButton = (CustomButton) findViewById(R.id.accent_circular_reveal_button);
        CustomButton secondButton = (CustomButton) findViewById(R.id.primary_circular_reveal_button);
        new CircularColorButtonChanger(firstButton, secondButton);
    }

}
//.___ End of SandBox Activity __./
