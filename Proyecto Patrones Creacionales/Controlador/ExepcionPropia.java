package Controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class ExepcionPropia extends Exception{
    public ExepcionPropia(String msg){
        super(msg);
    }
}
