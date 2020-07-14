package entities;

public class Secundaria {
	private int valor1;
	private double valor2;

	public Secundaria(int valor1, double valor2) {

		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double soma() {
		return valor1 + valor2;
	}

	public String toString() {
		return " [soma= " + soma() + "]";
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	
}
