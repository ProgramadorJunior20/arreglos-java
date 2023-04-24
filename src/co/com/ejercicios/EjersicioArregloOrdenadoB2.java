package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloOrdenadoB2 {
    public static void main(String[] args) {
        /**
         * Ordenar los elementos del arreglo de 10 números según requerimientos.
         */
        /**
         * Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
         * Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
         * el segundo, el antepenúltimo, el tercero, y así sucesivamente.
         */
        /**
         * Echo por el profesor
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

        // como en cada iteración del for se muestran dos números
        // solo necesitaremos recorrer la mitad de iteraciones, con eso es suficiente.
        System.out.println("El resultado es:");
        for (int i = 0; i <= 4; i++){
            System.out.println(a[9 - i]); // Y el i-ésimo por el final
            System.out.println(i); // mostramos el i-ésimo número por el principio
        }

    }
}
