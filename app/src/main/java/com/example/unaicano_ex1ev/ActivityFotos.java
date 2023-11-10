package com.example.unaicano_ex1ev;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import clases.Lugar;

public class ActivityFotos extends AppCompatActivity {

    ImageButton foto1,foto2,foto3,foto4;
    TextView titulo1,titulo2,titulo3,titulo4,likes1,likes2,likes3,likes4;

    Lugar lugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfotos);

        Bundle bundle = getIntent().getExtras();


        titulo1 = findViewById(R.id.titulo_foto_top_left);
        likes1 = findViewById(R.id.likes_top_left);
        foto1 = findViewById(R.id.ImagenTopLeft);

        titulo2 = findViewById(R.id.titulo_foto_top_right);
        likes2 = findViewById(R.id.likes_top_right);
        foto2 = findViewById(R.id.ImagenTopRight);

        titulo3 = findViewById(R.id.titulo_foto_bot_left);
        likes3 = findViewById(R.id.likes_bot_left);
        foto3 = findViewById(R.id.ImagenBotLeft);

        titulo4 = findViewById(R.id.titulo_foto_bot_right);
        likes4 = findViewById(R.id.likes_bot_right);
        foto4 = findViewById(R.id.ImagenBotRight);

        //creamos los 4 objetos de tipo lugar, asi trabajamos con ellos de forma mas ordenada

        lugar =  (Lugar) bundle.get("objeto");


        Lugar guggen = new Lugar();
        guggen.setNombreFoto("@drawable/alhondiga");
        guggen.setTitulo("Guggenheim");
        guggen.setDescripcion("El Museo Guggenheim Bilbao es un museo de arte contemporáneo diseñado" +
                " por el arquitecto canadiense Frank O. Gehry " +
                "y localizado en la villa de Bilbao, España");
        guggen.setPuntuacion(0);

        Lugar moyua = new Lugar();
        moyua.setNombreFoto("@drawable/moyua");
        moyua.setTitulo("Plaza Moyua");
        moyua.setDescripcion("La plaza Moyua se ubica en el centro de Bilbao, siendo de forma oval y " +
                "teniendo una" +
                "fuente situada en el centro");
        moyua.setPuntuacion(0);

        Lugar alhondiga = new Lugar();
        alhondiga.setNombreFoto("@drawable/alhondiga");
        alhondiga.setDescripcion("adawudgaw");
        alhondiga.setTitulo("Alhondiga");
        alhondiga.setPuntuacion(0);

        Lugar elorrieta = new Lugar();
        elorrieta.setNombreFoto("@drawable/elorrieta");
        elorrieta.setDescripcion("adwadaw");
        elorrieta.setPuntuacion(0);
        elorrieta.setTitulo("Elorrieta Errekamari");


        if(lugar.getTitulo().equals(guggen.getTitulo())){
            guggen = lugar;
            titulo1.setText(guggen.getTitulo());
            likes1.setText(String.valueOf(guggen.getPuntuacion()));
        }

        if(lugar.getTitulo().equals(moyua.getTitulo())) {
            moyua = lugar;
            titulo2.setText(moyua.getTitulo());
            likes2.setText(String.valueOf(moyua.getPuntuacion()));
        }

        if(lugar.getTitulo().equals(alhondiga.getTitulo())) {
            alhondiga = lugar;
            titulo3.setText(alhondiga.getTitulo());
            likes3.setText(String.valueOf(alhondiga.getPuntuacion()));
        }

        if(lugar.getTitulo().equals(elorrieta.getTitulo())) {
            elorrieta = lugar;
            titulo4.setText(elorrieta.getTitulo());
            likes4.setText(String.valueOf(elorrieta.getPuntuacion()));
        }




        foto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFotos.this, ActivityLugar.class);
                intent.putExtra("objeto", finalGuggen);
                startActivity(intent);
            }
        });

        Lugar finalMoyua = moyua;
        foto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFotos.this, ActivityLugar.class);
                intent.putExtra("objeto", finalMoyua);
                startActivity(intent);
            }
        });

        Lugar finalAlhondiga = alhondiga;
        foto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFotos.this, ActivityLugar.class);
                intent.putExtra("objeto", finalAlhondiga);
                startActivity(intent);
            }
        });

        Lugar finalElorrieta = elorrieta;
        foto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityFotos.this, ActivityLugar.class);
                intent.putExtra("objeto", finalElorrieta);
                startActivity(intent);
            }
        });
    }

}
