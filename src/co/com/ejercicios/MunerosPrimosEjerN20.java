package co.com.ejercicios;

import java.util.Scanner;

public class MunerosPrimosEjerN20 {
    public static void main(String[] args) {
        /**
         * 20. Pide un número por teclado e indica si es un número primo o no.
         * Un número primo es aquel solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
         * ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
         * Un buen truco para calcular la raíz cuadrada del número e ir comprobando que si es divisible desde ese número hasta 1.
         * NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El numero " + numero + " no es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
        }
    }
}
