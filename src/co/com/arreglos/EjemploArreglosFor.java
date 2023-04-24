package co.com.arreglos;

import java.util.Arrays;

public class EjemploArreglosFor {
    public static void main(String[] args) {

        String[] productos = new String[7]; // Declaración de un arreglo de Strings con 7 elementos
        
        int total = productos.length; // Obtiene la cantidad de elementos del arreglo

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // Ordena el arreglo de Strings de forma ascendente (A-Z)
        System.out.println(" ============ Usa for ============ ");
        for (int i = 0; i < total; i++) { // Recorre el arreglo de Strings
            System.out.println("Para indice " + i + " : " + productos[i]); // Imprime el valor del elemento en la posición i
        }
        System.out.println(" ============ Usa for each ============ ");
        for (String produc: productos){
            System.out.println("productos = " + produc);
        }

        System.out.println(" ============ Usa while ============ ");
        int i = 0;
        while ( i < total ) { // Recorre el arreglo de Strings
            System.out.println("Para indice " + i + " : " + productos[i]); // Imprime el valor del elemento en la posición i
            i++;
        }

        System.out.println(" ============ Usa do while ============ ");
        int d = 0;
        do {
            System.out.println("Para indice " + d + " : " + productos[d]); // Imprime el valor del elemento en la posición i
            d++;
        } while (d < total); // Recorre el arreglo de Strings



        int[] numeros = new int[11]; // Declaración de un arreglo de enteros con 4 elementos

        int totalNumeros = numeros.length; // Obtiene la cantidad de elementos del arreglo

        /**
         * Ahora vamos a llenar el arreglo de enteros con números aleatorios
         */

        for (int j = 0; j < totalNumeros; j++) {
            //numeros[j] = (int) Math.round(Math.random() * 100);
            numeros[j] = j * 4;
        }

        int multiplicador = 4;

        for (int j = 0; j < totalNumeros; j++) {
            System.out.println(multiplicador + " x " + j + " = " + numeros[j]);
        }


    }
}
