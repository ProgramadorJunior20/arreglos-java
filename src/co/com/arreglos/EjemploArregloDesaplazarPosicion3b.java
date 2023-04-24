package co.com.arreglos;

import java.util.Scanner;

public class EjemploArregloDesaplazarPosicion3b {
    public static void main(String[] args) {
        /**
         * Agregar un elemento en una posición adecuada de manera que se mantega ordenado
         * también vamos a hacer que arreglo cresca manteniendo el orden
         */

        int[] a = new int[6]; // creamos un arreglo de 6 elementos
        int numero, posicion, ultimo;

        Scanner sc = new Scanner(System.in);

        // le pedimos a este for que llene todo el arreglo menos una posición
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero:");
            a[i] = sc.nextInt();
        }

        System.out.println(); // salto de linea

        // Vamos a pedirle a, el usuario el elemento y la posición en donde desea guardar el índice restante
        System.out.print("Ingrese un número a insertar:");
        numero = sc.nextInt();

        ultimo = a[a.length - 1];
        posicion = 0; // vamos a buscar la posición

        // Vamos a recorrer la posición mientras número se mantenga como mayor a los elementos de arreglo
        while (posicion < 5 && numero > a[posicion]){
            posicion++;
        }

        // desplazamos los elementos
        for (int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0, a.length);

        if (numero > ultimo) {
            b[b.length - 1] = numero;
        } else {
            b[b.length - 1] = ultimo;
            b[posicion] = numero;
        }

        // Imprimimos el resultado por consola
        for (int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }

    }
}
