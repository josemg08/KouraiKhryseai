package josegonzalez.hephaestus.kouraikhryseai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import josegonzalez.hephaestus.kouraikhryseai.widgets.CircularColorButtonChanger;

public class SandboxActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);
        CircularColorButtonChanger circularColorButtonChanger =
                (CircularColorButtonChanger) findViewById(R.id.circular_color_button_changer);
    }

}
//.___ End of SandBox Activity __./
