package Modelo.equipamiento.fabricas;

import Modelo.equipamiento.productos.Arma;
import Modelo.equipamiento.productos.BotasHierro;
import Modelo.equipamiento.productos.Armadura;
import Modelo.equipamiento.productos.Botas;
import Modelo.equipamiento.productos.CascoHierro;
import Modelo.equipamiento.productos.Espada;
import Modelo.equipamiento.productos.Casco;
import Modelo.equipamiento.productos.ArmaduraHierro;
import Modelo.equipamiento.fabricas.FabricaAbstracta;

/**
 * Esta clase se encarga de crear y retornar la familia de objetos de tipo hierro (Casco, Armadura y Botas) junto con un objeto de tipo Arma que usan los objetos de tipo Guerrero
 * @author Sebastian Moreno Rojas, Juan Esteban Forero Rodriguez, Hanna Valentina Sarmiento Marquez
 * @version 05/01/2022
 */

public class FabricaGuerrero implements FabricaAbstracta{

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearCaso de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Casco (concretamente de tipo CascoHierro) y lo retorna
     * @return Objeto de tipo Casco
     */
    @Override
    public Casco crearCasco(){
        String nombre = "Casco de hierro";
        String descripcion = "Este casco esta hecho de hierro cuyo metal ha sido  extraído de las minas de…. Suele ser empleado por los guerreros, ya que los humanos son los únicos capaces de moldear dicho metal.";
        String imagen = "/Imagenes/Equipamiento/Cascos/cascoHierro.jpeg";
        return new CascoHierro(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArmadura de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Armadura (concretamente de tipo ArmaduraHierro) y lo retorna
     * @return Objeto de tipo Armadura
     */
    @Override
    public Armadura crearArmadura(){
        String nombre = "Armadura de hierro";
        String descripcion = "Esta armadura hecha de una sola pieza da gran resistencia a los golpes. Aunque es un poco pesada puede ser utilizada sin ninguna complicación en combate.";
        String imagen = "/Imagenes/Equipamiento/Armaduras/armaduraHierro.jpeg";
        return new ArmaduraHierro(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearBotas de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Botas (concretamente de tipo BotasHierro) y lo retorna
     * @return Objeto de tipo Botas
     */
    @Override
    public Botas crearBotas(){
        String nombre = "Botas de hierro";
        String descripcion = "Estas botas de hierro proveen de gran defensa a su portador pero su mayor desventaja es su peso lo que resta velocidad a quien las lleva.";
        String imagen = "/Imagenes/Equipamiento/Botas/botasHierro.jpeg";
        return new BotasHierro(nombre, descripcion, imagen);
    }

    /**
     * Metodo en el cual se describe el comportamiento del metodo abstracto crearArma de la interfaz FabricaAbstracta
     * Crea un objeto de tipo Arma (concretamente de tipo Espada) y lo retorna
     * @return Objeto de tipo Arma
     */
    @Override
    public Arma crearArma(){
        String nombre = "Espada de damasco";
        String descripcion = "Esta espada de hierro mítico de damasco es el arma más confiable pues tiene una larga duración y además es muy ágil de llevar en combate.";
        String imagen = "/Imagenes/Equipamiento/Armas/espada.jpeg";
        return new Espada(nombre, descripcion, imagen);
    }
}
