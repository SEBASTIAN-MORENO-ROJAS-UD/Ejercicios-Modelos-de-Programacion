package Modelo.equipamiento;

import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.Casco;
import Modelo.equipamiento.fabricas.FabricaOgro;
import Modelo.equipamiento.fabricas.FabricaGuerrero;
import Modelo.equipamiento.fabricas.FabricaGolem;
import Modelo.equipamiento.fabricas.FabricaAbstracta;

/**
 * Esta clase se encarga de utilizar las fabricas de las familias de objetos, generando los productos a partir de una fabrica concreta, y por ultimo retornandolos
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class AbstractFactory {

    //Campos de la clase
    private FabricaAbstracta fabrica;
    private Casco casco;
    private Armadura armadura;
    private Botas botas;
    private Arma arma;

    /**
     * Este metodo define la fabrica concreta que se va a usar dependiendo de la opcion que recibe por parametro, y crea los objetos a partir de dicha fabrica
     * @param opcion Opcion para elegir una de las fabricas
     */
    public void generarEquipamiento(int opcion){

        switch (opcion){
            case 1:
                fabrica = new FabricaGuerrero();
                break;

            case 2:
                fabrica = new FabricaOgro();
                break;

            case 3:
                fabrica = new FabricaGolem();
                break;
        }
        casco = fabrica.crearCasco();
        armadura = fabrica.crearArmadura();
        botas = fabrica.crearBotas();
        arma = fabrica.crearArma();
    }

    /**
     * Metodo que retorna el casco que creó la fabrica concreta elegida
     * @return Objeto de tipo Casco creado por la fabrica concreta
     */
    public Casco getCasco(){
        return this.casco;
    }

    /**
     * Metodo que retorna la armadura que creó la fabrica concreta elegida
     * @return Objeto de tipo Armadura creado por la fabrica concreta
     */
    public Armadura getArmadura(){
        return this.armadura;
    }

    /**
     * Metodo que retorna las botas que creó la fabrica concreta elegida
     * @return Objeto de tipo Botas creado por la fabrica concreta
     */
    public Botas getBotas(){
        return this.botas;
    }

    /**
     * Metodo que retorna el arma que creó la fabrica concreta elegida
     * @return Objeto de tipo Arma creado por la fabrica concreta
     */
    public Arma getArma(){
        return this.arma;
    }
}
