package model;

import java.sql.*;

public class Conexion {

    /**
     * Conexion de PostgreSQL
     */
    private String usuario = "postgres";
    private String pass = "141201";
    private String url = "jdbc:postgresql://localhost:5432/Tienda";
    private Connection conexion = null;
    private Statement sentencia = null;

    public Conexion() throws Exception {
        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Arreglalo");
        }

    }

    public Connection getConnection() {
        return conexion;
    }

    public void desconectar() {
        conexion = null;
    }
/**
    private ResultSet consultas(String strSQL) throws Exception {
        ResultSet resultado;
        try {
            conectar();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(strSQL);
            return resultado;
        } catch (Exception e) {
            throw new Exception("Error al consultar la base de datos");
        }
        }
**/
}
