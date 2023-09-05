package com.example.aplication33;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class ActivitySegunda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        //Mensaje emergente
        Toast.makeText(getApplicationContext(),
                "Usted ha ingresado al sistema",
                Toast.LENGTH_SHORT).show();
    }
}