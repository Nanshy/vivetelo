package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_tradiciones extends AppCompatActivity {


    ListView listaTradiciones;
    Integer[] IdsImagenes =
            {
                    R.drawable.artesania,
            };
    String[] txtos = {
            "Mascaras de diablos"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tradiciones);

        TextView artesania= (TextView)findViewById(R.id.txtArtesa);
        artesania.setText(textos.mensajes(textos.indice_lenguaje, 18));



        listaTradiciones = (ListView)findViewById(R.id.listadoTradiciones);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        listaTradiciones.setAdapter(adaptadorLista);

        listaTradiciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), diablos.class);
                        startActivity(intent);
                        break;

                }
            }
        });

    }
}
