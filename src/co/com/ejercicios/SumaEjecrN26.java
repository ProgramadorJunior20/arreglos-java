package co.com.ejercicios;

import javax.swing.*;

public class SumaEjecrN26 {
    public static void main(String[] args) {
        /**
         * Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.
         */

        String num = JOptionPane.showInputDialog("Ingrese un número mayor a 1 por favor:");
        int numeroSuma = Integer.valueOf(num);

        if (numeroSuma == 1){
            System.out.println("Por favor el numero debe ser mayor a 1");
            System.exit(1);
        }

        int resultado = 0;
        for (int i = 1; i < numeroSuma + 1; i++){
            resultado += i;
        }
        System.out.println("La suma del 1 al " + numeroSuma + " es: " + resultado);
    }
}
