package Lista_viculada;

import java.util.Comparator;
import java.util.Iterator;

public class Lista_vinculada<T> implements Iterable<T>{
	private	Nodo<T> primero;
	private int tamano;
	private Comparator<T> comp;
	
	public Lista_vinculada(Comparator<T> comp) {
		this.primero = null;
		this.comp= comp;
		this.tamano =0;
	}
	
	public void setComp(Comparator<T> comp) {
		this.comp = comp;
		reordenar();
	}

	private void reordenar() { //reordenar ahora es privado
		Nodo <T> aux = this.primero;
		this.primero =null;
		while(aux!=null) {
			this.insertarOrdenado(aux.getValor());
			aux = aux.getSiguienteNodo();
		}
	}

	public void insertarOrdenado(T dato) {
		Nodo<T> nuevo = new Nodo<T>(dato);
		if(this.primero==null) {
			this.primero = nuevo;
		}
		else {
			Nodo<T> anterior = null;
			Nodo<T> aux = this.primero;	
			while((aux!=null)&&(comp.compare(dato, aux.getValor())>0)){
				anterior = aux;
				aux = aux.getSiguienteNodo();
			}
			if(anterior!=null && aux==null) {
				anterior.setSiguienteNodo(nuevo);					
			}
			else {
				nuevo.setSiguienteNodo(aux);
				if(aux == this.primero) {
					this.primero = nuevo;
				}
				else {
					anterior.setSiguienteNodo(nuevo);
				}
			}
		}
		this.tamano++;
	}
	public void eliminarNodo(int pos) {
		int sum=0;
		Nodo<T> anterior = null;
		Nodo<T> aux = this.primero;	
		
			while((aux!=null)&&(sum<pos)) {
				anterior= aux;
				aux = aux.getSiguienteNodo();
				sum++;
				}
			if(sum==pos&&(anterior!=null)) { //Segundo if eliminado y condicion del primer if modificada
				anterior.setSiguienteNodo(aux.getSiguienteNodo());
				this.tamano--;
			}

			else if(sum==pos&&(aux.getSiguienteNodo()!=null)&&(anterior==null)) {
				this.primero=aux.getSiguienteNodo();
				this.tamano--;
			}
	}
	
	public void eliminarOcurrencias(T dato) { //Eliminar ocurrencias modificado. Ahora no llama al metodo eliminarNodo
		Nodo<T> anterior = null;
		Nodo<T> aux = this.primero;	
		
		while ((aux.getSiguienteNodo()!=null)&&(((aux.getValor().equals(dato))==false))) {
			anterior=aux;
			aux = aux.getSiguienteNodo();
		}
			while((aux.getValor().equals(dato)&&anterior==null)) {
				this.primero=aux.getSiguienteNodo();
				aux = aux.getSiguienteNodo();
			}
			while(aux.getValor().equals(dato)&&(aux.getSiguienteNodo()!=null)) {
				anterior.setSiguienteNodo(aux.getSiguienteNodo());
				aux = aux.getSiguienteNodo();	
			}
			if(aux.getValor().equals(dato)&&(aux.getSiguienteNodo()==null)) {
				anterior.setSiguienteNodo(aux.getSiguienteNodo());
				aux = aux.getSiguienteNodo();	
			}	
	}
	
	public int obtenerPrimeraOcurrencia(T dato) {
		boolean encontrado=false;
		Nodo<T> aux = this.primero;	
		int pos=0;
			while((aux!=null)&&(encontrado==false)) {
			//	if(aux.getValor()==dato) {
				if(aux.getValor().equals(dato)) {
					encontrado=!encontrado;
					pos--;
				}
				aux = aux.getSiguienteNodo();
				pos++;
				}
			if(encontrado==false) {
				pos=-1;
			}
			return pos;
	}



	@Override
	public String toString() {
		return "Lista_vinculada [primero=" + primero + "]";
	}

	@Override
	public Iterator<T> iterator() {
		
		return new IteradorLista<T>(this.primero);
	}
	
}
