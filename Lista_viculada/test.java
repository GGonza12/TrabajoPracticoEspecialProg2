package Lista_viculada;

import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		Comparator<String>compString = new ComparadorString();
		Lista_vinculada<String> lsString= new Lista_vinculada<String>(compString);
		lsString.insertarOrdenado("Fácil");
		lsString.insertarOrdenado("Es");
		lsString.insertarOrdenado("Parcial");
		lsString.insertarOrdenado("Prog2");
		Comparator<Integer>comp2 = new ComparadorInt();
		Lista_vinculada<Integer> lsInt= new Lista_vinculada<Integer>(comp2);
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
		lsString.mostrarLista();
		lsString.obtenerPrimeraOcurrencia("Parcial");
		//System.out.println("Nodo en posicion " +pos +" eliminado");
		//System.out.println("Nodos b eliminados");
		//ls.mostrarLista();

	}

}
