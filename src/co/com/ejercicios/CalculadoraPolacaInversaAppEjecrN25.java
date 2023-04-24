package co.com.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class CalculadoraPolacaInversaAppEjecrN25 {
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
        Scanner sc = new Scanner(System.in);
        int operador1 = 0;
        int operador2 = 0;
        int resultado = 0;


        System.out.println("Ingrese el operador 1: ");
        operador1 = sc.nextInt();

        System.out.println("Ingrese el signo aritmético por favor: ");
        String signo = sc.next();

        System.out.println("Ingrese el operador 1: ");
        operador2 = sc.nextInt();

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
                break;
        }

        System.out.println(operador1 + " " + signo + " " + operador2 + " = " + resultado);
    }
}
