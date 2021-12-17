package equipamiento.fabricas;

import equipamiento.productos.*;

public class FabricaGolem implements FabricaAbstracta {

    @Override
    public Casco crearCasco() {
        String nombre = "Casco de piedra";
        String descripcion = "El casco de fosfidita está hecho de una extraña piedra que solo se encuentra en el reino de los golems. Es muy pesado aunque la increíble fuerza de los goles permite levantarlos como si de una pluma se tratase.";
        String imagen = "Imagenes/Equipamiento/Cascos/cascoPiedra.jpeg";
        return new CascoPiedra(nombre, descripcion, imagen);
    }

    @Override
    public Armadura crearArmadura() {
        String nombre = "Armadura de piedra";
        String descripcion = "Esta armadura es la mas pesada de todas debido a su material, sin embargo a pesar de su peso es la que mas aguanta golpes de todas.";
        String imagen = "Imagenes/Equipamiento/Armaduras/armaduraPiedra.jpeg";
        return new ArmaduraPiedra(nombre, descripcion, imagen);
    }

    @Override
    public Botas crearBotas() {
        String nombre = "Botas de piedra";
        String descripcion = "Estas botas son exclusivas de los golem debido a que solo ellos son capaces de portarlas. Dan una muy buena defensa pero una mala movilidad en combate.";
        String imagen = "Imagenes/Equipamiento/Botas/botasPiedra.jpeg";
        return new BotasPiedra(nombre, descripcion, imagen);
    }

    @Override
    public Arma crearArma() {
        String nombre = "Mazo de fosfidita";
        String descripcion = "Este mazo de fosfidita es el arma mas pesada y lenta, sin embargo solo basta un golpe para derrotar a los guerreros y dos para abatir a los ogros.";
        String imagen = "Imagenes/Equipamiento/Armas/mazo.jpeg";
        return new Mazo(nombre, descripcion, imagen);
    }
}
