package com.example.unaicano_ex1ev;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import clases.Lugar;

public class ActivityLugar extends AppCompatActivity {

    /*
    int likes;
    String titulo,descripcion,foto;
     */

    Lugar lugar;

    ImageView imagen;

    TextView contadorTv,tituloTv,descripcionTv;

    Button volver,likeyvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylugar);

        Bundle bundle = getIntent().getExtras();

        /* Lo comento, ya que una vez probado el funcionamiento he decidido transferir los objetos
        como conjunto


        titulo= bundle.getString("_titulo");
        foto =bundle.getString("_foto");
        descripcion= bundle.getString("_descripcion");
        likes= bundle.getInt("_likes");
         */

        lugar=  (Lugar) bundle.get("objeto");

        Log.d(TAG,lugar.getTitulo());

        imagen = findViewById(R.id.foto);
        contadorTv = findViewById(R.id.contador);
        tituloTv = findViewById(R.id.titulo);
        descripcionTv = findViewById(R.id.descripcion);

        contadorTv.setText(String.valueOf(lugar.getPuntuacion()));
        tituloTv.setText(lugar.getTitulo());
        descripcionTv.setText(lugar.getDescripcion());


        volver = findViewById(R.id.btnvolver);
        likeyvolver = findViewById(R.id.btnLikeVolver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLugar.this,ActivityFotos.class);
                intent.putExtra("lugar",lugar);
                startActivity(intent);
            }
        });

        likeyvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityLugar.this,ActivityFotos.class);
                lugar.setPuntuacion(lugar.getPuntuacion()+1);
                intent.putExtra("lugar",lugar);
                startActivity(intent);
            }
        });
    }

}
