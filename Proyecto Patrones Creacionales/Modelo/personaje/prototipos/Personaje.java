package Modelo.personaje.prototipos;

import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.Casco;

/**
 * Esta clase define los atributos y metodos de las clases que sean de tipo Personaje, y por lo tanto hereden de esta clase Personaje,
 * permitiendo que los objetos de dichas clases se clonen al implementar la intertfaz Cloneable
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class Personaje implements Cloneable {

    //Campos de la clase
    private Casco casco;
    private Armadura armadura;
    private Botas botas;
    private Arma arma;
    private String imagen;

    /**
     * Define el casco del personaje
     * @param casco Casco del personaje
     */
    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    /**
     * Define la armadura del personaje
     * @param armadura Armadura del personaje
     */
    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    /**
     * Define las botas del personaje
     * @param botas Botas del personaje
     */
    public void setBotas(Botas botas) {
        this.botas = botas;
    }

    /**
     * Define el arma del personaje
     * @param arma Arma del personaje
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /**
     * Define la ruta dentro del proyecto de la imagen del personaje
     * @param direccion Ruta dentro del proyecto de la imagen del personaje
     */
    public void setImagen(String direccion) {
        this.imagen = direccion;
    }

    /**
     * Metodo que devuelve el casco del personaje
     * @return Casco del personaje
     */
    public Casco getCasco() {
        return this.casco;
    }

    /**
     * Metodo que devuelve la armadura del personaje
     * @return Armadura del personaje
     */
    public Armadura getArmadura() {
        return this.armadura;
    }

    /**
     * Metodo que devuelve las botas del personaje
     * @return Botas del personaje
     */
    public Botas getBotas() {
        return this.botas;
    }

    /**
     * Metodo que devuelve el arma del personaje
     * @return Arma del personaje
     */
    public Arma getArma() {
        return this.arma;
    }

    /**
     * Metodo que devuelve la ruta dentro del proyecto de la imagen del personaje
     * @return Ruta dentro del proyecto de la imagen del personaje
     */
    public String getImagen() {
        return this.imagen;
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto clone de la interfaz Cloneable
     * Realiza una deep copy del objeto Personaje y lo retorna
     * @return Una copia del objeto Personaje
     */
    @Override
    public Personaje clone() {

        Personaje clonedPersonaje = null;

        try {
            clonedPersonaje = (Personaje) super.clone();
            clonedPersonaje.setCasco(this.casco);
            clonedPersonaje.setArmadura(this.armadura);
            clonedPersonaje.setBotas(this.botas);
            clonedPersonaje.setArma(this.arma);
            clonedPersonaje.setImagen(this.imagen);
        }
        catch (CloneNotSupportedException e) {
        }
        return clonedPersonaje;
    }
}
