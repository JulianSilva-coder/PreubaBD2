package model;

import java.util.Date;

public class FechaIncapacidad {

    int codigo;
    Date inicio;
    Date fin;
    int num_dias_incapacidad_mes;

    public FechaIncapacidad(int codigo, Date inicio, Date fin, int num_dias_incapacidad_mes) {
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

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getNum_dias_incapacidad_mes() {
        return num_dias_incapacidad_mes;
    }

    public void setNum_dias_incapacidad_mes(int num_dias_incapacidad_mes) {
        this.num_dias_incapacidad_mes = num_dias_incapacidad_mes;
    }
}
