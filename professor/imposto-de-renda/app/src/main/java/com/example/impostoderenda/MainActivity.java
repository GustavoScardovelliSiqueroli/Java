package com.example.impostoderenda;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnCalcular, btnLimpar;
    EditText edtSalario, edtDependentes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimpar = (Button) findViewById(R.id.btnLimpar);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        edtSalario = findViewById(R.id.edtSalario);
        edtDependentes = findViewById(R.id.edtDependentes);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edtSalario.getText().toString().equals("") || edtDependentes.getText().toString().equals("")) {
                    chamarErrorDialog();
                    return;
                }

                Intent enviarDados = new Intent(MainActivity.this, Resultado.class);

                Bundle bundle = new Bundle();
                bundle.putString("varSalario", edtSalario.getText().toString());
                bundle.putString("varDependentes", edtDependentes.getText().toString());

                enviarDados.putExtras(bundle);

                startActivity(enviarDados);

            }
        });

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtSalario.setText("");
                edtDependentes.setText("");
            }
        });

    }

    public void chamarErrorDialog(){

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
        alertDialog.setTitle("Ops!");
        alertDialog.setMessage("Você deve preencher todos os campos!");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        if (edtSalario.getText().toString().equals("")) {
                            edtSalario.requestFocus();
                        } else edtDependentes.requestFocus();
                    }
                });
        alertDialog.show();

    }
}