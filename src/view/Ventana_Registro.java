package view;
import javax.swing.*;
import java.awt.*;

public class Ventana_Registro extends JPanel{

    private JLabel etiqueta1, etiqueta2, fondo;
    private JTextField barra1, barra2;
    private JButton boton1, boton2;

    public Ventana_Registro(){
        setSize(1000, 700);
        setLayout(null);
        setBackground(Color.WHITE);
        IniciarComponentes();
        setVisible(true);
    }

    private void IniciarComponentes() {

        etiqueta1 = new JLabel("Ingresa Tu cuenta");
        etiqueta1.setBounds(80,50,500,100);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta1);

        barra1 = new JTextField();
        barra1.setBounds(80, 150, 500, 50);
        barra1.setFont((new Font("Arial", Font.BOLD, 25)));
        add(barra1);

        etiqueta2 = new JLabel("Ingresa Tu contraseña");
        etiqueta2.setBounds(80,220,500,100);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta2);

        barra2 = new JTextField();
        barra2.setBounds(80, 320, 500, 50);
        barra2.setFont((new Font("Arial", Font.BOLD, 25)));
        add(barra2);

        boton1 = new JButton("Crear Cuenta");
        boton1.setActionCommand("CrearCuentaNueva");
        boton1.setBounds(80, 430, 250,80);
        boton1.setFont((new Font("Arial", Font.BOLD, 15)));
        boton1.setBackground(Color.WHITE);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setActionCommand("Principal");
        boton2.setBounds(450, 430, 250,80);
        boton2.setFont((new Font("Arial", Font.BOLD, 15)));
        boton2.setBackground(Color.WHITE);
        add(boton2);

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

    public JButton getBoton2() {
        return boton2;
    }

    public void setBoton2(JButton boton2) {
        this.boton2 = boton2;
    }

}
