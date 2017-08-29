package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_lugares_cercanos extends AppCompatActivity {

    ListView listaLugaresCer;
    Integer[] IdsImagenes =
            {
                    R.drawable.places,
                    R.drawable.places,
                    R.drawable.places,
                    R.drawable.places
            };
    String[] txtos = {
            "Ojo de agua de Chapa, Gro",
            "Grutas de Atlalac",
            "Tlajocotla",
            "Altmolonga"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_lugares_cercanos);

        TextView lugares= (TextView)findViewById(R.id.txtLugaresC);
        lugares.setText(textos.mensajes(textos.indice_lenguaje, 21));


        listaLugaresCer = (ListView)findViewById(R.id.listadoLugaresCer);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        listaLugaresCer.setAdapter(adaptadorLista);

        listaLugaresCer.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), ojodeaguachapa.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), grutasdeatlalac.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), tlajocotla.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), altmolonga.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
