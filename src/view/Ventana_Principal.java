package view;

import javax.swing.*;

public class Ventana_Principal extends JFrame {

    public Ventana_Inicio inicio;
    public Ventana_Registro registro;
    public Ventana_Principal(){
        setSize(1000, 700);
        setResizable(false);
        setTitle("Tienda");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        iniciar();
        setVisible(true);
    }

    private void iniciar() {
        inicio = new Ventana_Inicio();
        getContentPane().add(inicio);

        registro = new Ventana_Registro();
        getContentPane().add(registro);
    }

    public Ventana_Inicio getInicio() {
        return inicio;
    }

    public void setInicio(Ventana_Inicio inicio) {
        this.inicio = inicio;
    }

    public Ventana_Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Ventana_Registro registro) {
        this.registro = registro;
    }

}
