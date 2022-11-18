package comparadores;

import java.util.Comparator;

import Lista_viculada.ElementoUniversidad;

public class ComparadorCantidadAlumnos<T> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		ElementoUniversidad e1= (ElementoUniversidad) o1;
		ElementoUniversidad e2= (ElementoUniversidad) o2;
		return e1.getCantidadAlumnos() - e2.getCantidadAlumnos();
	}

}
