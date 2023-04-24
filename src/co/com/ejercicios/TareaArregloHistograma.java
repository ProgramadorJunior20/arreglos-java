package co.com.ejercicios;

import java.util.Scanner;

public class TareaArregloHistograma {
    public static void main(String[] args) {
        /**
         * Imprimir histograma del arreglo
         */
        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[12];
        int[] frecuencia = new int[6];

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un números enteros de rango (1 al 6): ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println();

        // Contar la frecuencia de los números en el arreglo
        for (int i = 0; i < arreglo.length; i++){
            frecuencia[arreglo[i] - 1]++;
        }

        // Ahora vamos a imprimir el histograma
        for (int i = 0; i < 6; i++){
            System.out.print((i + 1) + ": ");
            for (int j = 0; j < frecuencia[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
