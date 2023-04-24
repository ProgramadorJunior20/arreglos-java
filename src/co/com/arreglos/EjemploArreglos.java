package co.com.arreglos;

import java.util.Arrays;

public class EjemploArreglos {
    public static void main(String[] args) {

        String[] productos = new String[7]; // Declaración de un arreglo de Strings con 7 elementos
        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta Generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos); // Ordena el arreglo de Strings de forma ascendente (A-Z)

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);





        int[] numeros = new int[4]; // Declaración de un arreglo de enteros con 4 elementos

        numeros[0] = 10; // Asignando un valor a la posición 0 del arreglo
        numeros[1] = Integer.valueOf("20"); // Asignando un valor a la posición 1 del arreglo
        numeros[2] = 30; // Asignando un valor a la posición 2 del arreglo
        numeros[3] = 40; // Asignando un valor a la posición 3 del arreglo
        //numeros[4] = 50;

        Arrays.sort(numeros); // Ordena el arreglo de enteros de forma ascendente (1-9)

        int i = numeros[0]; // obteniendo la posición 0 del arreglo
        int j = numeros[1]; // obteniendo la posición 1 del arreglo
        int k = numeros[2]; // obteniendo la posición 2 del arreglo
        int l = numeros[numeros.length - 1]; // obteniendo la posición 3 del arreglo

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
