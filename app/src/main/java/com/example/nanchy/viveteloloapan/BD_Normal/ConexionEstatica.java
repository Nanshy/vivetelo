package com.example.nanchy.viveteloloapan.BD_Normal;

/**
 * Created by Nanchita n_n on 20/04/2016.
 */

public class ConexionEstatica
{
    private static MySQL_Server svr = null;
    public static MySQL_Server Server()
    {
        if (svr == null) svr = new MySQL_Server();
        return svr;
    }
}
