package Lista_viculada;

import java.util.Comparator;

public class Lista_vinculada<T> {
	private	Nodo<T> primero;

	private Comparator<T> orden;
	
	
	public Lista_vinculada() {
		this.primero = null;
		
	}



	public void insertarOrdenado(T dato) {
		IteradorLista<T> it = new IteradorLista<T>(this.primero);
		if(this.primero==null) {
			this.primero = new Nodo<T>(dato,this.primero);
		}
		else {
			while(it.hasNext()) {
				//Nodo<T> aux = new Nodo<T>(dato,this.primero);
				T i = it.next();
				
				if(orden.compare(i, dato)>0) {
					this.primero.setValor(dato);
					this.primero.setSiguienteNodo(this.primero);
				}
				
			}
		}
		
		
		
	}
	public void eliminarNodo(int pos) {
		IteradorLista<T> it = new IteradorLista<T>(this.primero);
		int sum=0;
		
			while(it.hasNext()&&sum<pos) {
				T i = it.next();
				sum++;
				}
			if(sum==pos) {
				it.obtenerActual().setValor(it.obtenerActual().getSiguienteNodo().getValor());;
				
			}
		
	}
	
	public void mostrarLista() {
		IteradorLista<T> it = new IteradorLista<T>(this.primero);
		while(it.hasNext()) {
			Object i = it.next();
			System.out.println(i);
		}
	}



	@Override
	public String toString() {
		return "Lista_vinculada [primero=" + primero + "]";
	}
	
}
