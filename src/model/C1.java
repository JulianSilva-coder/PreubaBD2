package model;

import java.util.ArrayList;

public class C1 {
    private String nombre;
    private String dependencia;
    private String cargo;
    private String EPS;
    private int num_dias_incapacidad_mes;
    private String fch_inicio;
    private String fch_fin;


    public C1(String nombre, String dependencia, String cargo, String EPS, int num_dias_incapacidad_mes
            , String fch_inicio, String fch_fin)  {
        this.nombre = nombre;
        this.dependencia = dependencia;
        this.cargo = cargo;
        this.EPS = EPS;
        this.num_dias_incapacidad_mes = num_dias_incapacidad_mes;
        this.fch_inicio = fch_inicio;
        this.fch_fin = fch_fin;
    }

    public C1() {

    }

    public ArrayList<C1> Consulta1() throws Exception {
        ArrayList<C1> consultas = new ArrayList<C1>();
        EmpleadoDao empleadoDao = new EmpleadoDao();
        ArrayList<Empleado> empleados = empleadoDao.listaEmpleados();
        DependenciaDao dependenciaDao = new DependenciaDao();
        ArrayList<Dependencia> dependencias = dependenciaDao.listaDependencias();
        CargoDao cargoDao = new CargoDao();
        ArrayList<Cargo> cargos = cargoDao.listaCargos();
        EPSDao epsDao = new EPSDao();
        ArrayList<EPS> eps = epsDao.listaEPSs();
        FechaIncapacidadDao fechaIncapacidadDao = new FechaIncapacidadDao();
        ArrayList<FechaIncapacidad> fechaIncapacidades = fechaIncapacidadDao.listaFechaIncapacidades();
        for (int i =0; i <= empleados.size(); i++){
            C1 consulta = new C1();
            consulta.setNombre(empleados.get(i).getNombre());
            for (int k =0; k<= fechaIncapacidades.size(); k++){
                if (empleados.get(i).getCodigo() == fechaIncapacidades.get(k).getCodigo()){
                    if (fechaIncapacidades.get(k).getFin().equals(fechaIncapacidades.get(k).getInicio())){
                        i++;
                        break;
                        }else{
                        consulta.setNum_dias_incapacidad_mes(fechaIncapacidades.get(k).getNum_dias_incapacidad_mes());
                        consulta.setFch_inicio(fechaIncapacidades.get(k).getInicio());
                        consulta.setFch_fin(fechaIncapacidades.get(k).getFin());
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
                                for (int j = 0; j <= eps.size(); j++) {
                                    if (empleados.get(i).getCodigo_EPS() == eps.get(j).getCodigo()) {
                                        consulta.setEPS(eps.get(j).getNombre());
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

    public String getEPS() {
        return EPS;
    }

    public void setEPS(String EPS) {
        this.EPS = EPS;
    }

    public int getNum_dias_incapacidad_mes() {
        return num_dias_incapacidad_mes;
    }

    public void setNum_dias_incapacidad_mes(int num_dias_incapacidad_mes) {
        this.num_dias_incapacidad_mes = num_dias_incapacidad_mes;
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
