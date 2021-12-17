package personaje.fabrica;

import personaje.prototipos.*;
import equipamiento.AbstractFactory;

public class CreadorPersonaje{
	private Guerrero guerrero;
	private Ogro ogro;
	private Golem golem;

	public CreadorPersonaje(){

		guerrero = new Guerrero();
		ogro = new Ogro();
		golem = new Golem();
		
		AbstractFactory aFactory = new AbstractFactory();
		
		aFactory.generarEquipamiento(1);
		guerrero.setCasco(aFactory.getCasco());
		guerrero.setArmadura(aFactory.getArmadura());
		guerrero.setBotas(aFactory.getBotas());
		guerrero.setArma(aFactory.getArma());
		guerrero.setImagen("Imagenes/Personajes/Guerrero.jpeg");

		aFactory.generarEquipamiento(2);
		ogro.setCasco(aFactory.getCasco());
		ogro.setArmadura(aFactory.getArmadura());
		ogro.setBotas(aFactory.getBotas());
		ogro.setArma(aFactory.getArma());
		ogro.setImagen("Imagenes/Personajes/Ogro.jpeg");

		aFactory.generarEquipamiento(3);
		golem.setCasco(aFactory.getCasco());
		golem.setArmadura(aFactory.getArmadura());
		golem.setBotas(aFactory.getBotas());
		golem.setArma(aFactory.getArma());
		golem.setImagen("Imagenes/Personajes/Golem.jpeg");
	}

	public Personaje retornarClon(String personaje) {
    if ("Guerrero".equals(personaje)) {
			return (Personaje) guerrero.clone();
    }
		else if ("Ogro".equals(personaje)) {
      
			return (Personaje) ogro.clone();
    }
		else if ("Golem".equals(personaje)) {
      
			return (Personaje) golem.clone();
    }

    return null;
  }
}