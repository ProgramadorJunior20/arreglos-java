package co.com.arreglos;

public class EjemploArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        /**
         * Ejercicio arreglos intercalados
         */

        int[] numeros = new int[10];
        int[] a = new int[10];
 
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        }

        int aux = 0;
        for (int i = 0; i < numeros.length - i; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[numeros.length - 1 - i];
            //System.out.print(numeros[i] + " ");
            //System.out.println(numeros[numeros.length - 1 - i]);
        }
        
        for (int i = 0; i < a.length; i++){
            System.out.println("i = " + i + " valor: " + a[i]);
        }
    }
}
