package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class EmpleadoDao {

    Conexion conex = new Conexion();


    public EmpleadoDao() throws Exception {

    }

    public ArrayList<Empleado> listaEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        try{
            PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM Empleado");
            ResultSet res = consulta.executeQuery();
            while (res.next()){
                Empleado empleado = new Empleado();
                empleado.setCodigo(res.getInt("Codigo"));
                empleado.setNombre(res.getString("Nombre"));
                empleado.setSueldo(res.getInt("Sueldo"));
                empleado.setFecha_ingreso(res.getInt("Fecha_ingreso"));
                empleado.setCodigo_dependencia(res.getInt("Codigo_dependencia"));
                empleado.setCodigo_pension(res.getInt("Codigo_pension"));
                empleado.setCodigo_EPS(res.getInt("Codigo_EPS"));
                empleado.setCodigo_ARL(res.getInt("Codigo_ARL"));
                empleado.setBonificacion(res.getInt("Bonificacion"));
                empleado.setTransporte(res.getInt("Transporte"));
                empleados.add(empleado);
            }
            res.close();
            consulta.close();
            conex.desconectar();

        }catch (Exception e){
            e.printStackTrace();
        }
        return empleados;
    }
}
