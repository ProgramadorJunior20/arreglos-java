package co.com.arreglos;

import java.util.Arrays;

public class EjemploArreglosForOrdenaminetoBurbuja {
    public static void arregloInverso(String[] arreglo){

        int total = arreglo.length;
        int total2 = arreglo.length;

        for ( int i = 0; i < total2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[total - i - 1];
            arreglo[i] = inverso;
            arreglo[total - i - 1] = actual;
            total2--;
        }

    }

    public static void sortBurbuja(Object[] arreglo){

        // Ordenamiento burbuja
        /**for (int i = 0; i < total; i++){
         for (int j = 0; j < total; j++){
         if ( productos[i].compareTo(productos[j]) < 0 ) {
         String auxiliar = productos[i];
         productos[i] = productos[j];
         productos[j] = auxiliar;
         }
         contador++;
         }
         }*/

        //Arrays.sort(productos); // Ordena el arreglo de Strings de forma ascendente (A-Z)
        //arregloInverso(productos); // este metodo invierte el arreglo de Strings

        int total = arreglo.length; // Obtiene la cantidad de elementos del arreglo
        int contador = 0;

        for (int i = 0; i < total; i++){

            for (int j = 0; j < total-1-i; j++){
                if ( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0 ) {
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }

        }

        System.out.println("contador = " + contador);

    }

    public static void main(String[] args) {

        String[] productos = {
                "Kingston Pendrive 64GB",
                "Samsung Galaxy",
                "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air",
                "Chromecast 4ta Generación",
                "Bicicleta Oxford"
        };

        int total = productos.length; // Obtiene la cantidad de elementos del arreglo

        sortBurbuja(productos);

        System.out.println(" ========= Inverso ========= ");
        for (int i = 0; i < total; i++) { // Recorre el arreglo de Strings
            System.out.println("Para indice " + i + " : " + productos[i]); // Imprime el valor del elemento en la posición i
        }

        System.out.println(" ========= Ordenado Int ========= ");

        Integer[] numeros = new Integer[4]; // Declaración de un arreglo de enteros con 4 elementos

        numeros[0] = 40; // Asignando un valor a la posición 0 del arreglo
        numeros[1] = Integer.valueOf("30"); // Asignando un valor a la posición 1 del arreglo
        numeros[2] = 20; // Asignando un valor a la posición 2 del arreglo
        numeros[3] = 10; // Asignando un valor a la posición 3 del arreglo

        sortBurbuja(numeros);

        for (int i = 0; i < numeros.length; i++) { // Recorre el arreglo del entero
            System.out.println("Para indice " + i + " : " + numeros[i]); // Imprime el valor del elemento en la posición i
        }

    }
}
