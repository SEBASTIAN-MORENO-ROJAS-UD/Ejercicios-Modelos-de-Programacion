package Modelo.equipamiento.productos;

/**
 * Esta clase define las armas que son mazos heredando los atributos y metodos de la clase abstracta Arma, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class Mazo extends Arma{

    /**
     * Constructor que crea un objeto de tipo Lanza, invocando el constructor de la superclase Arma
     * @param nombre Nombre de la arma
     * @param descripcion Breve descripcion de la arma
     * @param imagen Ruta dentro del proyecto de la imagen de la arma
     */
    public Mazo(String nombre, String descripcion, String imagen){
        super(nombre, descripcion, imagen);
    }
}
