package model;

public class Novedad {

    int codigo;
    int fecha_ingreso;
    int num_dias_trabajados_mes;
    int codigo_no_trabajo;

    public Novedad(int codigo, int fecha_ingreso, int num_dias_trabajados_mes,int codigo_no_trabajo){
        this.codigo = codigo;
        this.fecha_ingreso = fecha_ingreso;
        this.num_dias_trabajados_mes = num_dias_trabajados_mes;
        this.codigo_no_trabajo = codigo_no_trabajo;
    }

    public Novedad() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getNum_dias_trabajados_mes() {
        return num_dias_trabajados_mes;
    }

    public void setNum_dias_trabajados_mes(int num_dias_trabajados_mes) {
        this.num_dias_trabajados_mes = num_dias_trabajados_mes;
    }

    public int getCodigo_no_trabajo() {
        return codigo_no_trabajo;
    }

    public void setCodigo_no_trabajo(int codigo_no_trabajo) {
        this.codigo_no_trabajo = codigo_no_trabajo;
    }
}
