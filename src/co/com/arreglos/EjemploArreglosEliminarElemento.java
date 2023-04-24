package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosEliminarElemento {
    public static void main(String[] args) {
        /**
         * Eliminar un elemento en una posición sin dejar hueco
         */

        // Creamos un arreglo con 10 elementos
        int[] a = new int[10];

        // Copiamos el arreglo "a" en otro arreglo que lo llamaremos "arr"
        // int[] arr = a;

        // Creamos esta variable que va a guardar la posición que vamos a eliminar
        int posicion;

        Scanner sc = new Scanner(System.in);

        // Llenamos el arreglo con datos que ingresara el usuario por consola
        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        System.out.println();

        // Le pedimos al usuario la posición del arreglo que desea eliminar
        System.out.println("Ingrese la posición que desea eliminar entre (0 - 9): ");
        posicion = sc.nextInt();

        // Desplaza los elementos posteriores a la posición que deseas eliminar hacia la izquierda
        for (int i = posicion; i < a.length - 1; i++){
            a[i] = a[i + 1];
        }
        System.out.println();

        // Establece el último elemento en null o en 0 para eliminarlo del arreglo
        System.out.println("Arreglo a");
        a[a.length - 1] = 0;

        // Imprimimos por consola el arreglo modificado
        for (int i = 0; i < a.length; i++){
            System.out.println(i + " => " + a[i]);
        }
        System.out.println();

        // Compiamos el erreglo
        System.out.println("Arreglo b");
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, b.length);

        // Imprimimos por consola el 2 arreglo modificado
        for (int i = 0; i < b.length; i++){
            System.out.println(i + " => " + b[i]);
        }
    }
}
