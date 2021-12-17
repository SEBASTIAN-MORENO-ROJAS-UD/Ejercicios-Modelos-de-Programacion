package equipamiento;

import equipamiento.fabricas.*;
import equipamiento.productos.*;

public class AbstractFactory{

	private FabricaAbstracta fabrica;
	private Casco casco;
	private Armadura armadura;
	private Botas botas;
	private Arma arma;


	public void generarEquipamiento(int opcion){
		
		switch(opcion){
			case 1:
				fabrica = new FabricaGuerrero();
			break;
			
			case 2:
				fabrica = new FabricaOgro();
			break;

			case 3:
				fabrica = new FabricaGolem();
			break;
		}
		casco = fabrica.crearCasco();
		armadura = fabrica.crearArmadura();
		botas = fabrica.crearBotas();
		arma = fabrica.crearArma();
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
}