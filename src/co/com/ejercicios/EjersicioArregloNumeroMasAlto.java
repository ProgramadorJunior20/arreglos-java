package co.com.ejercicios;

public class EjersicioArregloNumeroMasAlto {
    public static void main(String[] args) {
        /**
         * Imprima el numero mas alto del arreglo
         */

        /**
         * Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
         * por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
         */

        int[] numeros = {11, 24, 38, 45, 49, 49, 99};

        int numeroMasAlto = numeros[0];

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > numeroMasAlto){
                numeroMasAlto = numeros[i];
            } else if (numeros[i] == numeroMasAlto) {
                continue;
            }
        }

        System.out.println("El número mas alto arreglo es: " + numeroMasAlto);

    }
}
