package com.example.nanchy.viveteloloapan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class historiaTelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_telo);

        TextView historiaTelo= (TextView)findViewById(R.id.txthistoriacompleta);
        historiaTelo.setText(textos.mensajes(textos.indice_lenguaje, 12));

        TextView descripcionTelo1= (TextView)findViewById(R.id.txthistoria);
        descripcionTelo1.setText(textos.mensajes(textos.indice_lenguaje, 14));

    }
}
