package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_alojamiento extends AppCompatActivity {

    ListView listaAloj;
    Integer[] IdsImagenes =
            {
                    R.drawable.hotels,
                    R.drawable.hotels,
                    R.drawable.hotels,
                    R.drawable.hotels,
                    R.drawable.hotels,
                    R.drawable.hotels
            };
    String[] txtos = {
            "Hotel Aldama",
            "Hotel Las palmas",
            "Hotel Independencia",
            "Hotel Teloloapan",
            "Hotel San valentin",
            "Hotel San Andrès"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alojamiento);

        TextView hotels= (TextView)findViewById(R.id.txtAloja);
        hotels.setText(textos.mensajes(textos.indice_lenguaje, 17));


        listaAloj = (ListView)findViewById(R.id.listadoAlojamiento);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        listaAloj.setAdapter(adaptadorLista);

        listaAloj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), hotelAldama.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), hotelLasPalmas.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), hotelndependencia.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), hotelTeloloapan.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), hotelSanValentin.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getBaseContext(), hotelSaAndres.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
