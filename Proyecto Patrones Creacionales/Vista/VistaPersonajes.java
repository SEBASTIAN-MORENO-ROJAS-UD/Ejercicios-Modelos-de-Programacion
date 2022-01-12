package Vista;

import Controlador.Controlador;
import Modelo.personaje.prototipos.Personaje;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.print.DocFlavor.URL;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Vista de todo el proyecto donde se muestran las imagenes de los personajes del mismo tipo escogido, asi como de su equipamiento y la descripcion de este
 * @author User
 */

public class VistaPersonajes extends JFrame{

    private JPanel contentPane;
    private JTextField cantidadPersonajes;
    private JLabel etiqueta1 = new JLabel();
    private JLabel etiqueta2 = new JLabel();
    private JLabel etiqueta3 = new JLabel();
    private JLabel etiqueta4 = new JLabel();
    private JLabel etiqueta5 = new JLabel();
    private JLabel etiqueta6 = new JLabel();
    private JLabel etiqueta7 = new JLabel();
    private JLabel etiqueta8 = new JLabel();
    private JPanel panelEquipamientos;
    private JPanel panelDescripcion;
    private JComboBox OpcioncomboBox;
    private JPanel panelPersonajes;
    private Controlador controlador;

    /**
     * Constructor de la vista con todos sus elementos
     */
    public VistaPersonajes(){

        this.setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1230, 750);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        OpcioncomboBox = new JComboBox();
        OpcioncomboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
        OpcioncomboBox.setBounds(690, 50, 363, 24);
        contentPane.add(OpcioncomboBox);
        OpcioncomboBox.setModel(new DefaultComboBoxModel(new String[]{"Guerrero", "Ogro", "Golem"}));

        cantidadPersonajes = new JTextField();
        cantidadPersonajes.setBounds(323, 50, 100, 24);
        contentPane.add(cantidadPersonajes);
        cantidadPersonajes.setColumns(10);

        panelEquipamientos = new JPanel();
        panelEquipamientos.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
        panelEquipamientos.setBounds(10, 99, 227, 601);
        panelEquipamientos.setLayout(new GridLayout(4, 1, 0, 0));
        panelEquipamientos.setBackground(Color.white);
        contentPane.add(panelEquipamientos);
        

        panelDescripcion = new JPanel();
        panelDescripcion.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
        panelDescripcion.setBounds(245, 99, 227, 601);
        panelDescripcion.setLayout(new GridLayout(4, 1, 0, 0));
        panelDescripcion.setBackground(Color.white);
        contentPane.add(panelDescripcion);
        
        
        panelPersonajes = new JPanel();
        panelPersonajes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
        panelPersonajes.setBounds(497, 99, 687, 601);
        panelPersonajes.setLayout(new GridLayout(5, 0));
        panelPersonajes.setBackground(Color.white);
        contentPane.add(panelPersonajes);

        JLabel cantidadSpawnlbl = new JLabel("Cantidad de personajes a mostrar");
        cantidadSpawnlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
        cantidadSpawnlbl.setBounds(29, 46, 300, 24);
        contentPane.add(cantidadSpawnlbl);

        JButton btnGenerarPersonaje = new JButton("Generar Personaje");

        btnGenerarPersonaje.setBounds(459, 47, 95, 30);
        contentPane.add(btnGenerarPersonaje);
        btnGenerarPersonaje.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                Controlador.modificarVista();
            }
        });
    }

    /**
     * Define el JLabel donde se muestra la imagen del casco de los personajes
     * @param etiqueta1 JLabel que contiene la imagen del casco de los personajes
     */
    public void setEtiqueta1(JLabel etiqueta1){
        this.etiqueta1 = etiqueta1;
    }

    /**
     * Define el JLabel donde se muestra la imagen de la armadura de los personajes
     * @param etiqueta2 JLabel que contiene la imagen de la armadura de los personajes
     */
    public void setEtiqueta2(JLabel etiqueta2){
        this.etiqueta2 = etiqueta2;
    }

    /**
     * Define el JLabel donde se muestra la imagen de las botas de los personajes
     * @param etiqueta3 JLabel que contiene la imagen de las botas de los personajes
     */
    public void setEtiqueta3(JLabel etiqueta3){
        this.etiqueta3 = etiqueta3;
    }

    /**
     * Define el JLabel donde se muestra la imagen del arma de los personajes
     * @param etiqueta4 JLabel que contiene la imagen del arma de los personajes
     */
    public void setEtiqueta4(JLabel etiqueta4){
        this.etiqueta4 = etiqueta4;
    }

    /**
     * Define el JLabel donde se muestra la descripcion del casco de los personajes
     * @param etiqueta5 JLabel que contiene la descripcion del casco de los personajes
     */
    public void setEtiqueta5(JLabel etiqueta5){
        this.etiqueta5 = etiqueta5;
    }

    /**
     * Define el JLabel donde se muestra la descripcion de la armadura de los personajes
     * @param etiqueta6 JLabel que contiene la descripcion de la armadura de los personajes
     */
    public void setEtiqueta6(JLabel etiqueta6){
        this.etiqueta6 = etiqueta6;
    }

    /**
     * Define el JLabel donde se muestra la descripcion de las botas de los personajes
     * @param etiqueta7 JLabel que contiene la descripcion de las botas de los personajes
     */
    public void setEtiqueta7(JLabel etiqueta7){
        this.etiqueta7 = etiqueta7;
    }

    /**
     * Define el JLabel donde se muestra la descripcion del arma de los personajes
     * @param etiqueta8 JLabel que contiene la descripcion del arma de los personajes
     */
    public void setEtiqueta8(JLabel etiqueta8){
        this.etiqueta8 = etiqueta8;
    }

    /**
     * Metodo que devuelve el JPanel donde se muestran las imagenes de los equipamientos de los personajes
     * @return JPanel que contiene los JLabels con las imagenes de los equipamientos de los personajes
     */
    public JPanel getPanelEquipamientos(){
        return panelEquipamientos;
    }

    /**
     * Metodo que devuelve el JPanel donde se muestra la descripcion de los equipamientos de los personajes
     * @return JPanel que contiene los JLabels con la descripcion de los equipamientos de los personajes
     */
    public JPanel getPanelDescripcion(){
        return panelDescripcion;
    }

    /**
     * Metodo que devuelve el JPanel donde se muestran las imagenes de los personajes
     * @return JPanel que contiene los JLabels con las imagenes de los personajes
     */
    public JPanel getPanelPersonajes(){
        return panelPersonajes;
    }
    
    /**
     * Metodo que devuelve el JComboBox donde se elige la clase de los personajes deseados
     * @return JComboBox donde se elige la clase de los personajes deseados
     */
    public JComboBox getOpcioncomboBox(){
        return OpcioncomboBox;
    }

    /**
     * Metodo que devuelve el JTextField donde se escribe la cantidad de personajes deseados
     * @return JTextField donde se escribe la cantidad de personajes deseados
     */
    public JTextField getCantidadPersonajes(){
        return cantidadPersonajes;
    }
    
    /**
     * Metodo para agregar los JLabels de las imagenes y sus descripciones en sus JPanels correspondientes
     */
    public void addLabels(){
        panelEquipamientos.add(etiqueta1);
        panelEquipamientos.add(etiqueta2);
        panelEquipamientos.add(etiqueta3);
        panelEquipamientos.add(etiqueta4);
        
        panelDescripcion.add(etiqueta5);
        panelDescripcion.add(etiqueta6);
        panelDescripcion.add(etiqueta7);
        panelDescripcion.add(etiqueta8);
    }
}
