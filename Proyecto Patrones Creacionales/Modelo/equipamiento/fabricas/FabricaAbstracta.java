package Modelo.equipamiento.fabricas;

import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.Casco;

/**
 * Interfaz que determina el comportamiento de las clases que sean fabricas
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public interface FabricaAbstracta {

    /**
     * Metodo que crea un objeto de tipo Casco y lo retorna
     * @return Objeto de tipo Casco
     */
    public Casco crearCasco();

    /**
     * Metodo que crea un objeto de tipo Armadura y lo retorna
     * @return Objeto de tipo Armadura
     */
    public Armadura crearArmadura();

    /**
     * Metodo que crea un objeto de tipo Botas y lo retorna
     * @return Objeto de tipo Botas
     */
    public Botas crearBotas();

    /**
     * Metodo que crea un objeto de tipo Arma y lo retorna
     * @return Objeto de tipo Arma
     */
    public Arma crearArma();
}
