package com.example.nanchy.viveteloloapan.BD_Normal;

/**
 * Created by Nanchita n_n on 20/04/2016.
 */
public class SesionActual
{
    public static boolean Sesionado = false;

    public static int IdUsuario = 0;
    public static String Nombre = null;
    public static String Correo = null;
    public static String ClaveAcceso = null;
    public static int NivelPrivilegios = 0;


    public void LimpiarSesion()
    {
        IdUsuario = 0;
        Nombre = null;
        Correo = null;
        ClaveAcceso = null;
        NivelPrivilegios = 0;
        Sesionado = false;
    }
}