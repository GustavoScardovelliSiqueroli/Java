package gss.jogos.jogodefdp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView circulo, alfinete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circulo = (ImageView) findViewById(R.id.circulo);
        alfinete = (ImageView) findViewById(R.id.alfinete);

        float varx  = (float) 80*2;

        alfinete.setX(varx);



    }
}