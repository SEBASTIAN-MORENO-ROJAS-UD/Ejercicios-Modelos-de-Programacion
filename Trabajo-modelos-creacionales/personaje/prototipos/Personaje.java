package personaje.prototipos;

import equipamiento.productos.*;


public class Personaje implements Cloneable{

	private Casco casco;
	private Armadura armadura;
	private Botas botas;
	private Arma arma;
	private String imagen;


	public void setCasco(Casco casco){
		this.casco = casco;
	}

	public void setArmadura(Armadura armadura){
		this.armadura = armadura;
	}

	public void setBotas(Botas botas){
		this.botas = botas;
	}

	public void setArma(Arma arma){
		this.arma = arma;
	}

	public void setImagen(String direccion){
		this.imagen = direccion;
	}

	public Casco getCasco(){
		return this.casco;
	}

	public Armadura getArmadura(){
		return this.armadura;
	}

	public Botas getBotas(){
		return this.botas;
	}

	public Arma getArma(){
		return this.arma;
	}

	public String getImagen(){
		return this.imagen;
	}

	@Override
	public Personaje clone(){

		Personaje clonedPersonaje = null;

		try{
			clonedPersonaje = (Personaje) super.clone();
			clonedPersonaje.setCasco(this.casco);
			clonedPersonaje.setArmadura(this.armadura);
			clonedPersonaje.setBotas(this.botas);
			clonedPersonaje.setArma(this.arma);
			clonedPersonaje.setImagen(this.imagen);
		}
		catch(CloneNotSupportedException e){}

		return clonedPersonaje;
	}
}