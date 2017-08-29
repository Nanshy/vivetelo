package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class listaMonumentos extends AppCompatActivity {

    ListView listaMon;
    Integer[] IdsImagenes =
    {
        R.drawable.monu,
        R.drawable.monu,
            R.drawable.monu,
            R.drawable.monu,
            R.drawable.monu,
            R.drawable.monu
    };
    String[] txtos = {
            "Tecampana",
            "Museo",
            "Castillo",
            "Abrazo de Acatempan",
            "Parroquia Santa Maria de la Asuncion",
            "Parroquia de Mexicapan"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_monumentos);

        TextView monu= (TextView)findViewById(R.id.txtMonumentos);
        monu.setText(textos.mensajes(textos.indice_lenguaje, 15));



        listaMon = (ListView)findViewById(R.id.listadoMonumentos);

        AdaptadorLista adaptadorLista = new AdaptadorLista(this, txtos, IdsImagenes );
        listaMon.setAdapter(adaptadorLista);

        listaMon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Intent intent;
                switch (position)
                {
                    case 0:
                        intent = new Intent(getBaseContext(), tecampana.class);
                        startActivity(intent);
                        Toast tw = Toast.makeText(getApplicationContext(), "Toca la piedra, y escucha", Toast.LENGTH_LONG);
                        View vw = tw.getView();
                        vw.setBackgroundColor(Color.argb(150,249,19,19));
                        tw.show();
                        break;
                    case 1:
                        intent = new Intent(getBaseContext(), museo.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(getBaseContext(), castillo.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(getBaseContext(), abrazo.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(getBaseContext(), santamaria.class);
                        startActivity(intent);
                        break;
                    case 5:
                        intent = new Intent(getBaseContext(), iglesiaMexicapan.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
