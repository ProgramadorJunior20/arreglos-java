package co.com.arreglos;

import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        /**
         * Sistema de notas de alumnos por asignaturas
         */

        double[] claseMatematicas, claseHistoria, claseLenguaje; // Creamos 3 arreglos de tipo double con las asignaturas
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0; // creamos las variables para guardas las suma de las notas de las asignaturas

        // creamos las instancias para los 3 arreglos creados anteriormente,
        // y vamos a tener 7 notas para cada asignatura, ya que son 7 estudiantes

        claseMatematicas = new double[7]; // alumnos de claseMatemáticas
        claseHistoria = new double[7]; // alumnos de claseHistoria
        claseLenguaje = new double[7]; // alumnos de claseLenguaje

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de alumnos para Matemáticas: ");

        for (int i = 0; i < claseMatematicas.length; i++){
            claseMatematicas[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de alumnos para Historia: ");
        for (int i = 0; i < claseHistoria.length; i++){
            claseHistoria[i] = sc.nextDouble();
        }

        System.out.println("Ingrese 7 notas de alumnos para Lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++){
            claseLenguaje[i] = sc.nextDouble();
        }

        // vamos a construir un for para que itere las notas para hacer la suma de cada asignatura
        for (int i = 0; i < 7; i++){
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasHistoria += claseHistoria[i];
            sumNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = (sumNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje / claseLenguaje.length);

        System.out.println("Promedio clase matemáticas: " + promedioMatematicas);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);
        System.out.println("Promedio total del curso: " + ((promedioMatematicas + promedioHistoria + promedioLenguaje) / 3));

        // notas de un solo alumno
        System.out.println("Ingrese el identificador del alumno (0 a 6): ");
        int id = sc.nextInt();
        double promedioAlumno = ((claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3);
        System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);

    }
}
