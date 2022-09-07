package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ARLDao {

    Conexion conex = new Conexion();


    public ARLDao() throws Exception {

    }

    public ArrayList<ARL> listaARLs(){
        ArrayList<ARL> arls = new ArrayList<ARL>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM ARL");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                ARL arl = new ARL();
                arl.setCodigo(res.getInt("Codigo"));
                arl.setNombre(res.getString("Nombre"));
                arls.add(arl);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return arls;
    }
}
