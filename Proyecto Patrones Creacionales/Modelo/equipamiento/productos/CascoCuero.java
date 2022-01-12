package Modelo.equipamiento.productos;

/**
 * Esta clase define los cascos de cuero heredando los atributos y metodos de la clase abstracta Casco, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class CascoCuero extends Casco{

    /**
     * Constructor que crea un objeto de tipo CascoCuero, invocando el constructor de la superclase Casco
     * @param nombre Nombre del casco
     * @param descripcion Breve descripcion del casco
     * @param imagen Ruta dentro del proyecto de la imagen del casco
     */
    public CascoCuero(String nombre, String descripcion, String imagen){
        super(nombre, descripcion, imagen);
    }
}
