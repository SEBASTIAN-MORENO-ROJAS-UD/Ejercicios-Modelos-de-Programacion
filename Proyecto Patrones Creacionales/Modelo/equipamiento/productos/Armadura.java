package Modelo.equipamiento.productos;

/**
 * Esta clase de tipo abstracta define la forma de las clases que sean de tipo Armadura, y por lo tanto hereden de esta clase Armadura
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public abstract class Armadura{

    //Campos de la clase
    private String nombre;
    private String descripcion;
    private String imagen;

    /**
     * Constructor que crea un objeto de tipo Armadura y sus subclases
     * @param nombre Nombre de la armadura
     * @param descripcion Breve descripcion de la armadura
     * @param imagen Ruta dentro del proyecto de la imagen de la armadura
     */
    public Armadura(String nombre, String descripcion, String imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Define el nombre de la armadura
     * @param nombre Nombre de la armadura
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Define una breve descripcion de la armadura
     * @param descripcion Descripcion de la armadura
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * Define la ruta dentro del proyecto de la imagen de la armadura
     * @param imagen Ruta dentro del proyecto de la imagen de la armadura
     */
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    /**
     * Metodo que devuelve el nombre de la armadura
     * @return Nombre de la armadura
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Metodo que devuelve la descripcion de la armadura
     * @return Drscripcion de la armadura
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Metodo que devuelve la ruta dentro del proyecto de la imagen de la armadura
     * @return Ruta dentro del proyecto de la imagen de la armadura
     */
    public String getImagen(){
        return this.imagen;
    }
}
