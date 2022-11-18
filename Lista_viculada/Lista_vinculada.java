package Lista_viculada;

import java.util.Comparator;

public class Lista_vinculada<T>{
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

	public void reordenar() {
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
			while((aux!=null)&&(comp.compare(dato, aux.getValor())>1)){
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
			if(sum==pos&&(aux.getSiguienteNodo()!=null)&&(anterior!=null)) {
				anterior.setSiguienteNodo(aux.getSiguienteNodo());
				this.tamano--;
			}
			else if(sum==pos&&(aux.getSiguienteNodo()==null)&&(anterior!=null)){
				anterior.setSiguienteNodo(null);
				this.tamano--;
			}
			else if(sum==pos&&(aux.getSiguienteNodo()!=null)&&(anterior==null)) {
				this.primero=aux.getSiguienteNodo();
				this.tamano--;
			}
	}
	
	public void eliminarOcurrencias(T dato) {
		Nodo<T> anterior = null;
		Nodo<T> aux = this.primero;	
		int pos=0;
		while (aux.getSiguienteNodo()!=null) {
			if(aux.getValor()==dato) {
				eliminarNodo(pos);
				pos--;
			}
			anterior= aux;
			aux = aux.getSiguienteNodo();
			pos++;
		}
	}
	public void obtenerPrimeraOcurrencia(T dato) {
		boolean encontrado=false;
		Nodo<T> aux = this.primero;	
		int pos=0;
			while((aux!=null)&&(encontrado==false)) {
				if(aux.getValor()==dato) {
					encontrado=!encontrado;
					System.out.println(pos);
				}
				aux = aux.getSiguienteNodo();
				pos++;
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
