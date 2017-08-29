package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);


    }
    public void clicComentarios(View view)
    {
        Intent intent= new Intent(this, Comentarios.class);
        startActivity(intent);
    }
    public void clicChat(View view)
    {
        Intent intent= new Intent(this, chat.class);
        startActivity(intent);
    }
}
