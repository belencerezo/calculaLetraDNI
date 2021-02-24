package com.example.calculaletradni;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private char[] listaLetras =
            new char[]{'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private TextView numberDNI;
    private TextView letter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberDNI = findViewById(R.id.number);
        letter = findViewById(R.id.letra);
        Button calcular = findViewById(R.id.buttonResult);
        calcular.setOnClickListener(this);
        Button salir = findViewById(R.id.buttonSalir);
        salir.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buttonResult:
                int dni = Integer.parseInt(numberDNI.getText().toString());
                int resto = dni % 23;
                String stringDNI = numberDNI.getText().toString();
                letter.setText(String.valueOf(listaLetras[resto]));
                stringDNI = stringDNI.concat(String.valueOf(listaLetras[resto]));
                break;

            case R.id.buttonSalir:
                finish();
                break;
        }
    }

}