package com.example.aplication33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // asignacion de valores
        mensaje = (TextView) findViewById(R.id.textView);
    }

    //Metodo para ingresar a una segunda activity

    public void ingresarSistema (View view){
        Intent actividad2 = new Intent(this, ActivitySegunda.class);
        startActivity(actividad2);
    }


    public void colorVerde(View view){
        mensaje.setTextColor(Color.GREEN);
    }

    public void colorRojo(View view){
        mensaje.setTextColor(Color.RED);
    }
}