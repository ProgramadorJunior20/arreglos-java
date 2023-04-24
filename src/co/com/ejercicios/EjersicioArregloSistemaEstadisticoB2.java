package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloSistemaEstadisticoB2 {
    public static void main(String[] args) {
        /**
         * Sistema estadístico con elementos de un arreglo.
         */
        /**
         * Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
         * el promedio de los negativos y contar el número de ceros.
         */

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[7];
        int numCeros = 0;
        double sumPositivos = 0, sumNegativos = 0;
        int conPositivos = 0,  conNegativos = 0;

        // Leer los números por teclado y almacenarlos en el arreglo
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingresa un numero: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println();

        // Calcular promedio de los números positivos, el promedio de los negativos y contar los ceros
        for (int i = 0; i < arreglo.length; i++){
            if (arreglo[i] > 0){
                sumPositivos += arreglo[i];
                conPositivos++;
            } else if (arreglo[i] < 0) {
                sumNegativos += arreglo[i];
                conNegativos++;
            } else {
                numCeros++;
            }
        }

        double promedioPositivo = 0, promedioNegativo = 0;

        // Válida que el contador "conPositivos" sea diferente de zero para evitar, la division por cero
        if (conPositivos != 0){
            promedioPositivo = sumPositivos / conPositivos;
        }

        // Válida que el contador "conNegativos" sea diferente de zero, para evitar la division por cero
        if (conNegativos != 0){
            promedioNegativo = sumNegativos / conNegativos;
        }

        // Imprimir resultados
        System.out.println("Promedio números positivos: " + promedioPositivo);
        System.out.println("Promedio números negativos: " + promedioNegativo);
        System.out.println("Cantidad de zeros: " + numCeros);

    }
}
