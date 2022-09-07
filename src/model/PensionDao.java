package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PensionDao {

    Conexion conex = new Conexion();


    public PensionDao() throws Exception {

    }

    public ArrayList<Pension> listaPensiones(){
        ArrayList<Pension> pensiones = new ArrayList<Pension>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Pension");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                Pension pension = new Pension();
                pension.setCodigo(res.getInt("Codigo"));
                pension.setNombre(res.getString("Nombre"));
                pensiones.add(pension);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return pensiones;
    }
}
