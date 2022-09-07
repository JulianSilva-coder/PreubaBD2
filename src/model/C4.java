package model;

import java.util.ArrayList;

public class C4 {
    private String nombre;
    private int bonficacion;
    private int transporte;
    private String cargo;
    private String dependencia;


    public C4(String nombre, int bonficacion, int transporte, String cargo
            , String dependencia)  {
        this.nombre = nombre;
        this.bonficacion = bonficacion;
        this.transporte = transporte;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    public C4() {

    }

    public ArrayList<C4> Consulta4() throws Exception {
        ArrayList<C4> consultas = new ArrayList<C4>();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        ArrayList<Empleado> empleados = empleadoDao.listaEmpleados();
        NovedadDao novedadDao = new NovedadDao();
        ArrayList<Novedad> novedades = novedadDao.listaNovedades();
        DependenciaDao dependenciaDao = new DependenciaDao();
        ArrayList<Dependencia> dependencias = dependenciaDao.listaDependencias();
        CargoDao cargoDao = new CargoDao();
        ArrayList<Cargo> cargos = cargoDao.listaCargos();
        DiasNoTrabajadosDao diasNoTrabajadosDao = new DiasNoTrabajadosDao();
        ArrayList<DiasNoTrabajados> diasNoTrabajados = diasNoTrabajadosDao.listaDiasNoTrabajados();
        FechaVacacionesDao fechaVacacionesDao = new FechaVacacionesDao();
        ArrayList<FechaVacaciones> fechaVacaciones = fechaVacacionesDao.listaFechaVacaciones();
        for (int i =0; i <= empleados.size(); i++){
            C4 consulta = new C4();
            for (int j=0; j<= novedades.size(); j++){
                if (empleados.get(i).getCodigo() == novedades.get(j).getCodigo()){
                    for (int k=0; k<= diasNoTrabajados.size(); k++){
                        if (novedades.get(j).getCodigo_no_trabajo() == diasNoTrabajados.get(k).getCodigo()){
                            for (int m = 0; m <= 4; m++) {
                                if (empleados.get(i).getCodigo_dependencia() == dependencias.get(m).getCodigo()) {
                                    consulta.setDependencia(dependencias.get(m).getNombre());
                                    for (int l = 0; l <= cargos.size(); l++) {
                                        if (dependencias.get(m).getCodigo() == cargos.get(l).getCodigo_dependencia()) {
                                            consulta.setCargo(cargos.get(l).getNombre());
                                        }
                                    }
                                }
                            }
                        }
                    }
            }
            }
            consulta.setNombre(empleados.get(i).getNombre());
            consulta.setBonficacion(empleados.get(i).getBonificacion());
            consulta.setTransporte(empleados.get(i).getTransporte());
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
