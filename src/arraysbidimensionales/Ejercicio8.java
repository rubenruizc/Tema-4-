package arraysbidimensionales;

import java.util.Scanner;

/**
 * Clase donde se realizara el ejercicio 8 que consite en saber si la tabla
 * introducida por el usuario es simétrica
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		// Tabla donde guardaremos los números del usuario
		int tabla[][] = new int[4][4];

		// Variable donde guardaremos si es o no simétrica la tabla
		boolean simetrico;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Solicita al usuario que ingrese los valores de la tabla
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print("Ingresa el valor en la posición [" + i + "][" + j + "]: ");
				tabla[i][j] = sc.nextInt();
			}
		}

		// Imprime la tabla ingresada por el usuario
		System.out.println("Tabla ingresada:");
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}

		// Verifica si la tabla es simétrica
		simetrico = igual(tabla);

		// Imprime el resultado
		if (simetrico) {
			System.out.println("Tu tabla es simétrica");
		} else {
			System.out.println("Tu tabla no es simétrica");
		}

		// Cierre del Scanner
		sc.close();
		
	} // Cierre del main

	/**
	 * Función para verificar si una tabla es simétrica
	 * 
	 * @param tabla
	 * @return
	 */

	public static boolean igual(int tabla[][]) {
		
		// Variable donde guardaremos si la tabla es igual
		boolean igual = true;
		
		// Variable donde guardaremos el contador de elementos coincident4es
		int cont = 0;

		// Compara los elementos de la tabla con su correspondiente en la transpuesta
		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[i].length; j++) {
				// Si un elemento no es igual a su correspondiente en la transpuesta, la tabla
				// no es simétrica
				if (tabla[i][j] != tabla[j][i]) {
					igual = false;
					break;
				}
				cont++;
			}
		}

		// Si el número de elementos coincidentes es igual al total de elementos, la tabla es simétrica
		if (cont == tabla.length * tabla[0].length) {
			igual = true;
		} else {
			igual = false;
		}

		// Devolvemos si es igual o no
		return igual;

	} // Cierre de la función

} // Cierre de la clase
