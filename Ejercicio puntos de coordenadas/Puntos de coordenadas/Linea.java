/**
 * Línea va a definir una líne en el plano o en el espacio, identificando un punto inicial y final.
 * La línea se puede mover en los ejes, así como también se puede calcular su magnitud, entre otras cosas
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * 
 */

public class Linea {

    private Punto p1;
    private Punto p2;

    public Linea(){

    }

    /**
     * Constructor que crea una linea que consta de un punto inicial y final
     * @param a Punto incial de la línea
     * @param b Punto final de la línea
     */
    public Linea(Punto a, Punto b){
        p1 = a;
        p2 = b;
    }

    /**
     * Define el punto inicial de la línea
     * @param a Punto inicial de la línea
     */
    public void setP1(Punto2D a){
        this.p1 = a;
    }

    /**
     * Define el punto final de la línea
     * @param a Punto final de la línea
     */
    public void setP2(Punto3D a){
        this.p2 = a;
    }

    /**
     * Método que devuelve el punto iniicial de la línea
     * @return Punto incial de la línea
     */
    public Punto getP1(){
        return this.p1;
    }

    /**
     * Método que devuelve el punto iniicial de la línea
     * @return Punto final de la línea
     */
    public Punto getP2(){
        return this.p2;
    }

    /**
     * Calcula la maginitud de la línea
     * @return Magnitd de la línea
     */
    public double magnitud(){
        return p1.distancia(p2);
    }

    /**
     * Mueve la línea en dirección del eje X moviendo los puntos inicial y final una misma cantidad en el eje X
     * @param x Cantidad que se va a mover la línea en dirección del eje X
     */
    public void moverX(float x){

        this.p1.moverX(x);
        this.p2.moverX(x);
    }

    /**
     * Mueve la línea en dirección del eje X moviendo los puntos inicial y final una misma cantidad en el eje Y
     * @param y Cantidad que se va a mover la línea en dirección del eje X
     */
    public void moverY(float y){

        this.p1.moverY(y);
        this.p2.moverY(y);
    }

    /**
     * Mueve la linea en dirección de los ejes moviendo los puntos inicial y final una misma cantidad en los ejes
     * @param a Cantidad que se mueve la línea en dirección de los ejes
     */
    public void moverDiagonal(float a){
        this.p1.moverDiagonal(a);
        this.p2.moverDiagonal(a);
    }

    /**
     * Mueve la línea en dirección de los ejes moviendo los puntos inicial y final una cantidad distinta en cada eje
     */
    public void moverDiagonal(){
        this.p1.moverDiagonal();
        this.p2.moverDiagonal();
    }
}
