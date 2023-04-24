package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloOrdenadoB3 {
    public static void main(String[] args) {
        /**
         * Ordenar los elementos del arreglo de 10 números según requerimientos.
         * Ordena el Arreglo de abajo hacia arriba donde "10" quedara en la posición "0" y "1" en la posición "9"
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

        int b = a.length;
        int indice = 0;
        int j = b  - 1;

        while (indice < j){
            int aux = a[j];
            a[j] = a[indice];
            a[indice] = aux;
            indice++;
            j--;
        }

        for (int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }
    }
}
