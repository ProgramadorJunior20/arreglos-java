package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloMayorOcurencia {
    public static void main(String[] args) {
        /**
         * Obtener el elemento con más ocurrencia en el arreglo
         */
        /**
         * Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
         * Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo
         * y también imprimir la cantidad de veces que aparece en el arreglo.
         *
         * Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
         *
         * Como resultado debería imprimir lo siguiente:
         * La mayor ocurrencias es: 3
         * El elemento que más se repite es: 5
         *
         * En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
         */

        Scanner sc = new Scanner(System.in);

        int[] arreglo = new int[10];
        int mayorOcurrencia = 0, numRepite = 0;

        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = sc.nextInt();
        }
        System.out.println();

        for (int i = 0; i < arreglo.length; i++){
            int contador = 0;

            for (int j = 0; j < arreglo.length; j++){
                if (arreglo[j] == arreglo[i]){
                    contador++;
                }
            }
            if (contador > mayorOcurrencia){
                mayorOcurrencia = contador;
                numRepite = arreglo[i];
            }
        }

        System.out.println("La mayor ocurrencias es: " + mayorOcurrencia);
        System.out.println("El elemento que más se repite es: " + numRepite);
    }
}
