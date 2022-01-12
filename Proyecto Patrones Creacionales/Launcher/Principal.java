package Launcher;

import Controlador.Controlador;
import Vista.VistaPersonajes;
import Modelo.equipamiento.AbstractFactory;
import java.util.ArrayList;
import Modelo.Modelo;

class Principal {

    public static void main(String[] args) {
        
        Modelo modelo = new Modelo();

        VistaPersonajes vista = new VistaPersonajes();
        
        Controlador controlador = new Controlador(vista, modelo);

    }
}
