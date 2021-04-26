package Herencia;

import java.util.Scanner;

public class Superclase {

	private static String numeroPrincipal;

	public static void main(String[] args) {
		
	
		Scanner teclado = new Scanner(System.in);
		
		// Programa que lea 2 numeros y calcule la suma, resta, producto y division.
		
		// VARIABLES
		
		int numero1;
		int numero2;
		int suma;
		int resta;
		int mult;
		double resto;
		double div;
		
		// ALGORITMO
		
		numeroPrincipal = "Introduce el primer número: ";
		System.out.println(numeroPrincipal);
		numero1 = teclado.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		numero2 = teclado.nextInt();
		
		suma = numero1 + numero2;
		resta = numero1 - numero2;
		mult = numero1 *numero2;
		
		System.out.println("La suma es: "+ suma);
		System.out.println("La resta es: "+resta);
		System.out.println("La multiplicación es: "+mult);
		
		extracted(numero1, numero2);
		
	}

	private static void extracted(int numero1, int numero2) {
		double resto;
		double div;
		if (numero2 == 0) {
			System.err.println("Error, no se puede dividir entre 0");
			System.err.println("Error, no se puede sacar el resto");
		}
		else {
			resto = numero1 % numero2;
			div = numero1 / numero2;
			System.out.println("El resto es: "+resto);
			System.out.println("La división es: "+div);
		}
	}

	public Superclase() {
		super();
	}

}