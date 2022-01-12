package Modelo.equipamiento.fabricas;

import Modelo.equipamiento.productos.BotasCuero;
import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.CascoCuero;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.ArmaduraCuero;
import Modelo.equipamiento.productos.Casco;
import Modelo.equipamiento.productos.Lanza;
import Modelo.equipamiento.fabricas.FabricaAbstracta;

/**
 * Esta clase se encarga de crear y retornar la familia de objetos de tipo cuero (Casco, Armadura y Botas) junto con un objeto de tipo Arma que usan los objetos de tipo Ogro
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class FabricaOgro implements FabricaAbstracta{

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearCaso de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Casco (concretamente de tipo CascoCuero) y lo retorna
     * @return Objeto de tipo Casco
     */
    @Override
    public Casco crearCasco(){
        String nombre = "Casco de cuero";
        String descripcion = "El casco de cuero es la protección por excelencia de los  ogros, suele ser hecho de piel de jabalí y es cocido con hilos encantados.";
        String imagen = "/Imagenes/Equipamiento/Cascos/cascoCuero.jpeg";
        return new CascoCuero(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArmadura de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Armadura (concretamente de tipo ArmaduraCuero) y lo retorna
     * @return Objeto de tipo Armadura
     */
    @Override
    public Armadura crearArmadura(){
        String nombre = "Armadura de cuero";
        String descripcion = "Esta armadura hecha de una sola pieza permite ligereza en las batallas a su portador, pero suele ser débil ante los múltiples cortes de espada.";
        String imagen = "/Imagenes/Equipamiento/Armaduras/armaduraCuero.jpeg";
        return new ArmaduraCuero(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearBotas de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Botas (concretamente de tipo BotasCuero) y lo retorna
     * @return Objeto de tipo Botas
     */
    @Override
    public Botas crearBotas(){
        String nombre = "Botas de cuero";
        String descripcion = "Estas botas aunque priorizan la agilidad en combate, no permiten percibir ataques directos a los pies del portador, por lo que cuentan con un poco defensa.";
        String imagen = "/Imagenes/Equipamiento/Botas/botasCuero.jpeg";
        return new BotasCuero(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArma de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Arma (concretamente de tipo Lanza) y lo retorna
     * @return Objeto de tipo Arma
     */
    @Override
    public Arma crearArma(){
        String nombre = "Lanza de";
        String descripcion = "Esta lanza de ogro es el arma más versátil de todas, pues puede ser usada a distancia y cuerpo a cuerpo.";
        String imagen = "/Imagenes/Equipamiento/Armas/lanza.jpeg";
        return new Lanza(nombre, descripcion, imagen);
    }
}
