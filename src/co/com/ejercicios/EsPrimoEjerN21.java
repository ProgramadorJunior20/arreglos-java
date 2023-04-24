package co.com.ejercicios;

public class EsPrimoEjerN21 {
    public static void main(String[] args) {
        /**
         * 21. Muestra los números primos entre 1 y 100.;
         */

        for (int i = 1; i <= 100; i++){
            //Hacemos un casting para que nos devuelva un numero entero
            int raiz = (int) Math.sqrt(i);
            int contador = 0;

            //Hacemos otro bucle para contar los divisibles
            for (int j = raiz; j > 1; j--){
                if (i % j == 0){
                    contador++;
                }
            }

            /*Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0
             */

            if ( contador < 1 ){
                System.out.println(i + " " + "Es primo");
            }

        }
    }
}
