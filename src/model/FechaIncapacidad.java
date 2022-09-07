package model;

import java.util.Date;

public class FechaIncapacidad {

    int codigo;
    String inicio;
    String fin;
    int num_dias_incapacidad_mes;

    public FechaIncapacidad(int codigo, String inicio, String fin, int num_dias_incapacidad_mes) {
        this.codigo = codigo;
        this.inicio = inicio;
        this.fin = fin;
        this.num_dias_incapacidad_mes = num_dias_incapacidad_mes;
    }

    public FechaIncapacidad() {

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public int getNum_dias_incapacidad_mes() {
        return num_dias_incapacidad_mes;
    }

    public void setNum_dias_incapacidad_mes(int num_dias_incapacidad_mes) {
        this.num_dias_incapacidad_mes = num_dias_incapacidad_mes;
    }
}
