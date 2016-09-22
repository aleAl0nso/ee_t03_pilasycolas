package ee_t03_pilasycolas;

public class Cola<T> {
private Nodo<T> inicio;
	
	public Cola(){
		inicio = null;
	}
	public Nodo<T> getInicio() {
		return inicio;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	
	public void eleminar(){
		if(inicio!=null){
			System.out.println( inicio.getDato());
		inicio=inicio.getSiguiente();
		
		}
		else{
		System.out.println( "vacio");}
	}
	public void insertar(T dato){
		Nodo<T> aux = new Nodo<T>(dato);
		if(inicio!=null){
			Nodo<T> a=recorrer();
			a.setSiguiente(aux);
		}
		aux.setSiguiente(inicio);
	}
	public Nodo<T> recorrer(){
		Nodo<T> aux = inicio;
		while(aux.getSiguiente() != null){
			
			aux = aux.getSiguiente();
		}
		return aux;
		}
	
		
}
