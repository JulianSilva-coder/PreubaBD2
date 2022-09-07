package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FechaIncapacidadDao {

    Conexion conex = new Conexion();


    public FechaIncapacidadDao() throws Exception {

    }

    public ArrayList<FechaIncapacidad> listaFechaIncapacidades(){
        ArrayList<FechaIncapacidad> fechaIncapacidades = new ArrayList<FechaIncapacidad>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Fecha_incapacidad");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                FechaIncapacidad fechaIncapacidad = new FechaIncapacidad();
                fechaIncapacidad.setCodigo(res.getInt("Codigo"));
                fechaIncapacidad.setInicio(res.getString("Inicio"));
                fechaIncapacidad.setFin(res.getString("Fin"));
                fechaIncapacidad.setNum_dias_incapacidad_mes(res.getInt("Num_dias_incapacidad_mes"));
                fechaIncapacidades.add(fechaIncapacidad);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return fechaIncapacidades;
    }
}
