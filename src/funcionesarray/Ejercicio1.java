package funcionesarray;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla de números enteros de longitud 10
		int tablaEnteros[] = new int[10];

		// Bucle para ir introduciendo en la tabla números aleatorios entre el 1 y el 20
		for (int i = 0; i < tablaEnteros.length; i++) {

			// Introducimos el número a la tabla
			tablaEnteros[i] = (int) (Math.random() * 20 + 1);
		}

		// Imprimimos la tabla
		System.out.println(Arrays.toString(tablaEnteros));

		// Imprimimos la suma de los elementos de la tabla
		System.out.println("La suma de todos los números de la tabla es: " + sumaEnteros(tablaEnteros));

	}

	// Función para que los elementos de la tabla se sumen
	public static int sumaEnteros(int[] tabla) {
		int suma = 0;
		for (int numeros : tabla) {
			suma += numeros;
		}
		return suma;
	}
}
