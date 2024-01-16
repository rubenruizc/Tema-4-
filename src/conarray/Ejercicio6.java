package conarray;


import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tabla[] = new int[1000];
		int valorN;
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		System.out.println("Escriba un valor que quiera ver si existe en la tabla: ");
		valorN = sc.nextInt();

		for (int i = 0; i < tabla.length; i++) {
			if (valorN == tabla[i]) {
				contador++;
			}
		}

		if (contador != 0) {
			System.out.println("El número " + valorN + " se ha encontrado un total de " + contador + " veces");
		} else {
			System.out.println("Su número no se encuentra");
		}

		sc.close();
	}

}
