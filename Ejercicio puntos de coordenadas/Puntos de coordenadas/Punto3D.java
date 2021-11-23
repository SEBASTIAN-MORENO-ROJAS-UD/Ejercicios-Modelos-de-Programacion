import java.util.Scanner;

class Punto3D extends Punto2D implements Punto{
  private float corZ;

  public Punto3D(){
    super();
    this.corZ=0;
  }
  public Punto3D(float x, float y, float z){
    super(x, y);
    this.corZ=z;
  }

  public void setCorz(float z){
    this.corZ=z;
  }

  public float getCorz(){
    return this.corZ;
  }

  //Mover en z
  public void moverZ(float z){
    this.corZ+=z;
  }
  
  //Mover en diagonal
  public void moverDiagonal(float a){
    super.moverDiagonal(a);
    this.moverZ(a);
  }

  //Mover en diagonal por separado
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

	//Distancia con respecto al origen
  public double distancia(){

    return Math.sqrt(Math.pow(this.getCorx(),2) + Math.pow(this.getCory(),2) + Math.pow(this.corZ,2));
  }

  //Distancia entre dos puntos
  public double distancia(Punto3D p2){

    float restax=this.corX-p2.getCorx();
    
    float restay=this.corY-p2.getCory();

    float restaz=this.corZ-p2.getCorz();

    return Math.sqrt(Math.pow(restax,2) + Math.pow(restay,2) + Math.pow(restaz, 2));
  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    super.leer();
    System.out.println("Ingrese la coordenada Z del punto");
    this.corZ=s.nextFloat();
  }

  public void imprimir(){
    System.out.println("(" + this.getCorx() + ", " + this.getCory() + ", " + this.corZ + ")");
  }
}