package com.example.nanchy.viveteloloapan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nanchy.viveteloloapan.BD_Normal.ConexionEstatica;
import com.example.nanchy.viveteloloapan.BD_Normal.MySQL_Server;

public class RegistrarUsuario extends AppCompatActivity {

    private EditText edtxNombreReg;
    private EditText edtxCorreoReg;
    private EditText edtxContrasenaReg;

    private TextView txtvIrSesion;

    private MySQL_Server conexion = ConexionEstatica.Server();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        edtxNombreReg = (EditText)findViewById(R.id.edtxNombreReg);
        edtxCorreoReg = (EditText)findViewById(R.id.edtxCorreoReg);
        edtxContrasenaReg = (EditText)findViewById(R.id.edtxContrasenaReg);

        TextView textView = (TextView)findViewById(R.id.txtvIrSesion);
        textView.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(RegistrarUsuario.this, SesionUsuario.class);
                startActivity(intent);
            }
        });
    }

    public void btnRegistrarClick(View view)
    {
        String nombre = edtxNombreReg.getText().toString();
        String correo = edtxCorreoReg.getText().toString();
        String clave = edtxContrasenaReg.getText().toString();

        if (!conexion.ExisteNombreCorreo(nombre, correo))
        {
            conexion.RegistrarUsuario(nombre, correo, clave);
            if (conexion.ERROR_ACTUAL != null)
                Toast.makeText(getApplicationContext(), "Hubo un problema cuando te estabas registrando.", Toast.LENGTH_LONG).show();
            else
            {
                Toast.makeText(getApplicationContext(), "Te has registrado con exito", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, SesionUsuario.class);
                startActivity(intent);
            }
        }
        else Toast.makeText(getApplicationContext(), "El usuario/correo electronico que has escrito ya existen, escribe otros.", Toast.LENGTH_LONG).show();
    }

    public void txtvIrSesionClick(View view)
    {
        Intent intent = new Intent(this, SesionUsuario.class);
        startActivity(intent);
    }
}
