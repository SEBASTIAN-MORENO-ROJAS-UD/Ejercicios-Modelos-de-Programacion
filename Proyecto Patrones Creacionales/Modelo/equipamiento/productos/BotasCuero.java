package Modelo.equipamiento.productos;

/**
 * Esta clase define las botas de cuero hheredando los atributos y metodos de la clase abstracta Botas, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class BotasCuero extends Botas{

    /**
     * Constructor que crea un objeto de tipo BotasCuero, invocando el constructor de la superclase Botas
     * @param nombre Nombre de las botas
     * @param descripcion Breve descripcion de las botas
     * @param imagen Ruta dentro del proyecto de la imagen de las botas
     */
    public BotasCuero(String nombre, String descripcion, String imagen){
        super(nombre, descripcion, imagen);
    }
}
