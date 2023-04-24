package co.com.ejercicios;

public class CodigoAsciiAjercN24 {
    public static void main(String[] args) {
        /**
         * Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII.
         * Muestralos en línea recta, separados por un espacio entre cada carácter.
         */

        String cadena = "La lluvia en Sevilla es una maravilla";

        for (int i = 0; i < cadena.length(); i++){
            int asciiValue = (int) cadena.charAt(i);
            //System.out.print("El valor ASCII del caracter " + cadena.charAt(i) + " es: " + asciiValue + ", ");
            System.out.print(cadena.charAt(i) + " " + asciiValue + ", ");
        }
    }
}
