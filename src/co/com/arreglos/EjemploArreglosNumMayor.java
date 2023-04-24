package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosNumMayor {
    public static void main(String[] args) {
        /**
         * obteniendo el número mayor de un arreglo
         */

        int[] a = new int[5]; // creamos un arreglo de tamaño 5 llamado "a"

        Scanner sc = new Scanner(System.in); // Utilizamos la clase scanner para pedir información por consola
        System.out.println("Ingrese 5 enteros: ");

        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 1; i < a.length; i++){
            max = (a[max] > a[i])? max: i; // la variable max guarda el número más grande en cada iteración
        }

        System.out.println("max = " + a[max]); // Imprimimos el número mayor de arreglo

    }
}
