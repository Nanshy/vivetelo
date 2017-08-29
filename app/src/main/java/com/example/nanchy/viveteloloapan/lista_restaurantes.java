package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_restaurantes extends AppCompatActivity {
    ListView listaRes;
    Integer[] IdsImagenes =
            {
                    R.drawable.rest,
                    R.drawable.rest,
                    R.drawable.rest,
                    R.drawable.rest,
                    R.drawable.rest,
                    R.drawable.rest
            };
    String[] titulos = {
            "Alcatrases",
            "Mi tierra",
            "Las brisas",
            "El cazador",
            "Italian Coffee",
            "Tiempo Life Coffee"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);

        TextView res= (TextView)findViewById(R.id.txtRes);
        res.setText(textos.mensajes(textos.indice_lenguaje, 16));


        listaRes = (ListView)findViewById(R.id.listadoRestaurantes);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, titulos, IdsImagenes );
        listaRes.setAdapter(adaptadorLista);

        listaRes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), restaurantAlcatrases.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), restauranteMiTierra.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), restauranteLasBrisas.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), restaurantElcazador.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), italianCoffee.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getBaseContext(), tiempoLifeCoffee.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
