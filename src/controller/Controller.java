package controller;

import view.Ventana_Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private Ventana_Principal principal;
    public Controller(){
        principal = new Ventana_Principal();
        asignarOyentes();
    }

    private void asignarOyentes() {
        principal.getInicio().getBoton1().addActionListener(this);
        principal.getInicio().getBoton2().addActionListener(this);
        principal.getRegistro().getBoton1().addActionListener(this);
        principal.getRegistro().getBoton2().addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();

        if(comando.equals("CrearCuenta")){
            principal.getInicio().setVisible(false);
            principal.getRegistro().setVisible(true);
            JOptionPane.showMessageDialog(principal,"Por favor Ingresa un Correo Electronico y Contraseña");
        } else if (comando.equals("Principal")) {
            principal.getInicio().setVisible(true);
            principal.getRegistro().setVisible(false);
        }
    }
}
