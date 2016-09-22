package ee_t03_pilasycolas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Test<T> {
	
	PilaLigada<T> pila;
	Cola<T> cola;
	public Test (){
		
	}
	public void menu (BufferedReader br) throws IOException{
		int n2 =-1;
		String ca= br.readLine();
		int n = Integer.parseInt(ca);
		if(n==0){
			//Acción para pila
			String n1="";
			while(((n1 = br.readLine())).equals("")){
				n2 = Integer.parseInt(n1, n1.charAt(0));
			if(n2==1)
				pila.pop();
			if(n2==2)
				pila.peek();
			if(n2==0){
					String datoo =n1.substring(2, n1.length());
					
					T dato = (T) datoo;
					
					pila.push(dato);
			}
			if(n2!=0 && n2!=1 && n2!=2 )
				System.out.println("Acción desconocida");
			}
		}
		if(n==1){
			//Acción para cola
			String n1="";
			while(((n1 = br.readLine())).equals("")){
				n2 = Integer.parseInt(n1, n1.charAt(0));
			if(n2==1)
				cola.eleminar();
			if(n2==0){
				String datoo =n1.substring(2, n1.length());
				
				T dato = (T) datoo;
				
				cola.insertar(dato);
			}
			if(n2!=0 && n2!=1)
			System.out.println("Acción desconocida");
		}
			}
		if(n!=0 && n!=1)
			System.out.println("Acción desconocida");
	}
	

public void verArchivo() throws IOException{
    try {
   	 String a = JOptionPane.showInputDialog("nombre del archivo");
        BufferedReader br =new BufferedReader (new FileReader(a));
       menu(br);
       br.close();
   } catch (FileNotFoundException e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
   }
    
    }




	public static void main(String[] args) throws IOException {
		Test<String> b = new Test<String>();
		b.verArchivo();
	
	}

}
