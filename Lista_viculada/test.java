package Lista_viculada;

public class test {

	public static void main(String[] args) {
		
		Lista_vinculada<String> ls= new Lista_vinculada<String>();
		ls.insertarOrdenado("b");
		ls.insertarOrdenado("a");
		//ls.insertarOrdenado("test");
		String a = "a";
		String b = "b";
		System.out.println(b.compareTo(a));
		//ls.mostrarLista();

	}

}
