package co.com.arreglos;

import java.util.Scanner;

public class EjemploArregloDesplazarElementos2 {
    public static void main(String[] args) {
        /**
         * Agregar un elemento en una posición indicada y mover los siguientes elementos
         */

        int[] a = new int[10]; // creamos un arreglo con de diez elementos

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length - 1; i++){ // llenamos el arreglo y dejamos una posición sin llenar
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt();
        }

        System.out.println();

        // Desplazar elementos

        // Le pedimos al usuario el elemento y la posición en donde desea guardar el elemento
        System.out.println("Nuevo elemento:");
        int elemento = sc.nextInt();

        System.out.println("Posición donde agregar elemento (de 0 a 9):");
        int posicion = sc.nextInt();

        // Movemos cada elemento una posición a la derecha
        for (int i = a.length - 2; i >= posicion; i--){
            a[i + 1] = a[i];
        }

        // Colocamos el elemento ingresado en la posición indicada por el usuario
        a[posicion] = elemento;

        // Imprimimos el arreglo resultante
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }
}
