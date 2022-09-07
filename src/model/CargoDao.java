package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CargoDao {

    Conexion conex = new Conexion();


    public CargoDao() throws Exception {

    }

    public ArrayList<Cargo> listaCargos(){
        ArrayList<Cargo> cargos = new ArrayList<Cargo>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Cargo");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                Cargo cargo = new Cargo();
                cargo.setCodigo(res.getInt("Codigo"));
                cargo.setNombre(res.getString("Nombre"));
                cargo.setCodigo_dependencia(res.getInt("Codigo_dependecia"));
                cargos.add(cargo);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return cargos;
    }
}
