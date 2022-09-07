package model;

import java.util.ArrayList;

public class C3 {
    private String nombre;
    private int bonficacion;
    private int transporte;
    private String cargo;
    private String dependencia;


    public C3(String nombre, int bonficacion, int transporte, String cargo
            , String dependencia)  {
        this.nombre = nombre;
        this.bonficacion = bonficacion;
        this.transporte = transporte;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    public C3() {

    }

    public ArrayList<C3> Consulta3() throws Exception {
        ArrayList<C3> consultas = new ArrayList<C3>();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        ArrayList<Empleado> empleados = empleadoDao.listaEmpleados();
        DependenciaDao dependenciaDao = new DependenciaDao();
        ArrayList<Dependencia> dependencias = dependenciaDao.listaDependencias();
        CargoDao cargoDao = new CargoDao();
        ArrayList<Cargo> cargos = cargoDao.listaCargos();
        EPSDao epsDao = new EPSDao();
        ArrayList<EPS> eps = epsDao.listaEPSs();
        FechaVacacionesDao fechaVacacionesDao = new FechaVacacionesDao();
        ArrayList<FechaVacaciones> fechaVacaciones = fechaVacacionesDao.listaFechaVacaciones();
        for (int i =0; i <= empleados.size(); i++){
            C3 consulta = new C3();
            consulta.setNombre(empleados.get(i).getNombre());
            consulta.setBonficacion(empleados.get(i).getBonificacion());
            consulta.setTransporte(empleados.get(i).getTransporte());
            for (int j = 0; j <= 4; j++) {
                if (empleados.get(i).getCodigo_dependencia() == dependencias.get(j).getCodigo()) {
                    consulta.setDependencia(dependencias.get(j).getNombre());
                    for (int l = 0; l <= cargos.size(); l++) {
                        if (dependencias.get(j).getCodigo() == cargos.get(l).getCodigo_dependencia()) {
                            consulta.setCargo(cargos.get(l).getNombre());
                        }
                    }
                }
            }
            consultas.add(consulta);
        }

        return  consultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getBonficacion() {
        return bonficacion;
    }

    public void setBonficacion(int bonficacion) {
        this.bonficacion = bonficacion;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
}
