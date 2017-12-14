package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		System.out.println("THREADS");
		System.out.println("-------------------------");
		
		Hilo hilo1 = new Hilo("Segundo hilo aqui...");
		Hilo hilo2 = new Hilo("Main aqui...");
		hilo1.start();
		hilo2.start();
		try {
			System.out.println("Inicio segundo hilo");
			hilo1.join();
			hilo2.join();
			System.out.println("Finaliza el segundo hilo");
		} catch (InterruptedException e) {
			System.out.println("Ha sido detenido");
		}
		
		
		
		System.out.println("-------------------------");
		System.out.println("RUNNABLE");
		System.out.println("-------------------------");
		
		Runnable1 runable1 = new Runnable1("Segundo hilo aqui...");


	}

}