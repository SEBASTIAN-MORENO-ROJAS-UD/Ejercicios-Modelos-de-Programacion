package Controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase que hereda de Exception, para menjar excepciones propias
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */
public class ExcepcionPropia extends Exception{
    /**
     * Constructor que crea un objeto de tipo ExcepcionPropia, recibiendo por parametro el mensaje que contiene 
     * @param msg Mensaje que contiene el objeto de tipo ExcepcionPropia al heredar de Excecpcion
     */
    public ExcepcionPropia(String msg){
        super(msg);
    }
}
