package Ejercicio2;



public class Principal {
	
	public static void main(String[] args) {
		
		//Creamos suma
		Suma sm = new Suma();
		
		//Creamos hilos suma
		Thread t1 = new HiloSuma(sm);
		Thread t2 = new HiloSuma(sm);
		Thread t3 = new HiloSuma(sm);
		Thread t4 = new HiloSuma(sm);
		Thread t5 = new HiloSuma(sm);
		Thread t6 = new HiloSuma(sm);
		
		//Iniciamos ejecucción hilos
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		//Resultados finales
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
			t6.join();
			System.out.println("Suma final: " + sm.getSuma());
			System.out.println("Media de la suma: " + sm.media());
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
