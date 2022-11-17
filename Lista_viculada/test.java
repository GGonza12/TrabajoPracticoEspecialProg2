package Lista_viculada;

import java.util.Comparator;

import comparadores.ComparadorInt;
import comparadores.ComparadorInverso;
import comparadores.ComparadorString;
public class test {

	public static void main(String[] args) {
		Comparator<String>compString = new ComparadorString();
		Comparator<String> compInversoString = new ComparadorInverso<String>(compString);
		Lista_vinculada<String> lsString= new Lista_vinculada<String>(compInversoString);
		lsString.insertarOrdenado("Fácil");
		lsString.insertarOrdenado("Es");
		lsString.insertarOrdenado("Parcial");
		lsString.insertarOrdenado("Prog2");
		Comparator<Integer>comp2 = new ComparadorInt();
		Comparator<Integer> compInversoInt = new ComparadorInverso<Integer>(comp2);
		Lista_vinculada<Integer> lsInt= new Lista_vinculada<Integer>(compInversoInt);
		lsInt.insertarOrdenado(5);
		lsInt.insertarOrdenado(21);
		lsInt.insertarOrdenado(11);
		lsInt.insertarOrdenado(10);
		lsInt.insertarOrdenado(1);
		
		//ls.insertarOrdenado("j");
		//ls.insertarOrdenado("a");
		//ls.insertarOrdenado("test");
		/*String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));
			System.out.println(ls);
		*/
	
		/*lsInt.mostrarLista();
		int pos =2;
		lsInt.eliminarNodo(pos);
		System.out.println("Nodo en posicion " +pos +" eliminado");
		lsInt.mostrarLista();
		//lsInt.eliminarOcurrencias(5);
		//lsInt.mostrarLista();
		lsInt.obtenerPrimeraOcurrencia(21);
		*/
		lsInt.mostrarLista();
		lsString.mostrarLista();
		//lsString.obtenerPrimeraOcurrencia("Fácil");
		//System.out.println("Nodo en posicion " +pos +" eliminado");
		//System.out.println("Nodos b eliminados");
		//ls.mostrarLista();

	}

}
