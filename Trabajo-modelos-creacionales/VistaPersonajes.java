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

import personaje.Prototype;
import personaje.prototipos.*;

public class VistaPersonajes extends JFrame {

	
	//ATRIBUTOS
	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<Personaje> personajes;
	private JLabel etiqueta1 = new JLabel();
	private JLabel etiqueta2 = new JLabel();
	private JLabel etiqueta3 = new JLabel();
	private JLabel etiqueta4 = new JLabel();
	private JLabel etiqueta5 = new JLabel();
	private JLabel etiqueta6 = new JLabel();
	private JLabel etiqueta7 = new JLabel();
	private JLabel etiqueta8 = new JLabel();
	private JPanel panel_1;
	private JPanel panel_2;
	private JComboBox OpcioncomboBox;
  private String opcion;
	private int cantidad=0;
  private List<JLabel>labelLista = new ArrayList<JLabel>(); 
	private int indice; // indice que va a gragando de uno en uno los label
	private JPanel panelPersonajes;//PANEL QUE SE REMPLAZO POR SCROLLBAR



	//MAIN DE LA VISTA
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaPersonajes frame = new vistaPersonajes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/
	
	//CONSTRUCTOR
	/**
	 * Create the frame.
	 */
	public VistaPersonajes() {

//PARA CREAR LOS LABEL DINAMICOS
    //label  = new ArrayList<JLabel>();
		indice=0;

		this.setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1230, 750);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		OpcioncomboBox = new JComboBox();
		OpcioncomboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		OpcioncomboBox.setBounds(690, 11, 363, 24);
		contentPane.add(OpcioncomboBox);
		OpcioncomboBox.setModel(new DefaultComboBoxModel(new String[] {"Guerrero", "Ogro","Golem"}));
    
		textField = new JTextField();
		textField.setBounds(323, 50, 100, 24);
		contentPane.add(textField);
		textField.setColumns(10);
		
		panelPersonajes = new JPanel();
		panelPersonajes.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panelPersonajes.setBounds(565, 99, 516, 601);
		panelPersonajes.setLayout(new GridLayout(3,0));
		contentPane.add(panelPersonajes);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel_1.setBounds(10, 99, 227, 601);
		contentPane.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel_2.setBounds(245, 99, 227, 601);
		contentPane.add(panel_2);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));

		
		JLabel cantidadSpawnlbl = new JLabel("Cantidad de personajes a mostrar");
		cantidadSpawnlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));
		cantidadSpawnlbl.setBounds(29, 46, 300, 24);
		contentPane.add(cantidadSpawnlbl);
    
		JButton btnGenerarPersonaje = new JButton("Generar Personaje");


		btnGenerarPersonaje.setBounds(459,47,95,30);
		contentPane.add(btnGenerarPersonaje);
		btnGenerarPersonaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				pedirPersonajes();

				panelPersonajes.removeAll();
				panelPersonajes.repaint();
				
				for(int i=0; i<cantidad; i++) {

					String url = personajes.get(i).getImagen();
					
					try{
						
						JLabel imgPersonaje = new JLabel();
						imgPersonaje.setBounds(0,60,262,125);
						ImageIcon Icono1 = new ImageIcon(url);
						imgPersonaje.setIcon(new ImageIcon(Icono1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));
					
						panelPersonajes.add(imgPersonaje);
						labelLista.add(imgPersonaje);
						panelPersonajes.updateUI();
					}
					catch(java.lang.IllegalArgumentException a){
						
					}

				}

				try{

					reiniciarJlabels();

					generarImagenes();
					panel_1.add(etiqueta1);
					panel_1.add(etiqueta2);
					panel_1.add(etiqueta3);
					panel_1.add(etiqueta4);

					generarInfo();
					panel_2.add(etiqueta5);
					panel_2.add(etiqueta6);
					panel_2.add(etiqueta7);
					panel_2.add(etiqueta8);
				}
				catch(java.lang.NullPointerException a){
					System.out.println("ERROR");
				}
				
			}
		});
	}

	public void pedirPersonajes(){

		opcion = (String) OpcioncomboBox.getSelectedItem();
		try{
			cantidad = Integer.parseInt(textField.getText());
		}
		catch(java.lang.NumberFormatException a){
			System.out.println("ERROR");
		}

		Prototype p = new Prototype();

		personajes = new ArrayList<Personaje>();

		if(opcion=="Guerrero"){
			personajes = p.generarGuerreros(cantidad);
		}
		else if(opcion=="Ogro"){
			personajes = p.generarOgros(cantidad);
		}
		else if(opcion=="Golem"){
			personajes = p.generarGolems(cantidad);
		}
	}


	public void generarImagenes(){

		Personaje personaje = personajes.get(0);		
		
		String imagenCasco = personaje.getCasco().getImagen();
		String imagenArmadura = personaje.getArmadura().getImagen();
		String imagenBotas = personaje.getBotas().getImagen();
		String imagenArma = personaje.getArma().getImagen();

		etiqueta1.setBounds(0,60,262,125);
		ImageIcon Icono1 = new ImageIcon(imagenCasco);
	  etiqueta1.setIcon(new ImageIcon(Icono1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));

		etiqueta2.setBounds(0,60,262,125);
		ImageIcon Icono2 = new ImageIcon(imagenArmadura);
	  etiqueta2.setIcon(new ImageIcon(Icono2.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
		
		etiqueta3.setBounds(0,60,262,125);
		ImageIcon Icono3 = new ImageIcon(imagenBotas);
	  etiqueta3.setIcon(new ImageIcon(Icono3.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));

		etiqueta4.setBounds(0,60,262,125);
		ImageIcon Icono4 = new ImageIcon(imagenArma);
	  etiqueta4.setIcon(new ImageIcon(Icono4.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));

	}

	public void reiniciarJlabels(){
		etiqueta1.setIcon(null);
		etiqueta2.setIcon(null);
		etiqueta3.setIcon(null);
		etiqueta4.setIcon(null);
		etiqueta5.setText(null);
		etiqueta6.setText(null);
		etiqueta7.setText(null);
		etiqueta8.setText(null);
	}

	public void generarInfo(){

		Personaje personaje = personajes.get(0);		
		
		String desCasco = personaje.getCasco().getDescripcion();
		String desArmadura = personaje.getArmadura().getDescripcion();
		String desBotas = personaje.getBotas().getDescripcion();
		String desArma = personaje.getArma().getDescripcion();

		etiqueta5.setText("<html>"+ desCasco +"</html>");

		etiqueta6.setText("<html>"+ desArmadura +"</html>");

		etiqueta7.setText("<html>"+ desArmadura +"</html>");
		
		etiqueta8.setText("<html>"+ desArma +"</html>");

	}
}
