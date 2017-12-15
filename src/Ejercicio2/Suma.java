package Ejercicio2;


public class Suma {
	
	//Variables
	private int suma;
	private int count;
	
	public Suma() {
		this.suma = 0;
		this.count = 0;
	}
	
	public synchronized int nuevaSuma(int num) {
		this.suma = suma + num;
		this.count = count + 1;
		return suma;
	}
	
	public synchronized float media() {
		return (this.suma/this.count);
	}
	
	public synchronized int getCount() {
		return this.count;
	}
	
	public synchronized int getSuma() {
		return this.suma;
	}

}