package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {
        /**
         * Vamos a detectar si el arreglo esta ordenado de forma ascendente o descendente
         * o de ninguna de las dos formas
         */

        int[] a = new int[7];

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 7 números por favor: ");

        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;

        for (int i = 0; i < a.length - 1; i++){

            if (a[i] > a[i+1]) {
                descendente = true;
            }

            if (a[i] < a[i+1]) {
                ascendente = true;
            }
        }

        if (ascendente == true && descendente == true){
            System.out.println("Arreglo = Desordenado");
        }

        if (ascendente == false && descendente == true){
            System.out.println("Arreglo = Descendente");
        }

        if (ascendente == true && descendente == false){
            System.out.println("Arreglo = Ascendente");
        }
    }
}
