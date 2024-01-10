package sinarray;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		double numeroUsuario;
		double suma=0;
		// El mayor número de los int es el mín
		double min = Double.MAX_VALUE;
		// El menor número de los int (0) es el máximo
		double max = Double.MIN_VALUE;
		double tabla[] = new double [10];
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0 ; i < tabla.length ; i ++) {
			System.out.println("Escriba un número: ");
			numeroUsuario = sc.nextDouble();
			tabla[i] = numeroUsuario;
		}
		
		for (double resultado : tabla) {
			suma+= resultado;
			
			if (resultado > max) {
				max= resultado;
			}
			
			if (resultado < min) {
				min = resultado;
			}
		}
		
		System.out.println("La suma de sus números es: " + suma);
		System.out.println("El número más grande es: " + max);
		System.out.println("El número más pequeño es: " + min);
		
		sc.close();
	}

}
