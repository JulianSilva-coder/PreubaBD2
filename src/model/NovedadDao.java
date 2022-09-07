package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class NovedadDao {

    Conexion conex = new Conexion();


    public NovedadDao() throws Exception {
    }

    public ArrayList<Novedad> listaNovedades(){
        ArrayList<Novedad> novedades = new ArrayList<Novedad>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Novedad");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                Novedad novedad = new Novedad();
                novedad.setCodigo(res.getInt("Codigo"));
                novedad.setFecha_ingreso(res.getInt("Fecha_ingreso"));
                novedad.setNum_dias_trabajados_mes(res.getInt("Num_dias_trabajados_mes"));
                novedad.setCodigo_no_trabajo(res.getInt("Codigo_no_trabajado"));
                novedades.add(novedad);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return novedades;
    }
}
