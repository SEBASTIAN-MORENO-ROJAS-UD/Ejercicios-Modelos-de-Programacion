/**
 * Punto 3D va a definir un punto en el espacio 3D, pudiendo moverse en los ejes, así como calcular
 * la distancia con el origen u otro punto, entre otras cosas
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * 
 */

import java.util.Scanner;

class Punto3D implements Punto {

    private float corX;
    private float corY;
    private float corZ;

    public Punto3D(){
        corX = 0;
        corY = 0;
        corZ = 0;
    }
    
    /**
     * Constructor que crea un punto en 3D recibiendo por parámetro tres números float
     * @param x Es la componente en el eje X del punto 3D
     * @param y Es la componente en el eje Y del punto 3D
     * @param z Es la componente en el eje Z del punto 3D
     */
    public Punto3D(float x, float y, float z){
        corX = x;
        corY = y;
        corZ = z;
    }

    /**
     * Define la componente en el eje X del punto 3D
     * @param corx Componente en el eje X del punto 3D
     */
    public void setCorx(float corx){
        this.corX = corx;
    }

    /**
     * Define la componente en el eje Y del punto 3D
     * @param cory Componente en el eje Y del punto 3D
     */
    public void setCory(float cory){
        this.corY = cory;
    }

    /**
     * Define la componente en el eje Z del punto 3D
     * @param z Componente en el eje Z del punto 3D
     */
    public void setCorz(float z){
        this.corZ = z;
    }

    /**
     * Método que devuelve la componente en el eje X del punto 3D
     * @return Componente en el eje X del punto 3D
     */
    public float getCorx(){
        return this.corX;
    }

    /**
     * Método que devuelve la componente en el eje Y del punto 3D
     * @return Componente en el eje Y del punto 3D
     */
    public float getCory(){
        return this.corY;
    }

    /**
     * Método que devuelve la componente en el eje Z del punto 3D
     * @return Componente en el eje Z del punto 3D
     */
    public float getCorz(){
        return this.corZ;
    }

    /**
     * Mueve el punto 3D en dirección del eje X sumándole una cantidad a la componente X
     * @param x Cantidad que se desplaza el punto 3D en el eje X
     */
    public void moverX(float x){
        this.corX += x;
    }

    /**
     * Mueve el punto 3D en dirección del eje Y sumándole una cantidad a la componente Y
     * @param y Cantidad que se desplaza el punto 3D en el eje Y
     */
    public void moverY(float y){
        this.corY += y;
    }

    /**
     * Mueve el punto 3D en dirección del eje Z sumándole una cantidad a la componente Z
     * @param z Cantidad que se desplaza el punto 3D en el eje Z
     */
    public void moverZ(float z){
        this.corZ += z;
    }

    /**
     * Mueve el punto 3D en dirección del eje X, Y y Z la misma cantidad
     * @param a Cantidad que se desplaza el punto 3D en el eje X, Y y Z
     */
    public void moverDiagonal(float a){

        this.moverX(a);
        this.moverY(a);
        this.moverZ(a);
    }

    /**
     * Mueve el punto 3D en la dirección del eje X, Y y Z cantidades distintas en cada eje
     */
    public void moverDiagonal(){

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la coordenada nueva X del punto");
        float x = s.nextFloat();
        System.out.println("Ingrese la coordenada nueva Y del punto");
        float y = s.nextFloat();
        System.out.println("Ingrese la coordenada nueva Z del punto");
        float z = s.nextFloat();

        this.moverX(x);
        this.moverY(y);
        this.moverZ(z);
    }

    /**
     * Calcula la distancia que hay entre el punto 3D y el origen de coordenadas
     * @return La distancia entre el punto 3D y el origen
     */
    public double distancia(){

        return Math.sqrt(Math.pow(this.getCorx(), 2) + Math.pow(this.getCory(), 2) + Math.pow(this.corZ, 2));
    }

    /**
     * Calcula la distancia que hay entre dos puntos 3D
     * @param p2 Es el segundo punto 3D con el que se va a calcular la distancia
     * @return La distancia entre los dos puntos 3D
     */
    public double distancia(Punto p2){

        float restax = this.corX - p2.getCorx();

        float restay = this.corY - p2.getCory();

        //float restaz=this.corZ-p2.getCorz();
        return Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2));
    }
    
    /**
     * Le pide la usuario las coordenadas X, Y y Z del punto 3D para definirlas
     */
    public void leer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X del punto");
        this.corX = s.nextFloat();
        System.out.println("Ingrese la coordenada Y del punto");
        this.corY = s.nextFloat();
        System.out.println("Ingrese la coordenada Z del punto");
        this.corZ = s.nextFloat();
    }
    
    /**
     * Muestra por consola las coordenadas del punto 3D
     */
    public void imprimir(){
        System.out.println("(" + this.getCorx() + ", " + this.getCory() + ", " + this.corZ + ")");
    }
}
