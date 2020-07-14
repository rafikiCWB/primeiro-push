package packageRun;

import java.util.Locale;
import java.util.Scanner;

import entities.Secundaria;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		System.out.println("BOM DIA! ");
		System.out.println("BOA TARDE! ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Primeiro numero a somar: ");
		int valor1 = sc.nextInt();
		System.out.println("Segundo numero a somar: ");
		int valor2 = sc.nextInt();

		Secundaria s = new Secundaria(valor1, valor2);

		System.out.println("Resultado: " + s);
		sc.close();
	}
}