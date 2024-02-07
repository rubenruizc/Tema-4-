package funcionesarray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Clase donde realizaremos el ejercicio 5 que consiste en ir buscando el número
 * introducido por el usuario en una tabla
 */

public class Ejercicio5 {

	public static void main(String[] args) {

		// Variable donde guardaremos la tabla / array de longitud 10
		int[] t = new int[10];

		// Variable donde guardaremos el valor que el usuario quiere buscar
		int valorBusqueda;

		// Variable donde guardaremos los números randoms
		int numeroRandom;

		// Variable donde guardaremos la tabla / array de los índices
		int[] indices;
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir almacenando los números random que se van generando en la tabla
		for (int i = 0; i < t.length; i++) {
			numeroRandom = (int) (Math.random() * 20 + 1);

			// Introducimos el número a la tabla
			t[i] = numeroRandom;
		}

		// Le preguntamos al usuario cual es el número que quiere buscar
		System.out.println("Introduzca el valor que le gustaría buscar: ");

		// Leemos el número
		valorBusqueda = sc.nextInt();

		// Introducimos en la tabla índices los valores donde se encuentra el número
		// deseado
		indices = buscarTodos(t, valorBusqueda);

		// Condicional para imprimir una cosa u otra dependiendo de si ha encontrado el
		// número en la tabla o no
		if (indices.length == 0) {
			System.out.println("El valor no se encuentra en la tabla.");
		} else {
			System.out.println("El valor se encuentra en los siguientes índices: " + Arrays.toString(indices));
		}

		// Imprimimos la tabla
		System.out.println(Arrays.toString(t));

		// Cierre del Scanner
		sc.close();
	}

	/**
	 * Función para ir buscando el número introducido por el usuario
	 * 
	 * @param t
	 * @param valor
	 * @return
	 */
	
	public static int[] buscarTodos(int[] t, int valor) {

		// Variable donde guardaremos la cantidad de veces que se ha encontrado el
		// número
		int contador = 0;

		// Contar la cantidad de veces que aparece el valor en el array
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				contador++;
			}
		}

		// Crear un array con la cantidad correcta de elementos
		int[] indicesEncontrados = new int[contador];
		contador = 0;

		// Almacenar los índices en el array
		for (int i = 0; i < t.length; i++) {
			if (t[i] == valor) {
				indicesEncontrados[contador++] = i;
			}
		}

		// Devolvemos en que lugar se ha encontrado el número
		return indicesEncontrados;
	}
}