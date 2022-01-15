package Controlador;

import Vista.VistaPersonajes;
import Modelo.*;
import Modelo.personaje.prototipos.Personaje;
import java.util.*;
import javax.swing.*;
import java.awt.*;

/**
 * Esta clase, haciendo uso del Modelo, se encarga de recibir la infoamcion de la Vista acerca del personaje y la cantidad requerida,
 * modificando la Vista agregando las imagenes e informacion del equipamiento de los personajes, asi como de agregar las imagenes de
 * los personajes en si
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class Controlador {
    
    //Campos de la clase
    private static JLabel etiqueta1 = new JLabel();
    private static JLabel etiqueta2 = new JLabel();
    private static JLabel etiqueta3 = new JLabel();
    private static JLabel etiqueta4 = new JLabel();
    private static JLabel etiqueta5 = new JLabel();
    private static JLabel etiqueta6 = new JLabel();
    private static JLabel etiqueta7 = new JLabel();
    private static JLabel etiqueta8 = new JLabel();
    private static Modelo modelo = new Modelo();;
    private static VistaPersonajes vista = new VistaPersonajes();
    private static ArrayList<Personaje> personajes = new ArrayList<Personaje>();
    private static int cantidad;
    
    /**
     * Constructor que crea un objeto de la clase Controlador
     * @param vista La vista del proyecto en la cual se agregan las imagenes e informacion
     * @param modelo Objeto de la clase modelo para generar los personajes deseados
     */
    public Controlador(VistaPersonajes vista, Modelo modelo){
        vista = vista;
        modelo = modelo;   
    }
    
    /**
     * Se recibe de la Vista el personaje y la cantidad deseada, y haciendo uso de esta informacion se le pide al Modelo
     * dichos personajes, guardandolos en un ArrayList de tipo Personaje
     * @throws NumberFormatException Si se deja vacio o se ingresan letras en el campo de la cantidad de personajes en la Vista
     * @throws ExcepcionPropia Si se pide una cantidad de personajes mayor a 15
     */
    public static void pedirPersonajes() throws NumberFormatException, ExcepcionPropia{
        
        cantidad = Integer.parseInt(vista.getCantidadPersonajes().getText());
        String opcion = (String) vista.getOpcioncomboBox().getSelectedItem();
        
        if(cantidad<=15){
            personajes = modelo.generarPersonajes(cantidad, opcion);
        }
        else if(cantidad>15){
            throw new ExcepcionPropia("La cantidad maxima de personajes es de 15");
        }
    }
    
    /**
     * Genera JLabels con las imagenes del equipamiento de los personajes, agregandolos a la vista
     * @throws IndexOutOfBoundsException Si se ingresa cero o un numero negativo en el campo de la cantidad de personajes en la Vista
     * @throws NullPointerException Si no se encuentran las imagenes de los equipamientos en la ruta especificada dentro del proyecto
     */
    public static void generarImagenEquipamiento() throws IndexOutOfBoundsException, NullPointerException{
        
        Personaje personaje = personajes.get(0);

        String imagenCasco = personaje.getCasco().getImagen();
        String imagenArmadura = personaje.getArmadura().getImagen();
        String imagenBotas = personaje.getBotas().getImagen();
        String imagenArma = personaje.getArma().getImagen();

        etiqueta1.setBounds(0, 60, 262, 125);
        ImageIcon Icono1 = new ImageIcon(VistaPersonajes.class.getResource(imagenCasco));
        etiqueta1.setIcon(new ImageIcon(Icono1.getImage().getScaledInstance(etiqueta1.getWidth(), etiqueta1.getHeight(), Image.SCALE_SMOOTH)));

        etiqueta2.setBounds(0, 60, 262, 125);
        ImageIcon Icono2 = new ImageIcon(VistaPersonajes.class.getResource(imagenArmadura));
        etiqueta2.setIcon(new ImageIcon(Icono2.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));

        etiqueta3.setBounds(0, 60, 262, 125);
        ImageIcon Icono3 = new ImageIcon(VistaPersonajes.class.getResource(imagenBotas));
        etiqueta3.setIcon(new ImageIcon(Icono3.getImage().getScaledInstance(etiqueta3.getWidth(), etiqueta3.getHeight(), Image.SCALE_SMOOTH)));

        etiqueta4.setBounds(0, 60, 262, 125);
        ImageIcon Icono4 = new ImageIcon(VistaPersonajes.class.getResource(imagenArma));
        etiqueta4.setIcon(new ImageIcon(Icono4.getImage().getScaledInstance(etiqueta4.getWidth(), etiqueta4.getHeight(), Image.SCALE_SMOOTH)));

        vista.setEtiqueta1(etiqueta1);
        vista.setEtiqueta2(etiqueta2);
        vista.setEtiqueta3(etiqueta3);
        vista.setEtiqueta4(etiqueta4);
    }
    
    /**
     * Genera JLabels con las descripciones del equipamiento de los personajes, agregandolos a la vista
     * @throws IndexOutOfBoundsException Si se ingresa cero o un numero negativo en el campo de la cantidad de personajes en la Vista
     */
    public static void generarInfoEquipamiento() throws IndexOutOfBoundsException{

        Personaje personaje = personajes.get(0);

        String desCasco = personaje.getCasco().getDescripcion();
        String desArmadura = personaje.getArmadura().getDescripcion();
        String desBotas = personaje.getBotas().getDescripcion();
        String desArma = personaje.getArma().getDescripcion();

        etiqueta5.setText("<html>" + desCasco + "</html>");
        etiqueta6.setText("<html>" + desArmadura + "</html>");
        etiqueta7.setText("<html>" + desBotas + "</html>");
        etiqueta8.setText("<html>" + desArma + "</html>");

        vista.setEtiqueta5(etiqueta5);
        vista.setEtiqueta6(etiqueta6);
        vista.setEtiqueta7(etiqueta7);
        vista.setEtiqueta8(etiqueta8);
    }
    
    /**
     * Genera JLabels con las imagenes de los personajes, agregandolos directamente al JPanel de los personajes en la Vista
     * @throws IndexOutOfBoundsException Si se ingresa cero o un numero negativo en el campo de la cantidad de personajes en la Vista
     * @throws NullPointerException Si no se encuentran las imagenes de los equipamientos en la ruta especificada dentro del proyecto
     */
    public static void generarImagenesPersonaje() throws IndexOutOfBoundsException, NullPointerException{
        
        JPanel panelPersonajes = vista.getPanelPersonajes();
        panelPersonajes.removeAll();
        
        for (int i = 0; i<cantidad; i++){

            String direccion = personajes.get(i).getImagen();

            JLabel imgPersonaje = new JLabel();
            imgPersonaje.setBounds(0, 60, 262, 125);
            ImageIcon Icono1 = new ImageIcon(VistaPersonajes.class.getResource(direccion));
            imgPersonaje.setIcon(new ImageIcon(Icono1.getImage().getScaledInstance(imgPersonaje.getWidth(), imgPersonaje.getHeight(), Image.SCALE_SMOOTH)));

            panelPersonajes.add(imgPersonaje);
            panelPersonajes.updateUI();
        }
    }
    
    /**
     * Metodo principal del Controlador
     * Llama los demas metodos en orden para pedir los personajes al Modelo y agregar a al Vista las imagenes y descripciones del equipamiento de
     * los personajes, asi como las imagenes de los personajes
     */
    public static void modificarVista(){
        
        try{
            pedirPersonajes();
            generarImagenEquipamiento();
            generarInfoEquipamiento();
            vista.addLabels();
            generarImagenesPersonaje();
        }
        catch (NumberFormatException e1) {
            JFrame ventanaEmergente = new JFrame();
            JOptionPane.showMessageDialog(ventanaEmergente, "Ingrese un numero");
        }
        catch(IndexOutOfBoundsException e2){
            JFrame ventanaEmergente = new JFrame();
            JOptionPane.showMessageDialog(ventanaEmergente, "Ingrese un numero mayor a 1");
        }
        catch(NullPointerException e3){
            e3.printStackTrace();
            System.out.println("No se encuentra la imagen dentro del proyecto");
        }
        catch(ExcepcionPropia e4){
            JFrame ventanaEmergente = new JFrame();
            JOptionPane.showMessageDialog(ventanaEmergente, e4.getMessage());
        }
    }
}
