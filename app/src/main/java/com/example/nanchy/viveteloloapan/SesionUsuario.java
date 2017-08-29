package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nanchy.viveteloloapan.BD_Normal.ConexionEstatica;
import com.example.nanchy.viveteloloapan.BD_Normal.MySQL_Server;


public class SesionUsuario extends AppCompatActivity {
    private EditText edtxCorreo;
    private EditText edtxContrasena;

    private MySQL_Server conexion;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion_usuario);

        try
        {
            if(Build.VERSION.SDK_INT > 9)
            {
                StrictMode.ThreadPolicy t = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(t);
            }
            conexion = ConexionEstatica.Server();
            if (conexion.ERROR_ACTUAL != null) Toast.makeText(getApplicationContext(), conexion.ERROR_ACTUAL, Toast.LENGTH_LONG).show();
        }
        catch(Exception error)
        {
            Toast.makeText(getApplicationContext(),error.getMessage(), Toast.LENGTH_LONG).show();

        }

        TextView textView = (TextView)findViewById(R.id.txtvIrRegistro);
        textView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {

                Intent intent = new Intent(SesionUsuario.this, RegistrarUsuario.class);
                startActivity(intent);
            }
        });

        edtxCorreo = (EditText)findViewById(R.id.edtxCorreo);
        edtxContrasena = (EditText)findViewById(R.id.edtxContrasena);
    }

    public void sesionar(View v)
    {
        String correo = edtxCorreo.getText().toString();
        String clave = edtxContrasena.getText().toString();
        if (conexion.AcreditarSesion(correo, clave))
        {
            if (conexion.ERROR_ACTUAL != null)
                Toast.makeText(getApplicationContext(), "Hubo un problema cuando te estabas registrando.", Toast.LENGTH_LONG).show();
            else
            {
                edtxCorreo.setText("");
                edtxContrasena.setText("");
                AbrirSiguienteVentana();
                Toast.makeText(getApplicationContext(), "Sesion iniciada con exito!", Toast.LENGTH_LONG).show();
            }
        }
        else Toast.makeText(getApplicationContext(), "El correo/contraseña son incorrectos.", Toast.LENGTH_LONG).show();
    }

    public void AbrirSiguienteVentana()
    {
        Intent intent = new Intent(this, servicios.class);
        startActivity(intent);
    }
}