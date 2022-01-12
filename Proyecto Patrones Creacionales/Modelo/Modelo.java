package Modelo;

import Modelo.personaje.prototipos.Personaje;
import java.util.ArrayList;
import Modelo.personaje.fabrica.CreadorPersonaje;

/**
 * Esta clase se encarga de generar y retornar un ArrayList de tipo Personaje, creando y guardando en dicho ArrayList
 * una cantidad deseada de objetos Guerrero, Ogro u Golem, segun se haya indicado
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class Modelo {
    
    //Campos de la clase
    ArrayList<Personaje> clones = new ArrayList<Personaje>();
    CreadorPersonaje creador = new CreadorPersonaje();
    
    /**
     * Este metodo haciendo uso de la clase CreadorPersonaje, crea una cantidad de objetos de tipo Guerrero, Ogro u Golem y los guarda
     * en un ArrayList de tipo Personaje. La cantidad y el tipo de personaje (Guerrero, Ogro u Golem) se reciben por parametro
     * @param cantidad Cantidad de objetos de tipo Guerrero, Ogro u Golem que se desea
     * @param tipoPersonaje La clase de los objetos que se guardan en el ArrayList. Puede ser Guerrero, Ogro u Golem
     * @return Un ArrayList con la cantidad indicada de objetos de tipo Guerrero, Ogro u Golem
     */
    public ArrayList<Personaje> generarPersonajes(int cantidad, String tipoPersonaje){
        
        clones.clear();
        Personaje personaje = new Personaje();
        
        if(tipoPersonaje.equals("Guerrero")){
            
            for (int i = 0; i<cantidad; i++) {
                personaje = creador.retornarClon("Guerrero");
                clones.add(personaje);
            }
            return clones;
        }
        else if(tipoPersonaje.equals("Ogro")){
            
            for (int i = 0; i<cantidad; i++) {
                personaje = creador.retornarClon("Ogro");
                clones.add(personaje);
            }
            return clones;
        }
        else if(tipoPersonaje.equals("Golem")){
            
            for (int i = 0; i<cantidad; i++) {
                personaje = creador.retornarClon("Golem");
                clones.add(personaje);
            }
            return clones;
        }
        else{
            return null;
        }
    }
}
