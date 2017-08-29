package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class lista_agenda extends AppCompatActivity {

    ListView listaAgenda;
    Integer[] IdsImagenes =
            {
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda,
                    R.drawable.agenda
            };
    String[] txtos = {
            "ENERO",
            "FEBRERO",
            "MARZO",
            "ABRIL",
            "MAYO",
            "JUNIO",
            "JULIO",
            "AGOSTO",
            "SEPTIEMBRE",
            "OCTUBRE",
            "NOVIEMBRE",
            "DICIEMBRE",
    };

    String[] txtos2 = {
            "JANUARY",
            "FEBRUARY",
            "MARCH",
            "APRIL",
            "MAY",
            "JUNE",
            "JULY",
            "AUGUST",
            "SEPTEMBER",
            "OCTOBER",
            "NOVEMBER",
            "DECEMBER",
    };

    String[] txtos3 = {
            "JANVIER",
            "FÈVRIER",
            "MARE",
            "AVRIL",
            "MAI",
            "JUIN",
            "JUILLET",
            "AOÙT",
            "SEPTEMBRE",
            "OCTOBRE",
            "NOVEMBRE",
            "DECEMBRE",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_agenda);

        TextView agenda= (TextView)findViewById(R.id.txtAgenda);
        agenda.setText(textos.mensajes(textos.indice_lenguaje, 20));


        listaAgenda = (ListView)findViewById(R.id.listadoAgenda);

        AdaptadorLista adaptadorLista = null;
        if (textos.indice_lenguaje == 0) adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        else if (textos.indice_lenguaje == 1) adaptadorLista = new AdaptadorLista(this, txtos2, IdsImagenes );
        else if (textos.indice_lenguaje == 2) adaptadorLista = new AdaptadorLista(this, txtos3, IdsImagenes );
        listaAgenda.setAdapter(adaptadorLista);

        listaAgenda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position) {
                    case 0:
                        intent = new Intent(getBaseContext(), enero.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), febrero.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), marzo.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), abril.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), mayo.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getBaseContext(), junio.class);
                        startActivity(intent);
                        break;
                    case 6:
                        intent = new Intent(getBaseContext(), julio.class);
                        startActivity(intent);
                        break;
                    case 7:
                        intent = new Intent(getBaseContext(), agosto.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(getBaseContext(), septiembre.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(getBaseContext(), octubre.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(getBaseContext(), noviembre.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(getBaseContext(), diciembre.class);
                        startActivity(intent);
                        break;
                }
            }
        });

    }
}
