package sinarray;

/**
 * Clase donde realizaremos el ejercicio 4 que consiste en ir asignando valores
 * a cada índice de nuestra tabla
 */

public class Ejercicio4 {

	public static void main(String[] args) {

		// Tabla para guardar los números
		int num[] = new int[12];

		// Establecemos los números en cada índice de la tabla
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;

		// Bucle para ir imprimiendo los números de la tabla
		for (int numero : num) {
			System.out.println(numero);
		}

	} // Cierre del main

} // Cierre de la clase
