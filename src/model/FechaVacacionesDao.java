package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FechaVacacionesDao {

    Conexion conex = new Conexion();


    public FechaVacacionesDao() throws Exception {
    }

    public ArrayList<FechaVacaciones> listaFechaVacaciones(){
        ArrayList<FechaVacaciones> fechaVacaciones = new ArrayList<FechaVacaciones>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Fecha_vacaciones");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                FechaVacaciones fechaVacacion = new FechaVacaciones();
                fechaVacacion.setCodigo(res.getInt("Codigo"));
                fechaVacacion.setInicio(res.getDate("Inicio"));
                fechaVacacion.setFin(res.getDate("Fin"));
                fechaVacacion.setNum_dias_vacaciones(res.getInt("Num_dias_vacaciones"));
                fechaVacaciones.add(fechaVacacion);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return fechaVacaciones;
    }
}
