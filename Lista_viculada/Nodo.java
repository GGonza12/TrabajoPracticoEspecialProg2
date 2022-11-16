package Lista_viculada;

public class Nodo<T> {
	private T valor;
	private Nodo<T> siguienteNodo;
	public Nodo(T valor) {
		this(valor,null);
	}
	public Nodo(T valor, Nodo<T> siguienteNodo) {
		this.valor = valor;
		this.siguienteNodo = siguienteNodo;
	}
	
	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo<T> getSiguienteNodo() {
		return siguienteNodo;
	}

	public void setSiguienteNodo(Nodo<T> siguienteNodo) {
		this.siguienteNodo = siguienteNodo;
	}

	@Override
	public String toString() {
		return "Nodo [valor=" + valor + ", siguienteNodo=" + siguienteNodo + "]";
	}
	
	
}
