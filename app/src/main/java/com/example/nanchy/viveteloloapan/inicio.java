package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class inicio extends AppCompatActivity {
    private MediaPlayer mp;
  //  Button btnEsp;
   // Button btnEng;
   // Button btnFran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
      //  btnEsp = (Button) findViewById(R.id.btnEsp);
        //btnEng = (Button) findViewById(R.id.btnEng);
        //btnFran = (Button) findViewById(R.id.btnFran);
    }

    public void clicEsp(View view) {

        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
        textos.indice_lenguaje = 0;
      /*  btnEsp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(inicio.this, R.raw.piedra);
                mp.start();
            }
        });*/
    }
    public void clicEng(View view)
    {
        Intent intent= new Intent(this, menu.class);
        startActivity(intent);
        textos.indice_lenguaje = 1;
      /*  btnEng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(inicio.this, R.raw.piedra);
                mp.start();
            }
        });*/
    }
    public void clicFran(View view)
    {
        Intent intent= new Intent(this, menu.class);
        startActivity(intent);
        textos.indice_lenguaje = 2;
      /*  btnFran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(inicio.this, R.raw.piedra);
                mp.start();
            }
        });*/
    }



}