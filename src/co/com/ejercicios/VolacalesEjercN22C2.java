package co.com.ejercicios;

public class VolacalesEjercN22C2 {
    public static void main(String[] args) {
        /**
         * 22. Del siguiente String «La lluvia en Sevilla es una maravilla»
         * cuenta cuantas vocales hay en total (recorre el String con charAt).
         */
        /*
            Reemplaza todas las a del String anterior por una e.
         */
        
        String cadena = "La lluvia en Sevilla es una maravilla";
        //String cadena = "Jeffeson";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (
                    cadena.charAt(i) == 'a'
                    || cadena.charAt(i) == 'e'
                    || cadena.charAt(i) == 'i'
                    || cadena.charAt(i) == 'o'
                    || cadena.charAt(i) == 'u'
            ) {
                contador++;
            }
            cadena = cadena.replace('a', 'e');
        }

        System.out.println("cadena = " + cadena);
        System.out.println("La cadena tiene " + contador + " vocales");
    }
}
