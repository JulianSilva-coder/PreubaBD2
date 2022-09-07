package model;

public class EPS {
    int codigo;
    String nombre;

    public EPS(int codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public EPS() {

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

}
