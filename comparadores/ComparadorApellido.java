package comparadores;

import java.util.Comparator;

import Lista_viculada.Alumno;

public class ComparadorApellido implements Comparator<Alumno> {

	@Override
	public int compare(Alumno o1, Alumno o2) {
		// TODO Auto-generated method stub
		 return o1.getApellido().compareTo(o2.getApellido());
	}

}
