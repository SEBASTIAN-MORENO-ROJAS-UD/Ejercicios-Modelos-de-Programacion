package equipamiento.fabricas;

import equipamiento.productos.*;

public class FabricaOgro implements FabricaAbstracta{
	
	@Override
	public Casco crearCasco(){
		String nombre = "Casco de cuero";
		String descripcion = "El casco de cuero es la protección por excelencia de los  ogros, suele ser hecho de piel de jabalí y es cocido con hilos encantados.";
		String imagen = "Imagenes/Equipamiento/Cascos/cascoCuero.jpeg";
		return new CascoCuero(nombre, descripcion, imagen);
	}

	@Override
	public Armadura crearArmadura(){
		String nombre = "Armadura de cuero";
		String descripcion = "Esta armadura hecha de una sola pieza permite ligereza en las batallas a su portador, pero suele ser débil ante los múltiples cortes de espada.";
		String imagen = "Imagenes/Equipamiento/Armaduras/armaduraCuero.jpeg";
		return new ArmaduraCuero(nombre, descripcion, imagen);
	}

	@Override
	public Botas crearBotas(){
		String nombre = "Botas de cuero";
		String descripcion = "Estas botas aunque priorizan la agilidad en combate, no permiten percibir ataques directos a los pies del portador, por lo que cuentan con un poco defensa.";
		String imagen = "Imagenes/Equipamiento/Botas/botasCuero.jpeg";
		return new BotasCuero(nombre, descripcion, imagen);
	}

	@Override
	public Arma crearArma(){
		String nombre = "Lanza de";
		String descripcion = "Esta lanza de ogro es el arma más versátil de todas, pues puede ser usada a distancia y cuerpo a cuerpo.";
		String imagen = "Imagenes/Equipamiento/Armas/lanza.jpeg";
		return new Lanza(nombre, descripcion, imagen);
	}
}