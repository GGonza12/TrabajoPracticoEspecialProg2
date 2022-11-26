package comparadores;

import java.util.Comparator;

import Lista_viculada.Alumno;



public class ComparadorDni implements Comparator<Alumno>{

	@Override
	public int compare(Alumno o1, Alumno o2) {
		
		return o1.getDni()-o2.getDni();
	}

	



	

}
