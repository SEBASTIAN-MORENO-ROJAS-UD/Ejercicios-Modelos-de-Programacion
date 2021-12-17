package equipamiento.productos;

public abstract class Armadura{
	
	private String nombre;
	private String descripcion;
	private String imagen;

	public Armadura(String nombre, String descripcion, String imagen){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}

	public void setImagen(String imagen){
		this.imagen = imagen;
	}

	public String getNombre(){
		return this.nombre;
	}

	public String getDescripcion(){
		return this.descripcion;
	}

	public String getImagen(){
		return this.imagen;
	}
}