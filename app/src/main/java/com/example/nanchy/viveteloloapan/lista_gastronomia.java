package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_gastronomia extends AppCompatActivity {

    ListView listaGastronomia;
    Integer[] IdsImagenes =
            {
                    R.drawable.gastronomia,
                    R.drawable.gastronomia,
                    R.drawable.gastronomia,
                    R.drawable.gastronomia,
                    R.drawable.gastronomia
            };
    String[] txtos = {
            "Mole Rojo",
            "Pan de cajita",
            "Pan de Royal",
            "Pan con Nieve",
            "Pan de canela"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_gastronomia);

       /* public void calorias(View view) {
            Intent intent = new Intent(this, menu.class);
            startActivity(intent);
        }*/
        TextView gastro= (TextView)findViewById(R.id.txtGastronomia);
        gastro.setText(textos.mensajes(textos.indice_lenguaje, 19));

        listaGastronomia = (ListView)findViewById(R.id.listadoGastro);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        listaGastronomia.setAdapter(adaptadorLista);

        listaGastronomia.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), molerojo.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), cajitas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), royal.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), panconnieve.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), pandecanela.class);
                        startActivity(intent);
                        break;

                }
            }
        });


    }
}
