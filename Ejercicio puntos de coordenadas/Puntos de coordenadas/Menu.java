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
 
	public void seleccion (){
		while(!salir){
 
			System.out.println("--------------------------------------");
			System.out.println("Escoja la opcion de la dimension de los puntos");

			System.out.println("1.) Puntos en 2 dimensiones");
			System.out.println("2.) Puntos en 3 dimensiones");

			dimension = sn.nextInt();

			if(dimension == 1){
				opciones1();
			}
			else if(dimension == 2){
				opciones2();
			}
			else{
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
						System.out.println("(" + punto.getCorx()  + punto.getCory() + punto.getCorz() + ")");
					break;
					default:
						System.out.println("Opcion no valida");
					break;
  			}
				puntoInfo();
				
      }catch (InputMismatchException e) {
        System.out.println("Debes insertar un número");
        sn.next();
      }
    }
  }

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

	public void opciones2(){
		opciones1();
		System.out.println("12.) Mover en Z el punto");
	}

	public void puntoInfo(){
		if(opcion==3 || opcion==4 || opcion==5 || opcion==6){
    	System.out.println("El punto esá dado por las coordenadas: ");
    	a.imprimir();
    }
    else if(opcion==7 || opcion==8 || opcion==9 || opcion==10 | opcion==11){
    	System.out.println("El primer punto que forma la linea esá dado por las coordenadas: ");
    	a.imprimir();

    	System.out.println("El segundo punto que forma la linea esá dado por las coordenadas: ");
    	b.imprimir();
    }
	}

				
	public void unPunto(){
		
		System.out.println("Ingrese la coordenada X del punto");
		float x = sn.nextFloat();
		System.out.println("Ingrese la coordenada Y del punto");
		float y = sn.nextFloat();

		if(dimension == 1){
			a = new Punto2D(x, y);
		}
		else if(dimension == 2){
			System.out.println("Ingrese la coordenada Z del punto");
			float z = sn.nextFloat();
			a = new Punto3D(x, y, z);
		}
	}

	public void dosPuntos(){

		System.out.println("Ingrese las coordenadas del primer punto");
		unPunto();

		System.out.println("Ingrese la coordenada X del  segundo punto");
		float x = sn.nextFloat();
		System.out.println("Ingrese la coordenada Y del segundo punto");
		float y = sn.nextFloat();
		
		if(dimension == 1){
			b = new Punto2D(x, y);
		}
		else if(dimension == 2){
			System.out.println("Ingrese la coordenada Z del punto");
			float z = sn.nextFloat();
			b = new Punto3D(x, y, z);
		}
	}
}	