import java.util.Scanner;

public class Punto2D implements Punto{
  private float corX;
  private float corY;
  
  public Punto2D(){
   corX=0;
   corY=0;
  }

  public Punto2D(float a, float b){
    corX=a;
    corY=b;
  }
  ////Setters
  public void setCorx(float corx){
    this.corX=corx;
  }

  public void setCory(float cory){
    this.corY=cory;
  }

  ////Getters
  public float getCorx(){
    return this.corX;
  }

  public float getCory(){
    return this.corY;
  }

  //Mover en x
  public void moverX(float x){
    this.corX+=x;
  }
  
  //Mover en y
  public void moverY(float y){
    this.corY+=y;
  }

  //Mover diagonal
  public void moverDiagonal(float a){
    this.moverX(a);
    this.moverY(a);
  }

  //Mover en diagonal por separado;
  public void moverDiagonal(){
    Scanner s = new Scanner(System.in);

    System.out.println("Ingrese la coordenada nueva X del punto");
    float x = s.nextFloat();
    System.out.println("Ingrese la coordenada nueva Y del punto");
    float y = s.nextFloat();

    this.moverX(x);
    this.moverY(y);
  }

  //Distancia con el origen
  public double distancia(){

    return Math.sqrt(Math.pow(this.corX,2) + Math.pow(this.corY,2));
  }

  //Distancia entre dos puntos
  public double distancia(Punto p2){

    float restax=this.corX-p2.getCorx();
    
    float restay=this.corY-p2.getCory();

    return Math.sqrt(Math.pow(restax,2) + Math.pow(restay,2));

  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    System.out.println("Ingrese la coordenada x del punto");
    this.corX=s.nextFloat();
    System.out.println("Ingrese la coordenada y del punto");
    this.corY=s.nextFloat();
  }

  public void imprimir(){
    System.out.println("(" + this.corX + ", " + this.corY + ")");
  }
}
