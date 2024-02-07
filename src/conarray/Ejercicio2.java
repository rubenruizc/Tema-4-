package conarray;

import java.util.Arrays;

/**
 *Clase donde realizaremos el ejercicio 2 que consiste en introducir en una tabla números repitiendolos las veces que sea dicho número
 */

public class Ejercicio2 {

	public static void main(String[] args) {

		// Variable donde almacenamos la tabla/array
		int[] tabla;

		// Variable donde guardaremos el contador
		int contador = 0;

		// Bucle para saber cual es la longitud de nuestra tabla
		for (int i = 1; i <= 10; i++) {
			for (int y = 1; y <= i; y++) {
				contador++;
			}
		}

		// Establecemos la longiutd de la tabla, en este caso sería 55
		tabla = new int[contador];

		// Variable donde guardaremos el primer hueco donde iran los números
		int primero = 0;

		// Variable donde guardaremos el último hueco donde llegarán los números
		int ultimo = 0;

		// Bucle para poder rellenar la tabla
		for (int i = 1; i <= 10; i++) {
			primero += i - 1;
			ultimo += i;
			Arrays.fill(tabla, primero, ultimo, i);
		}

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tabla));

	} // Cierre del main
	
} // Cierre de la clase
