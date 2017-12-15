package Ejercicio2;


public class HiloSuma extends Thread {
	
	//Variables
	Suma sm;

	public HiloSuma(Suma sm) {
		this.sm = sm;
	}

	//Lo ejecutamos
	public void run() {
		for (int i=1; i<=5; i++) {
			System.out.println("Sumando el Numero " + i + " en hilo " + this.getName());
			sm.nuevaSuma(i);
			System.out.println("La media del hilo " + this.getName() + " con " + sm.getCount() + " valores sumados " + " da " +sm.media());
		}
		System.out.println("Sumas del hilo " + this.getName() + " ha finalizado");
	}
}
