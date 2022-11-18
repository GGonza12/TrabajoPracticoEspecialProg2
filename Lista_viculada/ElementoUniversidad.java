package Lista_viculada;

public abstract class ElementoUniversidad {
	private String nombre;
	 
	public ElementoUniversidad(String nombre) {
		this.nombre=nombre;
	}
	public abstract int getCantidadAlumnos();
	public String getNombre() {
		return this.nombre;
	}
	
}
