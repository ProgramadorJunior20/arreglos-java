package co.com.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class CalculadoraPolacaInversaAppEjecrN25C2 {
    public static void main(String[] args) {
        /**
         * Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y un signo aritmético (String),
         * según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
         * Los signos aritméticos disponibles son:
         *
         * +: suma los dos operandos.
         * -: resta los operandos.
         * *: multiplica los operandos.
         * /: divide los operandos, este debe dar un resultado con decimales (double)
         * ^:  1º operando como base y 2º como exponente.
         * %:  módulo, resto de la división entre operando1 y operando2.
         */

        int operador1;
        int operador2;
        int resultado = 0;

        String num1 = JOptionPane.showInputDialog("Ingrese el operador 1:");
        operador1 = Integer.valueOf(num1);

        String signo = JOptionPane.showInputDialog("Ingrese el signo aritmético por favor:");

        String num2 = JOptionPane.showInputDialog("Ingrese el operador 2:");
        operador2 = Integer.valueOf(num2);

        switch (signo){
            case "+":
                resultado = operador1 + operador2;
                break;
            case "-":
                resultado = operador1 - operador2;
                break;
            case "*":
                resultado = operador1 * operador2;
                break;
            case "/":
                resultado = operador1 / operador2;
                break;
            case "^":
                resultado = (int) Math.pow(operador1, operador2);
                break;
            case "%":
                resultado = operador1 % operador2;
                break;
            default:
                System.out.println("El signo aritmético que acaba de ingresar no existe como uno matematico por el momento");
                System.exit(1);
        }

        System.out.println(operador1 + " " + signo + " " + operador2 + " = " + resultado);
    }
}
