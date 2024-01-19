package funcionesarray;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		// Variable donde guardaremos el número que el usuario quiere buscar
		int numeroBuscar;

		// Variable donde guardaremos los números random generados
		int numr;

		// Variable donde guardaremos la tabla / array de longitud 20
		int t[] = new int[20];

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir almacenando los números random que se van generando en la tabla
		for (int i = 0; i < t.length; i++) {
			numr = (int) (Math.random() * 20 + 1);

			// Introducimos el número a la tabla
			t[i] = numr;
		}

		// Le preguntamos al usuario que número le gustaría buscar en la tabla
		System.out.println("Introduzca el valor que le gustaría encontrar en la tabla: ");

		// Leemos el número
		numeroBuscar = sc.nextInt();

		// Imprimimos la posición donde se encuentra el número del usuario y llamamos a la función
		System.out.println("El número: " + numeroBuscar + " se encuentra en la posición " + buscar(t, numeroBuscar));

		// Cierre del Scanner
		sc.close();

	} // Cierre del main

	// Función para encontrar la posición / índice del número del usuario
	public static int buscar(int t[], int clave) {

		// Variable donde guardaremos el índice
		int indiceBusqueda = 0;

		// Bucle para ir pasando de un índice a otro hasta encontrar el número del usuario
		while (indiceBusqueda < t.length && clave != t[indiceBusqueda]) {
			indiceBusqueda++;
		}

		// Condicional por si el número no se encuentra en la tabla
		if (indiceBusqueda >= t.length) {
			indiceBusqueda = -1;
		}

		// Devolvemos el índice donde se encuentra el número
		return indiceBusqueda;
	}

} // Cierre de la clase
