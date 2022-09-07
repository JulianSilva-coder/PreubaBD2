package model;

import java.util.Date;

public class FechaVacaciones {

    int codigo;
    Date inicio;
    Date fin;
    int num_dias_vacaciones;

    public FechaVacaciones(int codigo, Date inicio, Date fin, int num_dias_vacaciones) {
        this.codigo = codigo;
        this.inicio = inicio;
        this.fin = fin;
        this.num_dias_vacaciones = num_dias_vacaciones;
    }

    public FechaVacaciones() {

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

    public int getNum_dias_vacaciones() {
        return num_dias_vacaciones;
    }

    public void setNum_dias_vacaciones(int num_dias_vacaciones) {
        this.num_dias_vacaciones = num_dias_vacaciones;
    }
}
