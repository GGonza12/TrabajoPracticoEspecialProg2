package Lista_viculada;

import java.util.Comparator;

public class test {

	public static void main(String[] args) {
		Comparator<String>comp = new ComparadorString();
		Lista_vinculada<String> ls= new Lista_vinculada<String>(comp);
		ls.insertarOrdenado("zxy");
		ls.insertarOrdenado("b");
		ls.insertarOrdenado("b");
		ls.insertarOrdenado("b");
		ls.insertarOrdenado("a");
		ls.insertarOrdenado("test");
		/*String a = "a";
		String b = "b";
		System.out.println(a.compareTo(b));
			System.out.println(ls);
		*/
	
		ls.mostrarLista();
		int pos =0;
		ls.eliminarOcurrencias("b");
		
		//System.out.println("Nodo en posicion " +pos +" eliminado");
		System.out.println("Nodos b eliminados");
		ls.mostrarLista();

	}

}
