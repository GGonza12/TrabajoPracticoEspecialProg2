package comparadores;

import java.util.Comparator;


import Lista_viculada.ElementoUniversidad;

public class ComparadorCantidadAlumnos implements Comparator<ElementoUniversidad> {

	@Override
	public int compare(ElementoUniversidad o1, ElementoUniversidad o2) {
		// TODO Auto-generated method stub
		return o1.getCantidadAlumnos() - o2.getCantidadAlumnos();
	}

}
