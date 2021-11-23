public class Linea{

	private Punto p1;
	private Punto p2;

  public Linea(){

  }

  public Linea(Punto a, Punto b){
    p1=a;
    p2=b;
  }
  
  ////Setters
  public void setP1(Punto2D a){
    this.p1=a;
  }

  public void setP2(Punto3D a){
    this.p2=a;
  }

  ////Getters
  public Punto getP1(){
    return this.p1;
  }
  
  public Punto getP2(){
    return this.p2;
  }

  //Magnitud de la linea
  public double magnitud(){
    return p1.distancia(p2);
  }

  //Mover ambos puntos en x
  public void moverX(float x){

    this.p1.moverX(x);
    this.p2.moverX(x);
  }
  
  //Mover ambos puntos en y
  public void moverY(float y){

    this.p1.moverY(y);
    this.p2.moverY(y);
  }

  //Mover ambos puntos de la misma manera, la misma cantidad en los tres ejes
  public void moverDiagonal(float a){
    this.p1.moverDiagonal(a);
    this.p2.moverDiagonal(a);
  }
  
  //Mover ambos puntos de la misma manera, pero una cantidad distinta para cada eje
  public void moverDiagonal(){
    this.p1.moverDiagonal();
    this.p2.moverDiagonal();
  }
}