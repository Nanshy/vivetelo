package com.example.nanchy.viveteloloapan.BD_Normal;

/**
 * Created by Nanchita n_n on 20/04/2016.
 */
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL_Server
{
    public String ERROR_ACTUAL = null;
    private Connection conexionMySQL;

    /*
    Server: sql3.freemysqlhosting.net
Name bd: sql3116090
Username: sql3116090
Password: N2uRUzvGZe
Port number: 3306

nueva bd
Server: sql3.freemysqlhosting.net
Name: sql3116585
Username: sql3116585
Password: 4SMGmDZ8tA
Port number: 3306

Server: sql3.freemysqlhosting.net
Name: sql3118651
Username: sql3118651
Password: wrrDF9vMHC
Port number: 3306

Server: sql5.freemysqlhosting.net
Name: sql5120107
Username: sql5120107
Password: xMkFNwN8zq
Port number: 3306

    * */
    private String SERVIDOR = "sql5.freemysqlhosting.net";
    private String PUERTO = "3306";
    private String USUARIO = "sql5120107";
    private String CONTRASENA = "xMkFNwN8zq";
    private String BD = "sql5120107";
    public MySQL_Server()
    {
        conectarBDMySQL(SERVIDOR, PUERTO, USUARIO, CONTRASENA, BD);
    }
    public Boolean conectarBDMySQL (String ip, String puerto, String usuario, String contrasena, String catalogo)
    {
        if (conexionMySQL == null)
        {
            String URL = "";
            if (catalogo != "") URL = "jdbc:mysql://" + ip + ":" +	puerto + "/" + catalogo;
            else URL = "jdbc:mysql://" + ip + ":" + puerto;
            if (usuario != "" & contrasena != "" & ip != "" & puerto != "")
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    conexionMySQL =	DriverManager.getConnection(URL, usuario, contrasena);
                    ERROR_ACTUAL = null;
                    return true;
                }
                catch (ClassNotFoundException e)
                {
                    ERROR_ACTUAL = e.getMessage();
                }
                catch (SQLException e)
                {
                    ERROR_ACTUAL = e.getMessage();
                }
            }
        }
        return false;
    }
    public  void RegistrarComentario(String comentario, int de, int para)
    {
        try
        {
            Statement st = conexionMySQL.createStatement();
            String insertar =  "INSERT INTO Comentarios(Mensaje, Fecha, DeUsuario, ParaUsuario) VALUES('" + comentario + "', NOW(), " + de + ", " + para + ");";
            st.executeUpdate(insertar);
            st.close();
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
    }
    public  void RegistrarChat(String mensaje, int idUsuario)
    {
        try
        {
            Statement st = conexionMySQL.createStatement();
            String insertar =  "INSERT INTO Chat(IdUsuario, Mensaje, Fecha) VALUES(" + idUsuario + ", '" + mensaje + "', now());";
            st.executeUpdate(insertar);
            st.close();
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
    }
    /* REGISTRANDO USUARIO NORMAL */
    public void RegistrarUsuario(String Nombre, String Correo, String ClaveAcceso)
    {
        try
        {
            Statement st = conexionMySQL.createStatement();
            String insertar = String.format("INSERT INTO Usuarios(Nombre, Correo, ClaveAcceso) VALUES('%s','%s','%s');", Nombre, Correo, ClaveAcceso);
            st.executeUpdate(insertar);
            st.close();
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
    }
    public boolean AcreditarSesion(String Correo, String ClaveAcceso)
    {
        boolean acreditado = false;
        try
        {
            Statement st = conexionMySQL.createStatement();
            String consulta = "SELECT * FROM Usuarios WHERE NivelPrivilegios=2 AND Correo='" + Correo + "' AND ClaveAcceso='" + ClaveAcceso + "';";
            ResultSet rs = st.executeQuery(consulta);

            while(rs.next())
            {
                SesionActual.IdUsuario = rs.getInt(1);
                SesionActual.Nombre = rs.getString(2);
                SesionActual.Correo = rs.getString(3);
                SesionActual.ClaveAcceso = rs.getString(4);
                SesionActual.NivelPrivilegios = rs.getInt(5);
                acreditado = true;
                break;
            }
            rs.close();
            st.close();
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
        return acreditado;
    }
    public boolean ExisteNombreCorreo(String Nombre, String Correo)
    {
        boolean existe = false;
        try
        {
            Statement st = conexionMySQL.createStatement();
            String insertar = String.format("SELECT * FROM Usuarios WHERE LOWER(Nombre)=LOWER('%s') OR LOWER(Correo)=LOWER('%s');", Nombre, Correo);
            ResultSet rs = st.executeQuery(insertar);

            while(rs.next())
            {
                existe = true;
                break;
            }
            rs.close();
            st.close();
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
        return existe;
    }
    public Statement strs;
    public ResultSet ComentariosEntre(int idUsuario1, int idUsuario2)
    {
        ResultSet rs = null;
        try
        {
            strs = conexionMySQL.createStatement();
            String consulta = "SELECT COM.Id, USR1.Nombre, COM.Mensaje, COM.DeUsuario, COM.ParaUsuario\n" +
                    "FROM Comentarios COM\n" +
                    "INNER JOIN Usuarios USR1 ON COM.DeUsuario = USR1.IdUsuario\n" +
                    "INNER JOIN Usuarios USR2 ON COM.ParaUsuario = USR2.IdUsuario\n" +
                    "WHERE (COM.DeUsuario=" + idUsuario1 + " AND COM.ParaUsuario=" + idUsuario2 + ") OR (COM.DeUsuario=" + idUsuario2 + " AND COM.ParaUsuario=" + idUsuario1 + ")\n" +
                    "ORDER BY COM.Id;";

            rs = strs.executeQuery(consulta);
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
        return rs;
    }

    public ResultSet Chats()
    {
        ResultSet rs = null;
        try
        {
            strs = conexionMySQL.createStatement();
            String consulta = "SELECT ch.IdChat, US.Nombre, ch.Mensaje, ch.Fecha FROM Chat ch INNER JOIN Usuarios US ON ch.IdUsuario= US.IdUsuario ORDER BY ch.IdChat;";

            rs = strs.executeQuery(consulta);
            ERROR_ACTUAL = null;
        }
        catch (Exception e)
        {
            ERROR_ACTUAL = e.getMessage();
        }
        return rs;
    }

}