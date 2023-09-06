package org.vidadura.combustatoracme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText edtCarro, edtKmInicial, edtKmFinal, edtLitros;

    Spinner spiCombustivel;

    RadioButton rdbDesligado, rdbLigado;

    Switch swiCarregado;

    Button btnCalcular, btnNovo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCarro = (EditText) findViewById(R.id.edtCarro);
        edtKmInicial = (EditText) findViewById(R.id.edtKmInicial);
        edtKmFinal = (EditText) findViewById(R.id.edtKmFinal);
        edtLitros = (EditText) findViewById(R.id.edtLitros);

        spiCombustivel = (Spinner) findViewById(R.id.spiCombustivel);

        rdbDesligado = (RadioButton) findViewById(R.id.rdbDesligado);
        rdbLigado = (RadioButton) findViewById(R.id.rdbLigado);

        swiCarregado = (Switch) findViewById(R.id.swiCarregado);

        btnCalcular =(Button) findViewById(R.id.btnCalcular);
        btnNovo = (Button) findViewById(R.id.btnNovo);

        btnNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtCarro.setText("");
                edtKmInicial.setText("");
                edtKmFinal.setText("");
                edtLitros.setText("");
                rdbDesligado.setChecked(true);
                swiCarregado.setChecked(false);
                spiCombustivel.setSelection(0);
                edtCarro.requestFocus();

            }
        });

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
            }
        });

    }
}