package view;

import javax.swing.*;
import java.awt.*;

public class Ventana_Inicio extends JPanel {

    private JLabel etiqueta1, etiqueta2, etiqueta3, foto, fondo;
    private JTextField barra1, barra2;
    private JButton boton1, boton2;

    public Ventana_Inicio() {
        setSize(1000, 700);
        setLayout(null);
        setBackground(Color.WHITE);
        IniciarComponentes();
        setVisible(true);
    }

    private void IniciarComponentes() {
        ImageIcon imagen = new ImageIcon("usuario.jpg");
        ImageIcon icon = new ImageIcon(imagen.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT));
        foto = new JLabel(icon);
        foto.setBounds(700, 180, 200,200);
        add(foto);

        etiqueta1 = new JLabel("Ingresa tu nombre completo");
        etiqueta1.setBounds(80,50,500,100);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta1);

        barra1 = new JTextField();
        barra1.setBounds(80, 150, 500, 50);
        barra1.setFont((new Font("Arial", Font.BOLD, 25)));
        add(barra1);

        etiqueta2 = new JLabel("Ingresa ID asociado");
        etiqueta2.setBounds(80,220,500,100);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta2);

        barra2 = new JTextField();
        barra2.setBounds(80, 320, 500, 50);
        barra2.setFont((new Font("Arial", Font.BOLD, 25)));
        add(barra2);

        boton1 = new JButton("Iniciar Sesion");
        boton1.setActionCommand("InciarSesion");
        boton1.setBounds(80, 430, 250,80);
        boton1.setFont((new Font("Arial", Font.BOLD, 15)));
        boton1.setBackground(Color.WHITE);
        add(boton1);

        ImageIcon imagen1 = new ImageIcon("fondo.jpg");
        ImageIcon icon1 = new ImageIcon(imagen1.getImage().getScaledInstance(1000,700, Image.SCALE_DEFAULT));
        fondo = new JLabel(icon1);
        fondo.setBounds(0, 0, 1000,700);
        add(fondo);
    }

    public JButton getBoton1() {
        return boton1;
    }

    public void setBoton1(JButton boton1) {
        this.boton1 = boton1;
    }

}