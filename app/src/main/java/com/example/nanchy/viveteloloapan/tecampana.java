package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class tecampana extends AppCompatActivity
{

    private MediaPlayer mp;
    private ImageButton img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tecampana);

        img= (ImageButton) findViewById(R.id.imagensonido);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                      mp= MediaPlayer.create(tecampana.this, R.raw.piedra);
                      mp.start();
            }
        });

    }
    public void mas(View view)
    {
        Intent intent= new Intent(this, masfotos.class);
        startActivity(intent);
    }
}
