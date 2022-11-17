package Lista_viculada;

import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		Comparator<String>comp = new ComparadorString();
		Lista_vinculada<String> ls= new Lista_vinculada<String>(comp);
		ls.insertarOrdenado("Fácil");
		ls.insertarOrdenado("Es");
		ls.insertarOrdenado("Parcial");
		ls.insertarOrdenado("Prog2");
		Comparator<Integer>comp2 = new ComparadorInt();
		Lista_vinculada<Integer> ls2= new Lista_vinculada<Integer>(comp2);
		ls2.insertarOrdenado(5);
		ls2.insertarOrdenado(21);
		ls2.insertarOrdenado(11);
		ls2.insertarOrdenado(10);
		ls2.insertarOrdenado(1);
		//ls.insertarOrdenado("j");
		//ls.insertarOrdenado("a");
		//ls.insertarOrdenado("test");
		/*String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));
			System.out.println(ls);
		*/
	
		ls2.mostrarLista();
		int pos =0;
		ls2.eliminarOcurrencias(5);
		ls2.obtenerPrimeraOcurrencia(5);
		//System.out.println("Nodo en posicion " +pos +" eliminado");
		//System.out.println("Nodos b eliminados");
		//ls.mostrarLista();

	}

}
