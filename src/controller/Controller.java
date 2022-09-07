package controller;

import model.C1;
import model.Conexion;
import view.Ventana_Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controller implements ActionListener {

    private Ventana_Principal principal;
    private Conexion conexion;
    public Controller() throws Exception {
        principal = new Ventana_Principal();
        conexion = new Conexion();
        asignarOyentes();
    }


    private void asignarOyentes() {
        principal.getInicio().getBoton1().addActionListener(this);
        principal.getRegistro().getBoton1().addActionListener(this);
        principal.getRegistro().getBoton2().addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();

        if(comando.equals("InciarSesion")){
            principal.getInicio().setVisible(false);
            principal.getRegistro().setVisible(true);
            JOptionPane.showMessageDialog(principal,"Selecciona la opcion que Deseas");
        } else if (comando.equals("Principal")) {
            principal.getInicio().setVisible(true);
            principal.getRegistro().setVisible(false);
        }
    }
}
