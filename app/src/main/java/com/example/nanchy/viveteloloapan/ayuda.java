package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class ayuda extends AppCompatActivity {

    ListView listaAyuda;
    Integer[] IdsImagenes =
            {
                    R.drawable.question1,
                    R.drawable.question1,
                    R.drawable.question1,
                    R.drawable.question1,
                    R.drawable.question1

            };
    String[] txtos = {
            "¿Como cambio de idioma?",
            "¿Como visualizar la ubicacion?",
            "¿Necesito internet para utilizar GPS?",
            "¿Como puedo comunicarme con el administrador?",
            "¿Como funciona el chat?"

    };

    String[] txtos2 = {
            "How I change of language?",
            "How i can see the location?",
            "Need I the Internet to use GPS?",
            "How I can communicate with the manager?",
            "How does the chat work?"
    };

    String[] txtos3 = {
            "¿Comme un changement de langue?",
            "Comme visualisez l'emplacement?",
            "Je dois l'Internet pour utiliser le GPS?",
            "Comment puis-je communiquer avec le gestionnaire?",
            "Comment le travail de chat t-il?"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        TextView ayuda= (TextView)findViewById(R.id.txtAyuda);
        ayuda.setText(textos.mensajes(textos.indice_lenguaje, 22));

        TextView ayuda1= (TextView)findViewById(R.id.ttayuda1);
        ayuda1.setText(textos.mensajes(textos.indice_lenguaje, 23));

        TextView ayuda2= (TextView)findViewById(R.id.txtayuda2);
        ayuda2.setText(textos.mensajes(textos.indice_lenguaje, 24));

        listaAyuda = (ListView)findViewById(R.id.listadoAyuda);

        //AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        //listaAyuda.setAdapter(adaptadorLista);

        AdaptadorLista adaptadorLista = null;
        if (textos.indice_lenguaje == 0) adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        else if (textos.indice_lenguaje == 1) adaptadorLista = new AdaptadorLista(this, txtos2, IdsImagenes );
        else if (textos.indice_lenguaje == 2) adaptadorLista = new AdaptadorLista(this, txtos3, IdsImagenes );
        listaAyuda.setAdapter(adaptadorLista);

        listaAyuda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), ayuda1.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), ayuda2.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), ayuda3.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), ayuda4.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), ayuda5.class);
                        startActivity(intent);
                        break;

                }
            }
        });


    }
}
