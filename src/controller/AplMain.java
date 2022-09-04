package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class AplMain {
    public static void main(String [] args){
        Controller controller = new Controller();

        /**
         * Conexion de PostgreSQL
         */
        String usuario = "postgres";
        String pass = "141201";
        String url = "jdbc:postgresql://localhost:5432/PruebaBD2";

        try{
            Connection conexion = DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion Exitosa");
        }catch (Exception e){
            System.out.println(e.getMessage() + " Arreglalo");
        }
    }
}
