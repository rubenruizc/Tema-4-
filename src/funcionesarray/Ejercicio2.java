package funcionesarray;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int tabla[] = new int[10];
		int numeros;
		for (int i = 0; i < tabla.length; i++) {
			numeros = (int) (Math.random() * 20 + 1);
			tabla[i] = numeros;
		}

		System.out.println(Arrays.toString(tabla));
		System.out.println("El valor máximo de la tabla es: " + numeroMaximo(tabla));

	}

	public static int numeroMaximo(int[] tabla) {
		int max = 0;

		for (int numero : tabla) {
			if (max < numero) {
				max = numero;
			}
		}
		return max;
	}

}
