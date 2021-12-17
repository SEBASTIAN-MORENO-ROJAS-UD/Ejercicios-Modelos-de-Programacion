import equipamiento.productos.*;
import equipamiento.AbstractFactory;
import java.util.ArrayList;
import personaje.Prototype;
import personaje.prototipos.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

		/*Prototype p = new Prototype();

		ArrayList<Personaje> personajes = new ArrayList<Personaje>();

		personajes = p.generarGuerreros(3);

		System.out.println(personajes.get(0).getCasco().getDescripcion());*/

		VistaPersonajes vista = new VistaPersonajes();


		/*AbstractFactory aFactory = new AbstractFactory();

		aFactory.generarEquipamiento(1);

		Casco casco = aFactory.getCasco();
		Armadura armadura = aFactory.getArmadura();
		Botas botas = aFactory.getBotas();
		Arma arma = aFactory.getArma();

		System.out.println(casco.getDescripcion());
		System.out.println(armadura.getDescripcion());
		System.out.println(botas.getDescripcion());
		System.out.println(arma.getDescripcion());*/

		/*FabricaAbstracta fabrica = new FabricaGuerrero();

		Casco casco = fabrica.crearCasco();
		Armadura armadura = fabrica.crearArmadura();
		Botas botas = fabrica.crearBotas();
		Arma arma = fabrica.crearArma();

		System.out.println(casco.getNombre());
		System.out.println(armadura.getNombre());
		System.out.println(botas.getNombre());
		System.out.println(arma.getNombre());*/
  }
}