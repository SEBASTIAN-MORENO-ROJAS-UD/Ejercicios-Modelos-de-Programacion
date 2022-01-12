package Modelo.equipamiento.productos;

/**
 * Esta clase define las botas de hierro heredando los atributos y metodos de la clase abstracta Botas, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class BotasHierro extends Botas{

    /**
     * Constructor que crea un objeto de tipo BotasHierro, invocando el constructor de la superclase Botas
     * @param nombre Nombre de las botas
     * @param descripcion Breve descripcion de las botas
     * @param imagen Ruta dentro del proyecto de la imagen de las botas
     */
    public BotasHierro(String nombre, String descripcion, String imagen){
        super(nombre, descripcion, imagen);
    }
}
