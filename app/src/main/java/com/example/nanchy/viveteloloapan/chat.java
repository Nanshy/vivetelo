package com.example.nanchy.viveteloloapan;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nanchy.viveteloloapan.BD_Normal.ConexionEstatica;
import com.example.nanchy.viveteloloapan.BD_Normal.MySQL_Server;
import com.example.nanchy.viveteloloapan.BD_Normal.SesionActual;

import java.sql.ResultSet;

public class chat extends AppCompatActivity {

    LinearLayout l1;
    EditText e1;

    private MySQL_Server conexion;
    private CountDownTimer ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        l1 = (LinearLayout) findViewById(R.id.layoutChat);
        e1 = (EditText) findViewById(R.id.edtxTextoEnviar);
        conexion= ConexionEstatica.Server();
        ct= new CountDownTimer(30000, 3000) {
            @Override
            public void onTick(long millisUntilFinished) {
                CargarChat();
            }

            @Override
            public void onFinish() {
                ct.start();

            }
        }.start();
    }

    public void enviarChat(View view)
    {
        String s8= e1.getText().toString();
        if (s8.trim().length() > 0)
        {
            conexion.RegistrarChat(s8, SesionActual.IdUsuario);
            e1.setText("");
            CargarChat();
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void CargarChat()
    {
        try
        {
            if(l1.getChildCount()>=0)
            {
                l1.removeAllViews();

            }
        }
        catch (Exception error)
        {
            Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
        }

        ResultSet rs;
        rs=null;
        try
        {
            rs= conexion.Chats();
            while (rs.next())
            {
                TextView t1= new TextView(this);
                t1.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                t1.setText("[" + rs.getString(2) + "]\n" + rs.getString(3));
                t1.setPadding(3,3,3,3);
                l1.addView(t1);
            }
        }
        catch (Exception error)
        {
            Toast.makeText(getApplicationContext(),error.getMessage(),Toast.LENGTH_LONG).show();
        }
    }
}
