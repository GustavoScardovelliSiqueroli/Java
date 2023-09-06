package org.vidadura.albumacme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtFoto;

    ImageView imgFoto;

    Button btnFoto1, btnFoto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFoto = (TextView)  findViewById(R.id.txtFoto);

        imgFoto = (ImageView) findViewById(R.id.imgFoto);

        btnFoto1 = (Button) findViewById(R.id.btnFoto1);
        btnFoto2 = (Button) findViewById(R.id.btnFoto2);

        btnFoto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFoto.setText("Foto 1");
                imgFoto.setImageResource(R.drawable.img1);
            }
        });

        btnFoto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtFoto.setText("Foto 2");
                imgFoto.setImageResource(R.drawable.img2);
            }
        });
    }
}