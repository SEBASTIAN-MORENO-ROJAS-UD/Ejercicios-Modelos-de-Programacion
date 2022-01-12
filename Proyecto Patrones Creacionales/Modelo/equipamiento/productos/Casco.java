package Modelo.equipamiento.productos;

/**
 * Esta clase de tipo abstracta define la forma de las clases que sean de tipo Casco, y por lo tanto hereden de esta clase Casco
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public abstract class Casco{

    //Campos de la clase
    private String nombre;
    private String descripcion;
    private String imagen;

    /**
     * Constructor que crea un objeto de tipo Casco y sus subclases
     * @param nombre Nombre del casco
     * @param descripcion Breve descripcion del casco
     * @param imagen Ruta dentro del proyecto de la imagen del casco
     */
    public Casco(String nombre, String descripcion, String imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Define el nombre del casco
     * @param nombre Nombre del casco
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
     * Define la ruta dentro del proyecto de la imagen del casco
     * @param imagen Ruta dentro del proyecto de la imagen del casco
     */
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    /**
     * Metodo que devuelve el nombre del casco
     * @return 
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Metodo que devuelve la descripcion del casco
     * @return Descripcion del casco
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Metodo que devuelve la ruta dentro del proyecto de la imagen del casco
     * @return Ruta dentro del proyecto de la imagen del casco
     */
    public String getImagen(){
        return this.imagen;
    }
}
