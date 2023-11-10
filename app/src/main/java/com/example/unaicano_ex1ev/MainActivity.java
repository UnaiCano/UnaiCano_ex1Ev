package com.example.unaicano_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import clases.Lugar;

public class MainActivity extends AppCompatActivity {

    //image button para poder darle las funcionalidades de un boton sobre una imagen y hacerlo mas sencillo
    ImageButton botonWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonWelcome = findViewById(R.id.botonBienvenida);

        botonWelcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityFotos.class);
                startActivity(intent);
            }
        });

    }
}