package josegonzalez.hephaestus.kouraikhryseai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import josegonzalez.hephaestus.kouraikhryseai.widgets.CircularColorButtonChanger;

public class SandboxActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandbox);
        new CircularColorButtonChanger((Button) findViewById(R.id.accent_circular_reveal_button),
                (Button) findViewById(R.id.primary_circular_reveal_button));
    }

}
//.___ End of SandBox Activity __./
