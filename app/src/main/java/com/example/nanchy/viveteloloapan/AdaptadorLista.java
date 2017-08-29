package com.example.nanchy.viveteloloapan;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorLista extends ArrayAdapter<String>
{
    private final Activity contexto;
    private final String[] textos;
    private final Integer[] imgsId;
    public AdaptadorLista(Activity contexto, String[] textos, Integer[] imgsId)
    {
        super(contexto, R.layout.activity_fila_tabla, textos);
        this.contexto = contexto;
        this.textos = textos;
        this.imgsId = imgsId;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = contexto.getLayoutInflater();
        View filaVista = inflater.inflate(R.layout.activity_fila_tabla, null, true);

        TextView texto = (TextView) filaVista.findViewById(R.id.txt);
        texto.setText(textos[position]);

        ImageView imagen = (ImageView) filaVista.findViewById(R.id.img);
        imagen.setImageResource(imgsId[position]);
        return filaVista;
    }
}