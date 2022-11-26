package comparadores;

import java.util.Comparator;

import Lista_viculada.Alumno;

public class ComparadorNombre implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return o1.getNombre().compareTo(o2.getNombre());
	}

}
