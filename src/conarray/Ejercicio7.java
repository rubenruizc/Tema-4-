package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		// Variable donde guardaremos la primera tabla de longitud 6
		int tabla1[] = new int[6];

		// Variable donde guardaremos la segunda tabla de longitud 6
		int tabla2[] = new int[6];

		// Variable donde guardaremos el número del usuario
		int numeroUsuario;

		// Variable donde guardaremos el número de aciertos
		int aciertos = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir al usuario el número ganador y almacenarlo en la segunda
		// tabla
		for (int i = 0; i < tabla2.length; i++) {
			System.out.println("Escriba el número ganador: ");
			numeroUsuario = sc.nextInt();
			tabla2[i] = numeroUsuario;
		}

		// Ordenamos la segunda tabla de menor a mayor
		Arrays.sort(tabla2);

		// Bucle para almacenar en la primera tabla números random del 1 al 49
		for (int i = 0; i < tabla1.length; i++) {
			tabla1[i] = (int) (Math.random() * 49 + 1);
		}

		// Bucle para saber la cantidad de aciertos que ha conseguido la máquina
		for (int numUsuario : tabla1) {
			if (Arrays.binarySearch(tabla2, numUsuario) >= 0) {
				aciertos++;
			}
		}

		// Imprimimos la apuesta ganadora
		System.out.println("Apuesta ganadora: " + Arrays.toString(tabla2));

		// Imprimimos la apuesta random generada por la máquina
		System.out.println("Apuesta random: " + Arrays.toString(tabla1));

		// Imprimimos un espacio
		System.out.println();

		// Imprimimos el número de aciertos
		System.out.println("Número de aciertos: " + aciertos);

		// Cerramos el Scannner
		sc.close();
		
	}// Cierre del main
	
} // Cierre de la clase