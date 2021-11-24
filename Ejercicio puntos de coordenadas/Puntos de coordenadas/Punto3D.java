import java.util.Scanner;

class Punto3D implements Punto{
  private float corX;
  private float corY;
  private float corZ;

  public Punto3D(){
    corX=0;
    corY=0;
    corZ=0;
  }
  public Punto3D(float x, float y, float z){
    corX = x;
    corY = y;
    corZ = z;
  }

  ////Setters
  public void setCorx(float corx){
    this.corX=corx;
  }

  public void setCory(float cory){
    this.corY=cory;
  }

  public void setCorz(float z){
    this.corZ=z;
  }

  ////Getters
  public float getCorx(){
    return this.corX;
  }

  public float getCory(){
    return this.corY;
  }

  public float getCorz(){
    return this.corZ;
  }

  //Mover en x
  public void moverX(float x){
    this.corX+=x;
  }
  
  //Mover en y
  public void moverY(float y){
    this.corY+=y;
  }

  //Mover en z
  public void moverZ(float z){
    this.corZ+=z;
  }
  
  //Mover en diagonal
  public void moverDiagonal(float a){
    
    this.moverX(a);
    this.moverY(a);
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
  public double distancia(Punto p2){

    float restax=this.corX-p2.getCorx();
    
    float restay=this.corY-p2.getCory();

    //float restaz=this.corZ-p2.getCorz();

    return Math.sqrt(Math.pow(restax,2) + Math.pow(restay,2));
  }

  public void leer(){
    Scanner s=new Scanner(System.in);
    System.out.println("Ingrese la coordenada X del punto");
    this.corX=s.nextFloat();
    System.out.println("Ingrese la coordenada Y del punto");
    this.corY=s.nextFloat();
    System.out.println("Ingrese la coordenada Z del punto");
    this.corZ=s.nextFloat();
  }

  public void imprimir(){
    System.out.println("(" + this.getCorx() + ", " + this.getCory() + ", " + this.corZ + ")");
  }
}
