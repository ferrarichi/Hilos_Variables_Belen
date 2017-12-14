package Ejercicio1;

public class Runnable1 implements Runnable{
	
	String palabra;
	
	Runnable1(String palabra) {
		this.palabra = palabra;
		Thread t1 = new Thread(this);
		t1.start();
		try {
			System.out.println("Inicio segundo hilo");
			t1.join();
			System.out.println("Finaliza el segundo hilo");
		} catch (InterruptedException e) {
			System.out.println("Se ha parado el hilo");
		}
		
	}

	@Override
	public void run() {
		try {
			for(int i=1; i<=5 ; i++) {
				System.out.println(this.palabra);
				System.out.println("Main aqui...");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("El hilo se ha interrumpido");
		}
	}
}