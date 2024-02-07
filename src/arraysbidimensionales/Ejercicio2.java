package arraysbidimensionales;

import java.util.Scanner;

public class Ejercicio2 {
	
	// Constante donde guardaremos el número de alumnos
	public static final int NUM_ALUMNOS = 4;
	
	// Constante donde guardaremos el número de asignaturas 
	public static final int NUM_ASIGNATURAS = 5;

	public static void main(String[] args) {
		
		// Variable donde guardaremos la nota introducida por el usuario
		double pedirNota;
		
		// Creamos un array bidimensional donde guardar las notas
		double notas[][] = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];
		
		// Creamos un Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle para ir preguntandole las notas de cada alumno
		for (int i = 0; i < NUM_ALUMNOS; i++) {
			System.out.println("Notas del alumno " + (i + 1) + ":");
			
			// Bucle para ir preguntando las notas por cada asignatura e introducirlas en la tabla notas
			for (int j = 0; j < NUM_ASIGNATURAS; j++) {
				System.out.print("Nota Asignatura " + (j + 1) + ": ");
				pedirNota = sc.nextDouble();
				notas[i][j] = pedirNota;
			}
			
			// Espacio / Salto de línea
			System.out.println();
		}
		
		// Imprimimos la tabla de notas
		System.out.print("TABLA DE NOTAS|");
		
		// Bucle para ir imprimiendo las asignaturas
		for(int i = 0; i < 5; i++) {
			System.out.print(" Asig " + (i+1));
		}
		
		// Espacio / Salto de línea
		System.out.println();
		
		// Dibujo para hacer separación
		System.out.println("---------------------------------------------------");
		
		// Bucle para ir imprimiendo los alumnos
		for (int nombreAlumno = 0; nombreAlumno < NUM_ALUMNOS; nombreAlumno++) {
			System.out.print("Alumno " + (nombreAlumno + 1) + "\t");
			
			// Bucle para ir imprimiendo las notas de cada alumno
			for (int nombreAsignatura = 0; nombreAsignatura < NUM_ASIGNATURAS; nombreAsignatura++) {
				System.out.print(notas[nombreAlumno][nombreAsignatura] + "\t");
			}
			
			// Espacio / Salto de línea
			System.out.println();
		}
		
        // Calcular y mostrar la nota mínima, máxima y media de cada alumno
        System.out.println("\nNotas de cada Alumno:");
        System.out.println("-------------------------------------------------");
        
        // 
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double min = notas[i][0];
            double max = notas[i][0];
            double sum = 0;
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                if (notas[i][j] < min) {
                    min = notas[i][j];
                }
                if (notas[i][j] > max) {
                    max = notas[i][j];
                }
                sum += notas[i][j];
            }
            double media = sum / NUM_ASIGNATURAS;
            System.out.println("Alumno " + (i + 1) + ": Mínima = " + min + ", Máxima = " + max + ", Media = " + media);
        }
        
        // Cerramos el Scanner
		sc.close();
	
	} // Cierre del main

} // Cierre de la clase