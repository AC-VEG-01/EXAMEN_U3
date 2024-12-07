

package examen.practico;

import java.util.Scanner;

public class ExamenPractico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        if (numEstudiantes <= 0) {
             System.out.print(" ");
            System.out.println("El número de estudiantes debe ser mayor a 0!!!!.");
           
        }

        double[] calificaciones = new double[numEstudiantes];

        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            double calificacion = scanner.nextInt();

            if (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificación debe estar entre 0 y 100!!!.");
               
            }

            calificaciones[i] = calificacion;
        }

double promedio = calcularPromedio(calificaciones); 
System.out.println("Promedio de calificaciones: " + promedio);

double contadorMayoresOIguales = contarCalificacionesMayores(calificaciones, promedio);
System.out.println("Número de calificaciones mayores o iguales al promedio: " + contadorMayoresOIguales);

double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones); 
System.out.println("Calificación más alta: " + calificacionMasAlta);

double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones); 
System.out.println("Calificación más baja: " + calificacionMasBaja);

        

    }
//METODO PROMEDIO
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
//METODO CONTADOR DE CALIFICACIONES MAYORES
    public static double contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }
//METODO CALIFICACION MAS ALTA
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double max = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }
//METODO CALIFICACION MAS BAJA
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double min = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}
