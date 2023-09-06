package org.vidadura.informatoracme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DadosActivity extends AppCompatActivity {

    TextView txtNome, txtTelefone, txtEmail;

    Button btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        txtNome = (TextView) findViewById(R.id.txtNome);
        txtTelefone = (TextView) findViewById(R.id.txtTelefone);
        txtEmail = (TextView) findViewById(R.id.txtEmail);

        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        Intent receberDados = getIntent();

        Bundle bundle = receberDados.getExtras();

        txtNome.setText(bundle.getString("varNome"));
        txtTelefone.setText(bundle.getString("varTelefone"));
        txtEmail.setText(bundle.getString("varEmail"));

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DadosActivity.this.finish();
            }
        });
    }
}