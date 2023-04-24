package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloSistemaEstadistico {
    public static void main(String[] args) {
        /**
         * Sistema estadístico con elementos de un arreglo.
         */
        /**
         * Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos.
         */

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[7];

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingresa un numero: ");
            arreglo[i] = sc.nextInt();
        }

        double suma = 0;

        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] >= 0){
                suma += arreglo[i];
            } else {
                System.out.println("EL numero es negativo " + arreglo[i]);
            }
        }

        double promedio = suma / arreglo.length;

        System.out.println("El promedio del arreglo es: " + promedio);

    }
}
