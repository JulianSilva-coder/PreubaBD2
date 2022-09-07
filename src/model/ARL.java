package model;

public class ARL {
    int codigo;
    String nombre;

    public ARL(int codigo,String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public ARL() {

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
