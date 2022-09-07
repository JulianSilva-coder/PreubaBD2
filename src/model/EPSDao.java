package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EPSDao {

    Conexion conex = new Conexion();


    public EPSDao() throws Exception {

    }

    public ArrayList<EPS> listaEPSs(){
        ArrayList<EPS> epss = new ArrayList<EPS>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM EPS");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                EPS eps = new EPS();
                eps.setCodigo(res.getInt("Codigo"));
                eps.setNombre(res.getString("Nombre"));
                epss.add(eps);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return epss;
    }
}
