package co.com.arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class EjemploArregloDesplazarElementos {
    public static void main(String[] args) {
        /**
         * Mover los elementos en una posición desde el inicio del arreglo hasta el final
         */

        int[] a = new int[10]; // creamos un arreglo con de diez elementos

        int[] arr = a;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++){ // llenamos el arreglo
            System.out.print("Ingrese un numero: ");
            arr[i] = sc.nextInt();
        }

        // Desplazar elementos

        // Almacenamos el último elemento en una variable auxiliar
        int aux = arr[arr.length - 1];

        // Movemos cada elemento una posición a la derecha
        for (int i = arr.length - 2; i >= 0; i--){
            arr[i + 1] = arr[i];
        }

        // Colocamos el último elemento en la primera posición
        arr[0] = aux;

        // Imprimimos el arreglo resultante
        //System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
