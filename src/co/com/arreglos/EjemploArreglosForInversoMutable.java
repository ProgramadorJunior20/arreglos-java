package co.com.arreglos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArreglosForInversoMutable {
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


        Arrays.sort(productos); // Ordena el arreglo de Strings de forma ascendente (A-Z)
        arregloInverso(productos); // este metodo invierte el arreglo de Strings

        //Collections.reverse(Arrays.asList(productos)); // la clase Collections tiene un método reverse que invierte el arreglo

        System.out.println(" ========= Inverso ========= ");
        for (int i = 0; i < total; i++) { // Recorre el arreglo de Strings
            System.out.println("Para indice " + i + " : " + productos[i]); // Imprime el valor del elemento en la posición i
        }

    }
}
