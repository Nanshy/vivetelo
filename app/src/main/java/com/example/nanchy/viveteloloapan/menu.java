package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        Button btn = (Button)findViewById(R.id.acercade);
        btn.setText(textos.mensajes(textos.indice_lenguaje, 0));

        btn = (Button)findViewById(R.id.clicMonumentos);
        btn.setText(textos.mensajes(textos.indice_lenguaje,1));

       btn = (Button)findViewById(R.id.clicResta);
        btn.setText(textos.mensajes(textos.indice_lenguaje,2));

        btn = (Button)findViewById(R.id.clicalojamiento);
        btn.setText(textos.mensajes(textos.indice_lenguaje,3));

        btn = (Button)findViewById(R.id.clicArtesania);
        btn.setText(textos.mensajes(textos.indice_lenguaje,4));

        btn = (Button)findViewById(R.id.clicGastro);
        btn.setText(textos.mensajes(textos.indice_lenguaje,5));

        btn = (Button)findViewById(R.id.clicHome);
        btn.setText(textos.mensajes(textos.indice_lenguaje,6));

        btn = (Button)findViewById(R.id.clicAgenda);
        btn.setText(textos.mensajes(textos.indice_lenguaje,7));

        btn = (Button)findViewById(R.id.clicLugaresC);
        btn.setText(textos.mensajes(textos.indice_lenguaje,8));

        btn = (Button)findViewById(R.id.clicAyuda);
        btn.setText(textos.mensajes(textos.indice_lenguaje,9));

        btn = (Button)findViewById(R.id.clicIdioma);
        btn.setText(textos.mensajes(textos.indice_lenguaje,10));

    }
    public void clicmonumentos(View view)
    {
        Intent intent= new Intent(this, listaMonumentos.class);
        startActivity(intent);
    }

    public void clicRest(View view)
    {
        Intent intent= new Intent(this, lista_restaurantes.class);
        startActivity(intent);
    }
    public void clicAcercade(View view)
    {
        Intent intent= new Intent(this, acercade.class);
        startActivity(intent);
    }
    public void clicTradiciones(View view)
    {
        Intent intent= new Intent(this, lista_tradiciones.class);
        startActivity(intent);
    }
    public void clicGastronomia(View view)
    {
        Intent intent= new Intent(this, lista_gastronomia.class);
        startActivity(intent);
    }
    public void clicAlojamiento(View view)
    {
        Intent intent= new Intent(this, lista_alojamiento.class);
        startActivity(intent);
    }

    public void clicHome(View view)
    {
        Intent intent= new Intent(this, menu.class);
        startActivity(intent);
    }
    public void clicIdioma(View view)
    {
        Intent intent= new Intent(this, inicio.class);
        startActivity(intent);
    }

    public void clicAgenda(View view)
    {
        Intent intent= new Intent(this, lista_agenda.class);
        startActivity(intent);
    }
    public void clicLugaresCercanos(View view)
    {
        Intent intent= new Intent(this, lista_lugares_cercanos.class);
        startActivity(intent);
    }
    public void clicAyuda(View view)
    {
        Intent intent= new Intent(this, ayuda.class);
        startActivity(intent);
    }
    public void servicios(View view)
    {
        Intent intent= new Intent(this, SesionUsuario.class);
        startActivity(intent);
    }

    public void clicContacto(View view)
    {
        Intent intent= new Intent(this, contacto.class);
        startActivity(intent);
    }


}
