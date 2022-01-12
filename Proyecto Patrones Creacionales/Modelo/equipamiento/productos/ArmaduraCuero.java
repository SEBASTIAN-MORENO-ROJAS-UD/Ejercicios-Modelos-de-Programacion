package Modelo.equipamiento.productos;

/**
 * Esta clase define las armaduras de cuero heredando los atributos y metodos de la clase abstracta Armadura, invocando en su constructor el constructor de la superclase
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class ArmaduraCuero extends Armadura{

    /**
     * Constructor que crea un objeto de tipo ArmaduraCuero, invocando el constructor de la superclase Armadura
     * @param nombre Nombre de la armadura
     * @param descripcion Breve descripcion de la armadura
     * @param imagen Ruta dentro del proyecto de la imagen de la armadura
     */
    public ArmaduraCuero(String nombre, String descripcion, String imagen){
        super(nombre, descripcion, imagen);
    }
}
