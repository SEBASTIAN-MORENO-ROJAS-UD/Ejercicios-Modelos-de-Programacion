package equipamiento.fabricas;

import equipamiento.productos.*;

public interface FabricaAbstracta{

	public Casco crearCasco();
	public Armadura crearArmadura();
	public Botas crearBotas();
	public Arma crearArma();
}