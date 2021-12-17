package personaje;

import java.util.ArrayList;
import personaje.prototipos.*;
import personaje.fabrica.CreadorPersonaje;

public class Prototype{
	
	ArrayList<Personaje> clones = new ArrayList<Personaje>();
	CreadorPersonaje creador = new CreadorPersonaje();

	public ArrayList<Personaje> generarGuerreros(int cantidad){
		
		for(int i=0; i<cantidad; i++){
			Personaje personaje = creador.retornarClon("Guerrero");
			clones.add(personaje);
		}
		return clones;
	}

	public ArrayList<Personaje> generarOgros(int cantidad){
		
		for(int i=0; i<cantidad; i++){
			Personaje personaje = creador.retornarClon("Ogro");
			clones.add(personaje);
		}
		return clones;
	}

	public ArrayList<Personaje> generarGolems(int cantidad){
		
		for(int i=0; i<cantidad; i++){
			Personaje personaje = creador.retornarClon("Golem");
			clones.add(personaje);
		}
		return clones;
	}
}