package org.vidadura.informatoracme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNome, edtTelefone, edtEmail;

    Button btnEnviar, btnNova;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtTelefone = (EditText) findViewById(R.id.edtTelefone);
        edtEmail = (EditText) findViewById(R.id.edtEmail);

        btnEnviar = (Button) findViewById(R.id.btnEnviar);
        btnNova = (Button) findViewById(R.id.btnNova);

        btnNova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtNome.setText("");
                edtTelefone.setText("");
                edtEmail.setText("");
                edtNome.requestFocus();
            }
        });

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enviarDados = new Intent(MainActivity.this, DadosActivity.class);

                Bundle bundle = new Bundle();

                bundle.putString("varNome", edtNome.getText().toString());
                bundle.putString("varTelefone", edtTelefone.getText().toString());
                bundle.putString("varEmail", edtEmail.getText().toString());

                enviarDados.putExtras(bundle);

                startActivity(enviarDados);

            }
        });
    }
}