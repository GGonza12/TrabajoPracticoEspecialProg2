package comparadores;

import java.util.Comparator;

import Lista_viculada.Alumno;



public class ComparadorDni<T> implements Comparator<T>{

	@Override
	public int compare(T o1, T o2) {
		Alumno a1= (Alumno) o1;
		Alumno a2= (Alumno) o2;
		int res=0;
		if(a1.getDni()== a2.getDni()) {
			res=0;
		}
		else if(a1.getDni()< a2.getDni()) {
			res=1;
		}
		else if(a1.getDni()> a2.getDni()) {
			res=-1;
		}
		return res;
	}

	



	

}
