package ee_t03_pilasycolas;

public class Nodo<T> {

	public Nodo(){
		dato = null;
		siguiente = null;
	}
	
	public Nodo(T dato){
		this.dato = dato;
		siguiente = null;
	}
	
	/**
	 * Este es el dato que va a contener el nodo
	 */
	private T dato;
	private Nodo<T> siguiente;
	
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	public Nodo<T> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}

	/**
	 * Este metodo sobreescribe el toString de la clase Object
	 */
	@Override
	public String toString(){
		return "["+getDato()+"]";
	}

}
