package model;

public class DiasNoTrabajados {

    int codigo;
    String novedad_incapacidad;
    String novedad_vacaciones;
    int num_dias_no_trabajados;

    public DiasNoTrabajados(int codigo, String novedad_incapacidad, String novedad_vacaciones
            , int num_dias_no_trabajados){
        this.codigo = codigo;
        this.novedad_incapacidad = novedad_incapacidad;
        this.novedad_vacaciones = novedad_vacaciones;
        this.num_dias_no_trabajados = num_dias_no_trabajados;
    }

    public DiasNoTrabajados() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNovedad_incapacidad() {
        return novedad_incapacidad;
    }

    public void setNovedad_incapacidad(String novedad_incapacidad) {
        this.novedad_incapacidad = novedad_incapacidad;
    }

    public String getNovedad_vacaciones() {
        return novedad_vacaciones;
    }

    public void setNovedad_vacaciones(String novedad_vacaciones) {
        this.novedad_vacaciones = novedad_vacaciones;
    }

    public int getNum_dias_no_trabajados() {
        return num_dias_no_trabajados;
    }

    public void setNum_dias_no_trabajados(int num_dias_no_trabajados) {
        this.num_dias_no_trabajados = num_dias_no_trabajados;
    }
}
