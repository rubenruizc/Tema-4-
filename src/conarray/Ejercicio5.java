package conarray;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int tabla[]= new int [8];
		int puntuacion;
		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i<tabla.length;i++) {
			System.out.println("Escriba una puntuación: ");
			puntuacion = sc.nextInt();
			tabla[i] = puntuacion;
		}

		Arrays.sort(tabla);
		
		for(int i = tabla.length - 1;i>=0;i--) {
			System.out.println(tabla[i]);
		}
		
		sc.close();
	}

}
