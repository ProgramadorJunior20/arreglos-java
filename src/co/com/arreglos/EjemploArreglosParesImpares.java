package co.com.arreglos;

import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {

        int[] a, pares, impares; // definimos variables del arreglo

        int totalPares = 0, totalImpares = 0; // definimos dos variables en donde pares e impares comienzan en zero

        a = new int[10]; // creamos un arreglo de un tamaño de 10 espacios en la memoria

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros por favor: ");

        for (int i = 0; i < a.length; i++){ // llenamos el arreglo a
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) { // ciclo para validar cuantos números son pares del arreglo a y cuantos no lo son

            if (a[i] % 2 == 0){
                totalPares++;
            } else {
                totalImpares++;
            }
        }

        // ya que tenemos los números pares e impares del arreglo a, ahora vamos a crear los arreglos par impar para guardar los resultados
        pares = new int[totalPares];
        impares = new int[totalImpares];

        int j = 0; // para pares
        int k = 0; // para impares

        // ahora vamos a llenar los dos arreglos
        for (int i = 0; i < a.length; i++){
            if (a[i] % 2 == 0){
                pares[j++] = a[i]; // de esta forma tomamos los pares y los guardamos en j
            } else {
                impares[k++] = a[i]; // de esta forma tomamos los impares y los guardamos en k
            }
        }

        // por último imprimimos los datos del arreglo por consola
        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++){
            System.out.print(pares[i] + " ");
        }

        System.out.println("\nImpares");
        for (int i = 0; i < impares.length; i++){
            System.out.print(impares[i] + " ");
        }

    }
}
