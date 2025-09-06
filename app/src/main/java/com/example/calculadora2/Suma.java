package com.example.calculadora2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Suma extends AppCompatActivity {

    EditText textito1, textito2;
    TextView resultado;
    Button sumita, regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suma);
        textito1 = findViewById(R.id.textito1);
        textito2 = findViewById(R.id.textito2);
        resultado = findViewById(R.id.resultado);
        sumita = findViewById(R.id.sumita);
        regresar = findViewById(R.id.regresar);

        sumita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor1 = textito1.getText().toString();
                String valor2 = textito2.getText().toString();
                if (!valor1.isEmpty() && !valor2.isEmpty()) {
                    int num1 = Integer.parseInt(valor1);
                    int num2 = Integer.parseInt(valor2);
                    int res = num1 + num2;
                    resultado.setText(String.valueOf(res));
                }
            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}