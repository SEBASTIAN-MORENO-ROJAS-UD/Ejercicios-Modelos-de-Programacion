package Modelo.equipamiento.fabricas;

import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.ArmaduraPiedra;
import Modelo.equipamiento.productos.CascoPiedra;
import Modelo.equipamiento.productos.Mazo;
import Modelo.equipamiento.productos.BotasPiedra;
import Modelo.equipamiento.productos.Casco;
import Modelo.equipamiento.fabricas.FabricaAbstracta;

/**
 * Esta clase se encarga de crear y retornar la familia de objetos de tipo piedra (Casco, Armadura y Botas) junto con un objeto de tipo Arma que usan los objetos de tipo Golem
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class FabricaGolem implements FabricaAbstracta{

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearCaso de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Casco (concretamente de tipo CascoPiedra) y lo retorna
     * @return Objeto de tipo Casco
     */
    @Override
    public Casco crearCasco(){
        String nombre = "Casco de piedra";
        String descripcion = "El casco de fosfidita está hecho de una extraña piedra que solo se encuentra en el reino de los golems. Es muy pesado aunque la increíble fuerza de los goles permite levantarlos como si de una pluma se tratase.";
        String imagen = "/Imagenes/Equipamiento/Cascos/cascoPiedra.jpeg";
        return new CascoPiedra(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArmadura de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Armadura (concretamente de tipo ArmaduraPiedra) y lo retorna
     * @return Objeto de tipo Armadura
     */
    @Override
    public Armadura crearArmadura(){
        String nombre = "Armadura de piedra";
        String descripcion = "Esta armadura es la mas pesada de todas debido a su material, sin embargo a pesar de su peso es la que mas aguanta golpes de todas.";
        String imagen = "/Imagenes/Equipamiento/Armaduras/armaduraPiedra.jpeg";
        return new ArmaduraPiedra(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearBotas de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Botas (concretamente de tipo BotasPiedra) y lo retorna
     * @return Objeto de tipo Botas
     */
    @Override
    public Botas crearBotas(){
        String nombre = "Botas de piedra";
        String descripcion = "Estas botas son exclusivas de los golem debido a que solo ellos son capaces de portarlas. Dan una muy buena defensa pero una mala movilidad en combate.";
        String imagen = "/Imagenes/Equipamiento/Botas/botasPiedra.jpeg";
        return new BotasPiedra(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArma de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Arma (concretamente de tipo Mazo) y lo retorna
     * @return Objeto de tipo Arma
     */
    @Override
    public Arma crearArma(){
        String nombre = "Mazo de fosfidita";
        String descripcion = "Este mazo de fosfidita es el arma mas pesada y lenta, sin embargo solo basta un golpe para derrotar a los guerreros y dos para abatir a los ogros.";
        String imagen = "/Imagenes/Equipamiento/Armas/mazo.jpeg";
        return new Mazo(nombre, descripcion, imagen);
    }
}
