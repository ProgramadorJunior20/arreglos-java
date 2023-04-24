package co.com.ejercicios;

public class ReemplazaEjerc23 {
    public static void main(String[] args) {
        /**
         * 23. Del siguiente String «La lluvia en Sevilla es una maravilla» reemplaza todas las a por una e.
         */

        String cadena = "La lluvia en Sevilla es una maravilla";
        cadena = cadena.replace('a', 'e');
        System.out.println("cadena = " + cadena);
    }
}
