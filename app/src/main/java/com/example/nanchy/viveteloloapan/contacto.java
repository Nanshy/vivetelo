package com.example.nanchy.viveteloloapan;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.net.Uri;

public class contacto extends AppCompatActivity
{
    private Button btnUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

    }
    public void clicLlamar(View view)
    {
        try
        {
            startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:+5217361092832")));
        }
        catch (SecurityException erro) {
        }

    }



  /*  public void llamar(View view) {
        //Intent intent = new Intent(this, menu.class);
        //startActivity(intent);
        //Intent intent = new Intent(Intent.ACTION_CALL_BUTTON, Uri.parse("tel:+5217331058613"));
        //startActivity(intent);

        btURL = (Button) findViewById(R.id.btURL);
        btURL.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
            	Intent browserIntent =
            		new Intent(Intent.ACTION_VIEW,
            				Uri.parse("http://www.ajpdsoft.com"));
            	startActivity(browserIntent);
            }
        });


    }*/

}
