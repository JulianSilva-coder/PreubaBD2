package model;

public class Empleado {

    int codigo;
    String nombre;
    int sueldo;
    int fecha_ingreso;
    int codigo_dependencia;
    int codigo_pension;
    int codigo_EPS;
    int codigo_ARL;
    int bonificacion;
    int transporte;

    public Empleado(int codigo, String nombre, int sueldo, int fecha_ingreso, int codigo_dependencia
            , int codigo_pension, int codigo_EPS, int codigo_ARL, int bonificacion, int transporte){
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.fecha_ingreso = fecha_ingreso;
        this.codigo_dependencia = codigo_dependencia;
        this.codigo_pension = codigo_pension;
        this.codigo_EPS = codigo_EPS;
        this.codigo_ARL = codigo_ARL;
        this.bonificacion = bonificacion;
        this.transporte = transporte;
    }

    public Empleado() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getCodigo_dependencia() {
        return codigo_dependencia;
    }

    public void setCodigo_dependencia(int codigo_dependencia) {
        this.codigo_dependencia = codigo_dependencia;
    }

    public int getCodigo_pension() {
        return codigo_pension;
    }

    public void setCodigo_pension(int codigo_pension) {
        this.codigo_pension = codigo_pension;
    }

    public int getCodigo_EPS() {
        return codigo_EPS;
    }

    public void setCodigo_EPS(int codigo_EPS) {
        this.codigo_EPS = codigo_EPS;
    }

    public int getCodigo_ARL() {
        return codigo_ARL;
    }

    public void setCodigo_ARL(int codigo_ARL) {
        this.codigo_ARL = codigo_ARL;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }

    public int getTransporte() {
        return transporte;
    }

    public void setTransporte(int transporte) {
        this.transporte = transporte;
    }
}
