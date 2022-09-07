package model;

public class Cargo {

    int codigo;
    String nombre;
    int codigo_dependencia;

    public Cargo(int codigo, String nombre, int codigo_dependencia){
        this.codigo =codigo;
        this.nombre = nombre;
        this.codigo_dependencia = codigo_dependencia;
    }

    public Cargo() {

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

    public int getCodigo_dependencia() {
        return codigo_dependencia;
    }

    public void setCodigo_dependencia(int codigo_dependencia) {
        this.codigo_dependencia = codigo_dependencia;
    }
}
