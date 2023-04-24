package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloOrdenado {
    public static void main(String[] args) {
        /**
         * Ordenar los elementos del arreglo de 10 números según requerimientos.
         */
        /**
         * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
         * Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
         * el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */
        Scanner sc = new Scanner(System.in);

        // Creamos un arreglo con 10 elementos
        int[] a = new int[10];

        // Llenamos el arreglo y signamos los enteros a "a[i]"
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingresa un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        // Crea un nuevo arreglo del mismo tamaño que el arreglo original.
        int b = a.length;
        int[] nuevoArreglo = new int[b];

        // Creamos la variable "mitad" que va a guardar el resultado de la division de "b / 2"
        int mitad = b / 2;

        // Itera desde 0 hasta la mitad del arreglo original. Para cada elemento en el rango
        for (int i = 0; i < mitad; i++) {
            // Copia el elemento desde la posición correspondiente en el final del arreglo original al inicio del nuevo arreglo.
            nuevoArreglo[i * 2] = a[b - 1 - i];
            // Copia el elemento desde la posición correspondiente al inicio del arreglo original al final del nuevo arreglo.
            nuevoArreglo[i * 2 + 1] = a[i];
        }

        // Si el arreglo original tiene un número impar de elementos, copia el elemento en la mitad del arreglo al medio del nuevo arreglo.
        if (b % 2 != 0) {
            nuevoArreglo[b - 1] = a[mitad];
        }

        // recorremos el arreglo nuevo y mostramos el resultado en pantalla
        for (int i = 0; i < nuevoArreglo.length; i++){
            System.out.println(i + " => " + nuevoArreglo[i]);
        }


    }
}
