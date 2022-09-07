package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DiasNoTrabajadosDao {

    Conexion conex = new Conexion();


    public DiasNoTrabajadosDao() throws Exception {

    }

    public ArrayList<DiasNoTrabajados> listaDiasNoTrabajados(){
        ArrayList<DiasNoTrabajados> diasnotrabajados = new ArrayList<DiasNoTrabajados>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Dias_no_trabajados");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                DiasNoTrabajados diasnotrabajado = new DiasNoTrabajados();
                diasnotrabajado.setCodigo(res.getInt("Codigo"));
                diasnotrabajado.setNovedad_incapacidad(res.getString("Novedad_incapacidad"));
                diasnotrabajado.setNovedad_vacaciones(res.getString("Novedad_vacaciones"));
                diasnotrabajado.setNum_dias_no_trabajados(res.getInt("num_dias_no_trabajados"));
                diasnotrabajados.add(diasnotrabajado);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return diasnotrabajados;
    }
}
