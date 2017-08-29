package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ubicacionTelo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion_telo);
    }


    public void ubicacion(View view)
    {
        Intent intent= new Intent(this, Probando.class);
        startActivity(intent);
    }
}
