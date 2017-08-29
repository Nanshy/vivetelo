package com.example.nanchy.viveteloloapan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class descripcionTelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descripcion_telo);

      TextView descripcionTelo= (TextView)findViewById(R.id.descripcionTelo);
        descripcionTelo.setText(textos.mensajes(textos.indice_lenguaje, 11));

    }
}
