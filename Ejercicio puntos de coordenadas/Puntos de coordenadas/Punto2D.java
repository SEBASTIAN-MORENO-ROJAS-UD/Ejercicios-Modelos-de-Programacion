/**
 * Punto 2D va a definir un punto en el plano 2D, pudiendo moverse en los ejes, así como calcular
 * la distancia con el origen u otro punto, entre otras cosas
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * 

*/
import java.util.Scanner;
public class Punto2D implements Punto{

    private float corX;
    private float corY;

    public Punto2D(){
        corX = 0;
        corY = 0;
    }
    
    /**
     * 
     * Constructor que crea un punto en 2D recibiendo por parámetro dos números float
     * @param a Es la componente en el eje X del punto 2D
     * @param b Es la componente en el eje Y del punto 2D
     */
    public Punto2D(float a, float b){
        corX = a;
        corY = b;
    }
    
    /**
     * Define la componente en el eje X del punto 2D
     * @param corx Componente en el eje X del punto 2D
     */
    public void setCorx(float corx){
        this.corX = corx;
    }

    /**
     * Define la componente en el eje Y del punto 2D
     * @param cory Componente en el eje X del punto 2D
     */   
    public void setCory(float cory){
        this.corY = cory;
    }

    /**
     * Método que devuelve la componente en el eje X del punto 2D
     * @return Componente en el eje X del punto 2D
     */
    public float getCorx(){
        return this.corX;
    }
    
    /**
     * Método que devuelve la componente en el eje Y del punto 2D
     * @return Componente en el eje Y del punto 2D
     */
    public float getCory(){
        return this.corY;
    }
    
    /**
     * Mueve el punto 2D en dirección del eje X sumándole una cantidad a la componente X
     * @param x Cantidad que se desplaza el punto 2D en el eje X
     */
    public void moverX(float x){
        this.corX += x;
    }
    
    /**
     * Mueve el punto 2D en dirección del eje Y sumándole una cantidad a la componente Y
     * @param y Cantidad que se desplaza el punto 2D en el eje Y
     */
    public void moverY(float y){
        this.corY += y;
    }
    
    /**
     * Mueve el punto 2D en dirección del eje X y Y la misma cantidad
     * @param a Cantidad que se desplaza el punto 2D en el eje X y Y
     */
    public void moverDiagonal(float a){
        this.moverX(a);
        this.moverY(a);
    }

    /**
     * Mueve el punto 2D en la dirección del eje X y Y cantidades distintas en cada eje
     */
    public void moverDiagonal(){
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la coordenada nueva X del punto");
        float x = s.nextFloat();
        System.out.println("Ingrese la coordenada nueva Y del punto");
        float y = s.nextFloat();

        this.moverX(x);
        this.moverY(y);
    }

    /**
     * Calcula la distancia que hay entre el punto 2D y el origen de coordenadas
     * @return La distancia entre el punto 2D y el origen
     */
    public double distancia(){

        return Math.sqrt(Math.pow(this.corX, 2) + Math.pow(this.corY, 2));
    }

    /**
     * Calcula la distancia que hay entre dos puntos 2D
     * @param p2 Es el segundo punto 2D con el que se va a calcular la distancia
     * @return La distancia entre los dos puntos 2D
     */
    public double distancia(Punto p2){

        float restax = this.corX - p2.getCorx();

        float restay = this.corY - p2.getCory();

        return Math.sqrt(Math.pow(restax, 2) + Math.pow(restay, 2));

    }
    
    /**
     * Le pide la usuario las coordenadas X y Y del punto 2D para definirlas
     */
    public void leer(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la coordenada X del punto");
        this.corX = s.nextFloat();
        System.out.println("Ingrese la coordenada Y del punto");
        this.corY = s.nextFloat();
    }
    
    /**
     * Muestra por consola las coordenadas del punto 2D
     */
    public void imprimir(){
        System.out.println("(" + this.corX + ", " + this.corY + ")");
    }
}
