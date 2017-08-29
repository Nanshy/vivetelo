package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class acercade extends AppCompatActivity {

    ListView listaAcerca;
    Integer[] IdsImagenes =
            {
                    R.drawable.about,
                    R.drawable.search,
                    R.drawable.history
            };
    String[] txts = {
            "Descripciòn",
            "Ubicaciòn",
            "Historia"

    };
    String[] txts2 = {
            "Description",
            "Location",
            "History"

    };
    String[] txts3 = {
            "Description",
            "Emplacement",
            "Histoire"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);

        TextView descripcionTelo= (TextView)findViewById(R.id.txtAcercaDe);
        descripcionTelo.setText(textos.mensajes(textos.indice_lenguaje, 13));



        listaAcerca = (ListView)findViewById(R.id.listadoAcercade);

        //AdaptadorLista adaptadorLista = new AdaptadorLista(this, txts, IdsImagenes );
        //listaAcerca.setAdapter(adaptadorLista);

        AdaptadorLista adaptadorLista = null;
        if (textos.indice_lenguaje == 0) adaptadorLista = new AdaptadorLista(this, txts, IdsImagenes );
        else if (textos.indice_lenguaje == 1) adaptadorLista = new AdaptadorLista(this, txts2, IdsImagenes );
        else if (textos.indice_lenguaje == 2) adaptadorLista = new AdaptadorLista(this, txts3, IdsImagenes );
        listaAcerca.setAdapter(adaptadorLista);

        listaAcerca.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), descripcionTelo.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), ubicacionTelo.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), historiaTelo.class);
                        startActivity(intent);
                        break;

                }
            }
        });
    }
}
