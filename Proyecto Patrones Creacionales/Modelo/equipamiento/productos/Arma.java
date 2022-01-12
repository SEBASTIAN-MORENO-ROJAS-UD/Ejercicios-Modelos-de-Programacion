package Modelo.equipamiento.productos;

/**
 * Esta clase de tipo abstracta define la forma de las clases que sean de tipo Arma, y por lo tanto hereden de esta clase Arma
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public abstract class Arma{

    //Campos de la clase
    private String nombre;
    private String descripcion;
    private String imagen;

    /**
     * Constructor que crea un objeto de tipo Arma y sus subclases
     * @param nombre Nombre de la arma
     * @param descripcion Breve descripcion de la arma
     * @param imagen Ruta dentro del proyecto de la imagen de la arma
     */
    public Arma(String nombre, String descripcion, String imagen){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    /**
     * Define el nombre de la arma
     * @param nombre Nombre de la arma
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * Define una breve descripcion de la arma
     * @param descripcion Descripcion de la arma
     */
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    /**
     * Define la ruta dentro del proyecto de la imagen de la arma
     * @param imagen Ruta dentro del proyecto de la imagen de la arma
     */
    public void setImagen(String imagen){
        this.imagen = imagen;
    }

    /**
     * Metodo que devuelve el nombre de la arma
     * @return Nombre de la arma
     */
    public String getNombre(){
        return this.nombre;
    }

    /**
     * Metodo que devuelve la descripcion de la arma
     * @return Drscripcion de la armadura
     */
    public String getDescripcion(){
        return this.descripcion;
    }

    /**
     * Metodo que devuelve la ruta dentro del proyecto de la imagen de la arma
     * @return Ruta dentro del proyecto de la imagen de la arma
     */
    public String getImagen(){
        return this.imagen;
    }
}
