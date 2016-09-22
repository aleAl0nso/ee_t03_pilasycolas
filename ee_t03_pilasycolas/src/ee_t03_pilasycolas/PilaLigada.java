package ee_t03_pilasycolas;

public class PilaLigada<T> {
	
	private Nodo<T> inicio;
	public PilaLigada(){
		inicio = null;
	}
	
	public Nodo<T> getInicio() {
		return inicio;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	
	public void push(T dato){
		Nodo<T> aux = new Nodo<T>(dato);
		//poner una condición para saber si fue creado el nodo
		aux.setSiguiente(inicio);
		inicio = aux;
		
	}
	public void pop(){
		if(inicio!=null){
			System.out.println( inicio.getDato());
		inicio=inicio.getSiguiente();
		
		}
		else{
		System.out.println( "Esta vacio");}
	}
	public  void peek(){
		if(inicio!=null){
			System.out.println( inicio.getDato());
		}else{
			System.out.println( "Esta vacio");
		}
		
	}
	
		
	}
	

	

