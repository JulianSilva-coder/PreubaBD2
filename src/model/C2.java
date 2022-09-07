package model;

import java.util.ArrayList;

public class C2 {
    private String nombre;
    private String dependencia;
    private String cargo;
    private int num_dias_vacaciones_mes;
    private String fch_inicio;
    private String fch_fin;


    public C2(String nombre, String dependencia, String cargo, int num_dias_vacaciones_mes
            , String fch_inicio, String fch_fin)  {
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.cargo = cargo;
        this.num_dias_vacaciones_mes = num_dias_vacaciones_mes;
        this.fch_inicio = fch_inicio;
        this.fch_fin = fch_fin;
    }

    public C2() {

    }

    public ArrayList<C2> Consulta2() throws Exception {
        ArrayList<C2> consultas = new ArrayList<C2>();
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
            C2 consulta = new C2();
            consulta.setNombre(empleados.get(i).getNombre());
            for (int k =0; k<= fechaVacaciones.size(); k++){
                if (empleados.get(i).getCodigo() == fechaVacaciones.get(k).getCodigo()){
                    if (fechaVacaciones.get(k).getFin().equals(fechaVacaciones.get(k).getInicio())){
                        i++;
                        break;
                    }else{
                        consulta.setNum_dias_vacaciones_mes(fechaVacaciones.get(k).getNum_dias_vacaciones());
                        consulta.setFch_inicio(fechaVacaciones.get(k).getInicio());
                        consulta.setFch_fin(fechaVacaciones.get(k).getFin());
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
                }
            }
        }
        return  consultas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNum_dias_vacaciones_mes() {
        return num_dias_vacaciones_mes;
    }

    public void setNum_dias_vacaciones_mes(int num_dias_vacaciones_mes) {
        this.num_dias_vacaciones_mes = num_dias_vacaciones_mes;
    }

    public String getFch_inicio() {
        return fch_inicio;
    }

    public void setFch_inicio(String fch_inicio) {
        this.fch_inicio = fch_inicio;
    }

    public String getFch_fin() {
        return fch_fin;
    }

    public void setFch_fin(String fch_fin) {
        this.fch_fin = fch_fin;
    }
}
