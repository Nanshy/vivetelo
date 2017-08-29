package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class splashTelo extends AppCompatActivity {

    private long splashRetraso=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_telo);

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Intent nuevoLayout;
                nuevoLayout= new Intent(splashTelo.this, inicio.class);

                startActivity(nuevoLayout);
                splashTelo.this.finish();
            }
        };

        Timer timer = new Timer();
        timer.schedule(task, splashRetraso);

    }

}
