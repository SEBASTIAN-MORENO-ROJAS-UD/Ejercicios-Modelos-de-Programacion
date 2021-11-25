/**
 * Interfaz que determina el comportamiento de las clases Punto2D y Punto3D, como por ejemplo moverse en los ejes
 * o calcular distancias
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 */

public interface Punto {

    /**
     * Método que devuelve la componente en el eje X del punto
     * @return Componente en el eje X del punto
     */
    public float getCorx();

    /**
     * Método que devuelve la componente en el eje Y del punto
     * @return Componente en el eje Y del punto
     */
    public float getCory();

    /**
     * Mueve el punto en dirección del eje X sumándole una cantidad a la componente X
     * @param a Cantidad que se desplaza el punto en el eje X
     */
    public void moverX(float a);

    /**
     * Mueve el punto en dirección del eje Y sumándole una cantidad a la componente Y
     * @param a Cantidad que se desplaza el punto en el eje Y
     */
    public void moverY(float a);

    /**
     * Mueve el punto en dirección de los ejes cantidades distintas en cada eje
     */
    public void moverDiagonal();

    /**
     * Mueve el punto en dirección de los ejes la misma cantidad
     * @param a Cantidad que se desplaza el punto en los ejes
     */
    public void moverDiagonal(float a);

    /**
     * Calcula la distancia que hay entre el punto y el origen de coordenadas
     * @return La distancia entre el punto y el origen
     */
    public double distancia();

    /**
     * Calcula la distancia que hay entre dos puntos
     * @param p Es el segundo punto con el que se va a calcular la distancia
     * @return La distancia entre los dos puntos
     */
    public double distancia(Punto p);

    /**
     * Le pide la usuario las coordenadas del punto para definirlas
     */
    public void leer();

    /**
     * Muestra por consola las coordenadas del punto
     */
    public void imprimir();
}
