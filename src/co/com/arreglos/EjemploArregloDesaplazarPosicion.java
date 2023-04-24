package co.com.arreglos;

import java.util.Scanner;

public class EjemploArregloDesaplazarPosicion {
    public static void main(String[] args) {
        /**
         * Agregar un elemento en una posición adecuada de manera que se mantega ordenado
         */

        int[] a = new int[6]; // creamos un arreglo de 6 elementos

        Scanner sc = new Scanner(System.in);

        // le pedimos a este for que llene todo el arreglo menos una posición
        for (int i = 0; i < a.length - 1; i++){
            System.out.print("Ingrese un numero:");
            a[i] = sc.nextInt();
        }

        System.out.println(); // salto de linea

        // Vamos a pedirle a, el usuario el elemento y la posición en donde desea guardar el índice restante
        System.out.print("Ingrese un nuevo elemento:");
        int elemento = sc.nextInt();

        System.out.print("Posición donde agregar elemento (de 0 a 5):");
        int posicion = sc.nextInt();

        // Movemos cada elemento una posición a la derecha
        // "i" es igual al penúltimo elemento del arreglo "a", y se itera hacia atrás hasta que llega al elemento en el índice "posicion"
        for (int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        // Colocamos el elemento indicado en la posición espesificada por el usuario
        a[posicion] = elemento;

        // Imprimimos el resultado por consola
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

    }
}
