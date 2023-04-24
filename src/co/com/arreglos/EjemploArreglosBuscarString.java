package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosBuscarString {
    public static void main(String[] args) {
        /**
         * Buscar elementos de un arreglo
         */

        String[] a = new String[3]; // creamos un arreglo con diez elementos

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++){ // llenamos el arreglo
            System.out.print("Ingrese un string: ");
            a[i] = sc.next(); // por cada iteración ingresamos un número y lo guardamos en a[i]
        }

        // ahora vamos a buscar el elemento
        System.out.println("\r\nIngrese el string a buscar: ");
        String str = sc.next();
        int i = 0;

        while (i < a.length && !a[i].equalsIgnoreCase(str)){ // mientras "i" sea menor a longitud de "a" y "a[i]" sea distinto de "str" se va a iterar haste que una de las dos sea falsa
            i++;
        }

        if (i == a.length){
            System.out.println("String no encontrado");
            System.exit(0);
        } else if (a[i].toLowerCase().compareTo(str.toLowerCase()) == 0) {
            System.out.println("String encontrado en la posición: " + i);
            System.exit(1);
        }
    }
}
