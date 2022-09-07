package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DependenciaDao {

    Conexion conex = new Conexion();


    public DependenciaDao() throws Exception {

    }

    public ArrayList<Dependencia> listaDependencias(){
        ArrayList<Dependencia> dependencias = new ArrayList<Dependencia>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Dependencia");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                Dependencia dependencia = new Dependencia();
                dependencia.setCodigo(res.getInt("Codigo"));
                dependencia.setNombre(res.getString("Nombre"));
                dependencias.add(dependencia);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return dependencias;
    }
}
