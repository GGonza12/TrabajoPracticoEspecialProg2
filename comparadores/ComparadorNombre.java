package comparadores;

import java.util.Comparator;

import Lista_viculada.Alumno;

public class ComparadorNombre<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		Alumno a1= (Alumno) o1;
		Alumno a2= (Alumno) o2;
		return a1.getNombre().compareTo(a2.getNombre());
	}

}
