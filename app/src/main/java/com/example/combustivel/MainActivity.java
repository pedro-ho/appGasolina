package com.example.combustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtAlcool =  findViewById(R.id.edtAlcool);
        EditText edtGasolina = findViewById(R.id.edtGasolina);
        Button btnVerificar = findViewById(R.id.btnVerificar);
        TextView txtResultado = findViewById(R.id.textResultado);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alcool = Double.parseDouble(edtAlcool.getText().toString());
                double gasolina = Double.parseDouble(edtGasolina.getText().toString());
                String resultado;

                if (alcool <= 0.3*gasolina){
                    resultado = "Alcool é melhor!";
                } else{
                    resultado = "Gasolina é melhor!";
                }

                txtResultado.setText(resultado);

            }
        });







    }
}