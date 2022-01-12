package Modelo.personaje.fabrica;

import Modelo.equipamiento.AbstractFactory;
import Modelo.personaje.prototipos.Personaje;
import Modelo.personaje.prototipos.Ogro;
import Modelo.personaje.prototipos.Guerrero;
import Modelo.personaje.prototipos.Golem;

/**
 * Esta clase se encarga de instanciar los objetos prototipos de las clases Guerrero, Ogro y Golem, asi como de retornar un clon del objeto prototipo de la clase escogida
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class CreadorPersonaje {

    //Campos de la clase
    private Guerrero guerrero;
    private Ogro ogro;
    private Golem golem;

    /**
     * Constructor que haciendo uso de la clase AbstractFactory para crear el equipamiento de los objetos prototipo de las clases Guerrero, Ogro y Golem,
     * instancia dichos prototipos para ser clonados
     */
    public CreadorPersonaje(){

        guerrero = new Guerrero();
        ogro = new Ogro();
        golem = new Golem();

        AbstractFactory fabrica = new AbstractFactory();

        fabrica.generarEquipamiento(1);
        guerrero.setCasco(fabrica.getCasco());
        guerrero.setArmadura(fabrica.getArmadura());
        guerrero.setBotas(fabrica.getBotas());
        guerrero.setArma(fabrica.getArma());
        guerrero.setImagen("/Imagenes/Personajes/Guerrero.jpeg");

        fabrica.generarEquipamiento(2);
        ogro.setCasco(fabrica.getCasco());
        ogro.setArmadura(fabrica.getArmadura());
        ogro.setBotas(fabrica.getBotas());
        ogro.setArma(fabrica.getArma());
        ogro.setImagen("/Imagenes/Personajes/Ogro.jpeg");

        fabrica.generarEquipamiento(3);
        golem.setCasco(fabrica.getCasco());
        golem.setArmadura(fabrica.getArmadura());
        golem.setBotas(fabrica.getBotas());
        golem.setArma(fabrica.getArma());
        golem.setImagen("/Imagenes/Personajes/Golem.jpeg");
    }

    /**
     * Metodo que retorna un clon del objeto prototipo de la clase escogida
     * @param personaje String que indica la clase del objeto prototipo que se quiere clonar
     * @return Objeto Personaje que es el clon de uno de los objetos prototipo
     */
    public Personaje retornarClon(String personaje){
        
        if (personaje.equals("Guerrero")){
            return guerrero.clone();
        }
        else if (personaje.equals("Ogro")){
            return ogro.clone();
        }
        else if (personaje.equals("Golem")){
            return golem.clone();
        }
        return null;
    }
}
