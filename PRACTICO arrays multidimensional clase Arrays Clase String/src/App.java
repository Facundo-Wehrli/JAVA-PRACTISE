import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        /* TODO EJERCICIO 1 */
        Scanner keyboard = new Scanner(System.in);
        /*
         * 1. Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
         * mayúsculas).
         * Luego,
         * 2.pedir al usuario posiciones del array por teclado
         * y si la posición es correcta, se añadirá a una cadena que se mostrara al
         * final,
         * se dejará de insertar en esa cadena cuando se introduzca un -1 para la
         * posición.
         * Por ejemplo, si escribo los siguientes números
         * 0 //Añadira la ‘A’ a la cadena
         * 5 //Añadira la ‘F’ a la cadena
         * 25 //Añadira la ‘Z’ a la cadena
         * 50 //Error, inserte otro número
         * -1 //fin
         * Cadena resultante: AFZ
         */
        /*
         * 1 Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
         * mayúsculas).
         */
        String[] abc = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R",
                "S", "T", "U", "V", "W", "X", "Y", "Z" };

        /*
         * 2.pedir al usuario posiciones del array por teclado
         * y si la posición es correcta, se añadirá a una cadena que se mostrara al
         * final,
         * se dejará de insertar en esa cadena cuando se introduzca un -1 para la
         * posición.
         */
        String cadena = "";
        int posicion;
        do {

            System.out.println("ingrese una posición del abecdario");
            posicion = keyboard.nextInt();
            if (posicion > 25) {
                System.out.println("error, inserte otro nùmero");
            }
            if (posicion >= 0 && posicion <= 25) {
                cadena += abc[posicion];
            }

        } while (posicion != -1);

        System.out.println(cadena);
        // fin ejercicio 1

        System.out.println("\n");
        /* TODO EJERCICIO 2 */
        /*
         * 2. Crear una aplicación de consola que
         * 1)solicite al usuario que ingrese por teclado una frase.
         * 2) Pasar los caracteres de esa frase a un array de caracteres. Para ello
         * podrás
         * utilizar métodos de la clase String.
         */
        // puse este nextLine aquì porque sino me trae problemas con el anterior
        // nextInt.
        keyboard.nextLine();
        // 1)solicite al usuario que ingrese por teclado una frase.
        System.out.println("porfavor ingrese una frase");
        String frase = keyboard.nextLine();
        System.out.println("la frase original es :" + frase);
        /*
         * 2) Pasar los caracteres de esa frase a un array de caracteres. Para ello
         * podrás utilizar métodos de la clase String.
         */
        // pido el tamaño del String con el método .length
        System.out.println("el length es " + frase.length());
        // creo una variable de tipo int para guardar el length de la frase
        int longitud = frase.length();
        // creo un array de caracteres y le doy una dimensión equivalente al tamaño de
        // la frase original
        char[] copia = new char[longitud];
        // Copying the characters of the string into an array.
        for (int i = 0; i < longitud; i++) {
            copia[i] = frase.charAt(i);
        }

        System.out.println("la copia es :");
        System.out.println(copia);

        // fin ejercicio
        System.out.println("\n");

        /* TODO EJERCICIO3 */
        /*
         * 3. Crear una aplicación de consola,
         * 1) crear un Array de números,
         * 2) rellenar el array de números (int) usando el método fill de Arrays.
         * 3). Crear otro Array de números, copiar los elementos del otro usando CopyOf
         * de Arrays.
         */

        // 1) crear un Array de números
        int[] original = new int[5];
        // 2rellenar el array de números (int) usando el método fill de Arrays.
        Arrays.fill(original, 5);
        // 3 Crear otro Array de números, copiar los elementos del otro usando CopyOf de
        // Arrays.
        // uso to.String para imprimirlo para corroborar que funcione el ejercico.
        System.out.println(Arrays.toString(original));
        int[] copy = Arrays.copyOf(original, original.length);
        System.out.println(Arrays.toString(copy));

        keyboard.close();
    }
}
