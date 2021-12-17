package equipamiento.fabricas;

import equipamiento.productos.*;

public class FabricaGuerrero implements FabricaAbstracta {

    @Override
    public Casco crearCasco() {
        String nombre = "Casco de hierro";
        String descripcion = "Este casco esta hecho de hierro cuyo metal ha sido  extraído de las minas de…. Suele ser empleado por los guerreros, ya que los humanos son los únicos capaces de moldear dicho metal.";
        String imagen = "Imagenes/Equipamiento/Cascos/cascoHierro.jpeg";
        return new CascoHierro(nombre, descripcion, imagen);
    }

    @Override
    public Armadura crearArmadura() {
        String nombre = "Armadura de hierro";
        String descripcion = "Esta armadura hecha de una sola pieza da gran resistencia a los golpes. Aunque es un poco pesada puede ser utilizada sin ninguna complicación en combate.";
        String imagen = "Imagenes/Equipamiento/Armaduras/armaduraHierro.jpeg";
        return new ArmaduraHierro(nombre, descripcion, imagen);
    }

    @Override
    public Botas crearBotas() {
        String nombre = "Botas de hierro";
        String descripcion = "Estas botas de hierro proveen de gran defensa a su portador pero su mayor desventaja es su peso lo que resta velocidad a quien las lleva.";
        String imagen = "Imagenes/Equipamiento/Botas/botasHierro.jpeg";
        return new BotasHierro(nombre, descripcion, imagen);
    }

    @Override
    public Arma crearArma() {
        String nombre = "Espada de damasco";
        String descripcion = "Esta espada de hierro mítico de damasco es el arma más confiable pues tiene una larga duración y además es muy ágil de llevar en combate.";
        String imagen = "Imagenes/Equipamiento/Armas/espada.jpeg";
        return new Espada(nombre, descripcion, imagen);
    }
}
