package view;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Ventana_Registro extends JPanel{

    private JLabel etiqueta1, etiqueta2, fondo;
    private JComboBox barra1;
    private JButton boton1, boton2;
    private JTextArea campo;
    public Ventana_Registro(){
        setSize(1000, 700);
        setLayout(null);
        setBackground(Color.WHITE);
        IniciarComponentes();
        setVisible(false);
    }

    private void IniciarComponentes() {

        etiqueta1 = new JLabel("Elige la Opcion");
        etiqueta1.setBounds(80,50,600,100);
        etiqueta1.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta1);

        barra1 = new JComboBox();
        barra1.addItem("Nombre, Dependencia, Cargo, EPS, dias incapacidad iniio y fin, novedad incapacidad.");
        barra1.addItem("Nombre, Dependencia, Cargo, EPS, dias vacaciones iniio y fin, novedad vacaciones.");
        barra1.addItem("monto de bonificación y transporte que tiene cada empleado cargo y dependencia.");
        barra1.addItem("empleados que trabajaron 20 o menos días al mes, montos de transporte y bonificación.");
        barra1.setBounds(80, 150, 650, 50);
        barra1.setFont((new Font("Arial", Font.BOLD, 14)));
        add(barra1);

        etiqueta2 = new JLabel("Reporte Seleccionado:");
        etiqueta2.setBounds(80,220,500,100);
        etiqueta2.setFont(new Font("Arial", Font.BOLD, 25));
        add(etiqueta2);

        campo = new JTextArea();
        campo.setBounds(80, 300, 700, 350);
        add(campo);


        boton1 = new JButton("Consultar");
        boton1.setActionCommand("Consultar");
        boton1.setBounds(780, 130, 150,80);
        boton1.setFont((new Font("Arial", Font.BOLD, 15)));
        boton1.setBackground(Color.WHITE);
        add(boton1);

        boton2 = new JButton("Atras");
        boton2.setActionCommand("Principal");
        boton2.setBounds(780, 220, 150,80);
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