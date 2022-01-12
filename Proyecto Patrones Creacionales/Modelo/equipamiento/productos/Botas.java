package Modelo.equipamiento.productos;

/**
 * Esta clase de tipo abstracta define la forma de las clases que sean de tipo Botas, y por lo tanto hereden de esta clase Botas
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public abstract class Botas{

    //Campos de la clase
    private String nombre;
    private String descripcion;
    private String imagen;

    /**
     * Constructor que crea un objeto de tipo Botas y sus subclases
     * @param nombre Nombre de las botas
     * @param descripcion Breve descripcion de las botas
     * @param imagen Ruta dentro del proyecto de la imagen de las botas
     */
    public Botas(String nombre, String descripcion, String imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Define el nombre de las botas
     * @param nombre Nombre de las botas
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Define una breve descripcion de las botas
     * @param descripcion Descripcion de las botas
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * Define la ruta dentro del proyecto de la imagen de las botas
     * @param imagen Ruta dentro del proyecto de la imagen de las botas
     */
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    /**
     * Metodo que devuelve el nombre de las botas
     * @return Nombre de las botas
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Metodo que devuelve la descripcion de las botas
     * @return Descripcion de las botas
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Metodo que devuelve la ruta dentro del proyecto de la imagen de las botas
     * @return La ruta dentro del proyecto de la imagen de las botas
     */
    public String getImagen(){
        return this.imagen;
    }
}
