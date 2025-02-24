package com.example.impostoderenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    TextView txtSalario, txtDependentes, txtAlicota, txtInss, txtDeduzir, txtIR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtSalario = (TextView) findViewById(R.id.txtSalario);
        txtDependentes = (TextView) findViewById(R.id.txtDependentes);
        txtAlicota = (TextView) findViewById(R.id.txtAliquota);
        txtInss = (TextView) findViewById(R.id.txtInss);
        txtDeduzir = (TextView) findViewById(R.id.txtDeduzir);
        txtIR = (TextView) findViewById(R.id.txtIR);

        Intent receberDados = getIntent();

        Bundle bundle = receberDados.getExtras();
        float salario = Float.parseFloat(bundle.getString("varSalario"));
        int dependetes = Integer.parseInt(bundle.getString("varDependentes"));

        txtSalario.setText(String.format("R$ %.02f",salario));
        txtDependentes.setText(bundle.getString("varDependentes"));

        double inss = 0;
        if (salario <1305){
            inss = (salario/100)*7.5;
        } else if (salario < 2571.30) {
            inss = (salario/100)*9;
        } else if (salario < 3856.95) {
            inss = (salario/100)*12;
        }else{
            inss = (salario/100)*14;
            if (inss >877.22){
                inss = 877.22;
            }
        }

        double formula1 = (salario -(dependetes * 189.59) - inss);
        double alicota = 0;
        double deducao = 0;
        if (formula1 < 1903.99){

        } else if (formula1 < 2826.66) {
            alicota = 0.075;
            deducao = 142.80;
        } else if (formula1 < 3751.06) {
            alicota = 0.15;
            deducao = 354.80;
        } else if (formula1 < 4664.69) {
            alicota = .0225;
            deducao = 636.13;
        } else {
            alicota = 0.275;
            deducao = 869.36;
        }



        txtInss.setText(String.format("%.02f",inss));
        txtAlicota.setText(String.format("%.01f%%",alicota*100));
        txtDeduzir.setText(String.format("R$ %.02f",deducao));
        txtIR.setText(String.format("R$ %.02f",(formula1 * alicota) - deducao));
//        txtIR.setText(String.format("R$ %.02f",(formula1)));


}
}
