package co.com.ejercicios;

import java.util.Scanner;

public class EjersicioArregloNumeroMasAltoB2 {
    public static void main(String[] args) {
        /**
         * Imprima el numero mas alto del arreglo
         */

        /**
         * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
         * por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
         */

        int[] numeros = new int[7];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }

        int numeroMasAlto = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            numeroMasAlto = (numeroMasAlto > numeros[i])? numeroMasAlto : numeros[i];
        }

        System.out.println("El número mas alto arreglo es: " + numeroMasAlto);

    }
}
