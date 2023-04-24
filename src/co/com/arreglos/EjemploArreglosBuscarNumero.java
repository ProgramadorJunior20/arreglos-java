package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarNumero {
    public static void main(String[] args) {
        /**
         * Buscar elementos de un arreglo
         */

        int[] a = new int[10]; // creamos un arreglo con diez elementos

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){ // llenamos el arreglo
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt(); // por cada iteración ingresamos un número y lo guardamos en a[i]
        }

        // ahora vamos a buscar el elemento
        System.out.println("\r\nIngrese un numero a buscar: ");
        int num = sc.nextInt();
        int i = 0;

        while (i < a.length && a[i] != num){ // mientras "i" sea menor a longitud de "a" y "a[i]" sea distinto de "num" se va a iterar haste que una de las dos sea falsa
            i++;
        }

        if (i == a.length){
            System.out.println("Número no encontrado");
            System.exit(0);
        } else if (a[i] == num) {
            System.out.println("Número encontrado en la posición: " + i);
            System.exit(1);
        }
    }
}
