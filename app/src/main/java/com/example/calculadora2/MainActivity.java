package com.example.calculadora2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    EditText textito1,textito2;
    Button botoncitos, botoncitor, botoncitom, botoncitod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textito1 = findViewById(R.id.textito1);
        textito2 = findViewById(R.id.textito2);

        botoncitos = findViewById(R.id.sumita);
        botoncitos.setOnClickListener(this);
    }
}