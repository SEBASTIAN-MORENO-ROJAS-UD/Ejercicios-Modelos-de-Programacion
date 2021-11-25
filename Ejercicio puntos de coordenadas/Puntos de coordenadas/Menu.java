/**
 * Menú va a mostrarle un menú de opciones de lo que puede hacer con puntos 2D o 3D, mostrando la
 * información resultante según sea el caso de cada opción
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * 

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu{

    Scanner sn = new Scanner(System.in);
    public boolean salir = false;
    public int opcion;
    int dimension;

    Punto a;
    Punto b;
    Linea l;

    /**
     * Le da a elegir al usuario si quiere utilizar puntos en 2D o 3D, luego le muestra el menú de opciones
     * de lo que puede hacer con los puntos, y según la opción que seleccione, se muestra la información.
     */
    public void seleccion(){
        while(!salir){

            System.out.println("--------------------------------------");
            System.out.println("Escoja la opcion de la dimension de los puntos");

            System.out.println("1.) Puntos en 2 dimensiones");
            System.out.println("2.) Puntos en 3 dimensiones");

            dimension = sn.nextInt();

            if (dimension == 1){
                opciones1();
            }
            else if (dimension == 2){
                opciones2();
            }
            else {
                System.out.println("Opcion no valida");
                continue;
            }

            try {
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch(opcion){
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        dosPuntos();
                        System.out.println("La distancia entre los puntos es: " + a.distancia(b));

                        break;
                    case 2:
                        unPunto();
                        System.out.println("La distancia que hay desde el origen hasta el punto es de: " + a.distancia());
                        break;
                    case 3:
                        unPunto();
                        puntoInfo();
                        System.out.println("Ingrese la cantidad que quiere que se desplace el punto en X");
                        a.moverX(sn.nextFloat());
                        break;
                    case 4:
                        unPunto();
                        puntoInfo();
                        System.out.println("Ingrese la cantidad que quiere que se desplace el punto en Y");
                        a.moverY(sn.nextFloat());
                        break;
                    case 5:
                        unPunto();
                        puntoInfo();
                        System.out.println("Ingrese la cantidad que quiere que se desplace de en los ejes");
                        a.moverDiagonal(sn.nextFloat());
                        break;
                    case 6:
                        unPunto();
                        puntoInfo();
                        a.moverDiagonal();
                        break;
                    case 7:
                        dosPuntos();
                        l = new Linea(a, b);
                        System.out.println("La magnitud de la linea es de:" + l.magnitud());
                        break;
                    case 8:
                        dosPuntos();
                        puntoInfo();
                        l = new Linea(a, b);
                        System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en X");
                        l.moverX(sn.nextFloat());
                        break;
                    case 9:
                        dosPuntos();
                        puntoInfo();
                        l = new Linea(a, b);
                        System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en Y");
                        l.moverY(sn.nextFloat());
                        break;
                    case 10:
                        dosPuntos();
                        puntoInfo();
                        l = new Linea(a, b);
                        System.out.println("Ingrese la cantidad que quiere que se desplacen los puntos en cada eje");
                        l.moverDiagonal(sn.nextFloat());
                        break;
                    case 11:
                        dosPuntos();
                        puntoInfo();
                        l = new Linea(a, b);
                        l.moverDiagonal();
                        break;
                    case 12:
                        System.out.println("Ingrese la coordenada x del punto");
                        float x = sn.nextFloat();
                        System.out.println("Ingrese la coordenada y del punto");
                        float y = sn.nextFloat();
                        System.out.println("Ingrese la coordenada z del punto");
                        float z = sn.nextFloat();
                        Punto3D punto = new Punto3D(x, y, z);

                        System.out.println("Ingrese la cantidad que quiere que se desplace el 	punto");
                        punto.moverZ(sn.nextFloat());

                        System.out.println("El punto esá dado por las coordenadas: ");
                        System.out.println("(" + punto.getCorx() + punto.getCory() + punto.getCorz() + ")");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                puntoInfo();

            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }

    /**
     * Muestra las opciones de lo que puede hacer el usuario con los puntos, ya sean 2D o 3D
     */
    public void opciones1(){
        System.out.println("--------------------------------------");
        System.out.println("0.) Digite 0 para salir");
        System.out.println("1.) Distancia entre dos puntos");
        System.out.println("2.) Distancia entre el punto y el origen");
        System.out.println("3.) Mover el punto punto de forma horizontal");
        System.out.println("4.) Mover el punto de forma vertical");
        System.out.println("5.) Mover las comonentes de un punto la misma cantidad");
        System.out.println("6.) Mover las componentes de un punto distancias diferentes");
        System.out.println("7.) Magnitud de la linea formada por los dos puntos");
        System.out.println("8.) Mover en X la linea formada por los dos puntos");
        System.out.println("9.) Mover en Y la linea formada por los dos puntos");
        System.out.println("10.) Mover las componentes de los puntos que forman una linea la misma cantidad");
        System.out.println("11.) Mover las componentes de los puntos que forman una linea distancias distintas");

        System.out.println("Ingrese el número de la opción que desee:");
    }

    /**
     * Muestra una opción exclusiva de los puntos en 3D, moverlo en el eje Z
     */
    public void opciones2(){
        opciones1();
        System.out.println("12.) Mover en Z el punto");
    }

    /**
     * Muestra la información del punto o la línea con la que se está trabajando, según sea el caso
     */
    public void puntoInfo(){
        if (opcion == 3 || opcion == 4 || opcion == 5 || opcion == 6) {
            System.out.println("El punto esá dado por las coordenadas: ");
            a.imprimir();
        } else if (opcion == 7 || opcion == 8 || opcion == 9 || opcion == 10 | opcion == 11) {
            System.out.println("El primer punto que forma la linea esá dado por las coordenadas: ");
            a.imprimir();

            System.out.println("El segundo punto que forma la linea esá dado por las coordenadas: ");
            b.imprimir();
        }
    }

    /**
     * Si la opción seleccionada del meú implica un único punto, se le pide al usuario las coordenadas del punto
     * para instanciar el atributo Punto a que es el punto con el que se va a trabajar
     */
    public void unPunto(){

        System.out.println("Ingrese la coordenada X del punto");
        float x = sn.nextFloat();
        System.out.println("Ingrese la coordenada Y del punto");
        float y = sn.nextFloat();

        if (dimension == 1) {
            a = new Punto2D(x, y);
        } else if (dimension == 2) {
            System.out.println("Ingrese la coordenada Z del punto");
            float z = sn.nextFloat();
            a = new Punto3D(x, y, z);
        }
    }

    /**
     * Si la opción seleccionada del menú implica que se va a trabajar con dos puntos, se le pide al usuario
     * las coordenadas de los puntos para instanciar los atributos Punto a y Punto b, que son los puntos
     * con los que se va a trabajar
     */
    public void dosPuntos(){

        System.out.println("Ingrese las coordenadas del primer punto");
        unPunto();

        System.out.println("Ingrese la coordenada X del  segundo punto");
        float x = sn.nextFloat();
        System.out.println("Ingrese la coordenada Y del segundo punto");
        float y = sn.nextFloat();

        if (dimension == 1){
            b = new Punto2D(x, y);
        }
        else if (dimension == 2){
            System.out.println("Ingrese la coordenada Z del punto");
            float z = sn.nextFloat();
            b = new Punto3D(x, y, z);
        }
    }
}
