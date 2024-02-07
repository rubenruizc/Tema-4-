package funcionesarray;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 6 que consiste en ir sumando los
 * elementos de una tabla
 */

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Variable donde guardaremos la longitud de la tabla
		int longitud = 0;

		// Variable donde guardaremos la tabla / array de longitud 6
		int[] t;

		// Variable donde guardaremos la tabla / array que tendra los números sumados
		int[] resultado;

		// Variable donde guardaremos la cantidad de números que se van a sumar
		int numElementos = 0;

		do {
			try {
				System.out.println("Cuantos números quieres que se sumen: ");
				numElementos = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("DEBE INTRODUCIR UN NÚMERO");
				numElementos = -1;
				sc.nextLine();
			}

		} while (numElementos < 0);

		do {
			try {
				System.out.println("Introduzca la longitud de la tabla: ");
				longitud = sc.nextInt();

				if (numElementos > longitud) {
					System.out.println("Debes introducir una longitud mayor al número de elementos");
				}

			} catch (InputMismatchException e) {
				System.out.println("DEBE INTRODUCIR UN NÚMERO");
				sc.nextLine();
			}
		} while (numElementos > longitud);

		// Establecemos la longitud de la tabla
		t = new int[longitud];

		// Bucle para ir almacenando los números random que se van generando en la tabla
		for (int i = 0; i < t.length; i++) {

			// Introducimos el número a la tabla
			t[i] = (int) (Math.random() * 100 + 1);
		}

		System.out.println(Arrays.toString(t));
		// Introducimos a la tabla resultado los números sumados llamando a la función
		resultado = suma(t, numElementos);

		// Imprimir el resultado
		for (int i : resultado) {
			System.out.print(i + " ");
		}
		sc.close();
	}

	/**
	 * Función para realizar la suma de los elementos
	 * 
	 * @param t
	 * @param numElementos
	 * @return
	 */
	
	public static int[] suma(int[] t, int numElementos) {

		// Variable donde guardaremos la tabla / array de longitud 4
		int[] resultado = new int[t.length - numElementos + 1];

		for (int i = 0; i < resultado.length; i++) {
			int suma = 0;
			for (int j = 0; j < numElementos; j++) {
				suma += t[i + j];
			}
			resultado[i] = suma;
		}

		return resultado;
	}
}
