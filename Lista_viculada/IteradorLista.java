package Lista_viculada;

import java.util.Iterator;

public class IteradorLista<T> implements Iterator<T> {
	private Nodo<T> cursor;

	public IteradorLista(Nodo<T> cursor) {
		this.cursor=cursor;
	}
	@Override
	public boolean hasNext() {
		return this.cursor!=null;
	}
	@Override
	public T next() {
		T valor = cursor.getValor();
		cursor = cursor.getSiguienteNodo();
		return valor;
	}
	public T valorSiguiente() {
		T valor = cursor.getSiguienteNodo().getValor();
		return valor;
	}
	
	/*public Nodo<T> obtenerActual(){
		return this.cursor;
	}*/
}
