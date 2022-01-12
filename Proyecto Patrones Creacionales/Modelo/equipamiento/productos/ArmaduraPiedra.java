package Modelo.equipamiento.productos;

/**
 * Esta clase define las armaduras de piedra heredando los atributos y metodos de la clase abstracta Armadura, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class ArmaduraPiedra extends Armadura {

    /**
     * Constructor que crea un objeto de tipo ArmaduraPiedra, invocando el constructor de la superclase Armadura
     * @param nombre Nombre de la armadura
     * @param descripcion Breve descripcion de la armadura
     * @param imagen Ruta dentro del proyecto de la imagen de la armadura
     */
    public ArmaduraPiedra(String nombre, String descripcion, String imagen) {
        super(nombre, descripcion, imagen);
    }
}
