package sinarray;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		double tabla[] = new double[12];
		double temperatura;
		String mes;
		Scanner sc = new Scanner(System.in);
		// Bucle para pedir la temperatura y almacenarla en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Obtenemos el nombre del mes
			mes = nombreMes(i + 1);
			do {
				// Le pedimos la temperatura al usuario y la guardamos
				System.out.println("¿Cuál fue la temperatura media de " + mes + "?");
				temperatura = sc.nextDouble();
			} while (temperatura > 60 || temperatura < 0);

			// Guardamos la temperatura en la tabla
			tabla[i] = temperatura;
		}

		// Mostramos el diagrama de barras horizontales
		System.out.println("Diagrama de Temperaturas:");

		for (int i = 0; i < tabla.length; i++) {
			// Imprimimos el nombre del mes
			System.out.print(nombreMesCorto(i + 1) + " : ");
			// Imprimimos asteriscos para representar la temperatura
			for (int j = 0; j < (int) tabla[i]; j++) {
				System.out.print("*");
			}

			System.out.println(); // Nueva línea después de cada mes
		}

		sc.close();
	}

	// Función que devuelve el nombre del mes
	static String nombreMes(int pos) {
		// Variable dondde se almacenará el nombre
		String nombre;

		nombre = switch (pos) {
		default -> "enero";
		case 2 -> "febrero";
		case 3 -> "marzo";
		case 4 -> "abril";
		case 5 -> "mayo";
		case 6 -> "junio";
		case 7 -> "julio";
		case 8 -> "agosto";
		case 9 -> "septiembre";
		case 10 -> "octubre";
		case 11 -> "noviembre";
		case 12 -> "diciembre";
		};

		// Devolvemos el nombre
		return nombre;
	}

	static String nombreMesCorto(int pos) {
		String nombre;
		nombre = switch (pos) {
		default -> "ene";
		case 2 -> "feb";
		case 3 -> "mar";
		case 4 -> "abr";
		case 5 -> "may";
		case 6 -> "jun";
		case 7 -> "jul";
		case 8 -> "ago";
		case 9 -> "sep";
		case 10 -> "oct";
		case 11 -> "nov";
		case 12 -> "dic";
		};
		return nombre;
	}
}
