package com.example.nanchy.viveteloloapan;

import android.content.Context;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nanchy.viveteloloapan.BD_Normal.ConexionEstatica;
import com.example.nanchy.viveteloloapan.BD_Normal.MySQL_Server;
import com.example.nanchy.viveteloloapan.BD_Normal.SesionActual;

import java.sql.ResultSet;

public class Comentarios extends AppCompatActivity {
    private LinearLayout lytComentarios;
    private EditText edtxComentar;
    private MySQL_Server conexion = ConexionEstatica.Server();

    private CountDownTimer ct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);
        lytComentarios = (LinearLayout) findViewById(R.id.lytComentarios);
        edtxComentar = (EditText) findViewById(R.id.edtxComentar);
        ct= new CountDownTimer(20000,10000) {
            @Override
            public void onTick(long millisUntilFinished) {
                CargarComentarios();
            }

            @Override
            public void onFinish() {
                ct.start();
            }
        }.start();

    }

    public void AgregarMensaje(String mensaje) {
        TextView txt = new TextView(getApplicationContext());
        txt.setText(mensaje);
        txt.setTextColor(Color.WHITE);
        txt.setBackgroundColor(Color.argb(100, 0, 0, 0));
        txt.setPadding(5, 5, 5, 5);
        txt.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        lytComentarios.addView(txt);
    }

    public void CargarComentarios() {
        try {
            if (lytComentarios.getChildCount() >= 0) lytComentarios.removeAllViews();
        } catch (Exception error) {
            Toast.makeText(getApplicationContext(), "ERROR: " + error.getMessage(), Toast.LENGTH_LONG).show();
        }

        try {
            ResultSet rs = conexion.ComentariosEntre(SesionActual.IdUsuario, 1);
            while (rs.next()) {
                TextView txt = new TextView(getApplicationContext());
                txt.setText("[" + rs.getString(2) + "]\n" + rs.getString(3));
                txt.setTextColor(Color.WHITE);
                txt.setBackgroundColor(Color.argb(100, 0, 0, 0));
                txt.setPadding(10, 5, 10, 5);
                txt.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                lytComentarios.addView(txt);
            }
            rs.close();
            conexion.strs.close();
        } catch (Exception error) {
            Toast.makeText(getApplicationContext(), "ERROR: " + error.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public void enviarComentario(View v) {
        String comentario = edtxComentar.getText().toString();
        if (comentario.trim().length() > 0) {
            conexion.RegistrarComentario(comentario, SesionActual.IdUsuario, 1);
            edtxComentar.setText("");

            InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
        }
        CargarComentarios();
    }
}
