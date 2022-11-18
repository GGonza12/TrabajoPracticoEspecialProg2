package Lista_viculada;

import java.util.ArrayList;

public class Grupo extends ElementoUniversidad{
	private ArrayList<ElementoUniversidad> elementos; 
	public Grupo(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}
	public void agregarElemento(ElementoUniversidad e) {
		elementos.add(e);
	}
	@Override
	public int getCantidadAlumnos() {
		int cant=0;
		for(int i=0;i<elementos.size();i++) {
			cant+= elementos.get(i).getCantidadAlumnos();
		}
		return cant;
	}
	
}
 