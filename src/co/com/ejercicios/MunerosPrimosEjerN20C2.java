package co.com.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class MunerosPrimosEjerN20C2 {
    public static void main(String[] args) {
        /**
         * 20. Pide un número por teclado e indica si es un número primo o no.
         * Un número primo es aquel solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
         * ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
         * Un buen truco para calcular la raíz cuadrada del número e ir comprobando que si es divisible desde ese número hasta 1.
         * NOTA: Si se introduce un número menor o igual que 1, directamente es no primo.
         */

        String num = JOptionPane.showInputDialog("Ingrese un numero: ");
        int numero = Integer.parseInt(num);

        if (numero <= 1) {
            System.out.println("El numero " + numero + " no es primo");
        } else {
            int i = 2;
            boolean esPrimo = true;
            while (i < numero) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
                i++;
            }
            if (esPrimo) {
                System.out.println("El numero " + numero + " es primo");
            } else {
                System.out.println("El numero " + numero + " no es primo");
            }
        }
    }
}
