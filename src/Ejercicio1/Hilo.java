package Ejercicio1;

public class Hilo extends Thread{

	//Mostramos el nomre del hilo
	String palabra;
	
	Hilo(String palabra) {
		this.palabra = palabra;
	}
	
	public void run() {
		try {
			//Mostramos el numero de veces que queremos que se muestre el hilo
			for(int i=1; i<=5 ; i++) {
				System.out.println(this.palabra);
				sleep(1000);
			}
			
		} catch (InterruptedException e) {
			//si se interrumpe el hilo lo mostramos
			System.out.println("el hilo se ha detenido");
		}
	}

}
