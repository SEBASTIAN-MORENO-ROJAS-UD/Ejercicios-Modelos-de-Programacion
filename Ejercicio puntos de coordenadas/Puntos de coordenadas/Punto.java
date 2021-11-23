public interface Punto{
	public float getCorx();
	public float getCory();
	public void moverX(float a);
	public void moverY(float a);
	public void moverDiagonal();
	public void moverDiagonal(float a);
	public double distancia();
	public double distancia(Punto p);
	public void leer();
	public void imprimir();
}