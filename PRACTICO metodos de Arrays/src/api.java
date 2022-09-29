import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class api {
    public static void main(String[] args) {

        /*TODO EJERCICIO1
         * 
         * 1. Crear dos Arrays de String,
         * rellenar los arrays con datos solicitados al usuario. Indica si los dos
         * arrays
         * creados y completados son iguales utilizando el método Equals de Arrays.
         */

        Scanner keyboard = new Scanner(System.in);

        String[] array1 = new String[5];
        String[] array2 = new String[5];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("ingrese una cadena ");
            array1[i] += keyboard.nextLine();
            System.out.println("ingrese una cadena para el segundo array");
            array2[i] += keyboard.nextLine();
        }

      

        if (Arrays.equals(array1, array2)) {
            System.out.println("son iguales ");
        }

        else
            System.out.println("son diferenes");

        /*TODO EJERCICIO2
         * 
         * 2. Crear un Arrays de números,
         * solicitar al usuario los valores para completar los elementos del arrays.
         * Ordena
         * el array de números utilizando el método Sort de Arrays.
         */

        // creo el array de nùmeros
        int[] arrey = new int[5];

        for (int i = 0; i < arrey.length; i++) {
            System.out.println("ingrese un valor entero");
            arrey[i] = keyboard.nextInt();
        }
        Arrays.sort(arrey);
        System.out.println(Arrays.toString(arrey));

        /*
         * 
         * 1) Crear un Arrays de String que
         * contendrá los nombres de los alumnos de 1º año TUP.
         * 2) Solicitar al usuario que
         * ingrese los nombres de los alumnos.
         * 
         * 3)Realizar un ordenamiento
         * alfabético ascendente, mostrar los resultados.
         * 4)Luego realiza un ordenamiento
         * descendente.
         * 
         * Solicitar al usuario que ingrese
         * un nombre de alumno a buscar. Realiza una búsqueda en el Arrays, si
         * encuentras
         * coincidencia muestra por pantalla el índice (la ubicación) y el nombre del
         * alumno. Si no encuentras coincidencia deja un mensaje de aviso.
         */

        keyboard.nextLine();
        /*TODO EJERCICIO3
         * Crear un Arrays de String que
         * contendrá los nombres de los alumnos de 1º año TUP
         */
        String[] alumnos = new String[4];
        int nAlumno = 1;
        for (int i = 0; i < alumnos.length; i++) {
            // 2) Solicitar al usuario que ingrese los nombres de los alumnos.
            System.out.println("ingrese el alumno nùmero " + nAlumno);
            nAlumno++;
            alumnos[i] = keyboard.nextLine();
        }
        // 3) Realizar un ordenamiento alfabético ascendente, mostrar los resultados
        System.out.println("orden ascendente ");
        Arrays.sort(alumnos);
        System.out.println(Arrays.toString(alumnos));
        // 4)Luego realiza un ordenamiento descendente.
        // espacio para que quede más prolijo el output
        System.out.println("\n");
        System.out.println("orden descendente");
        Arrays.sort(alumnos, Collections.reverseOrder());
        System.out.println(Arrays.toString(alumnos));
        // espacio para que quede más prolijo el output
        System.out.println("\n");

        // 5)Solicitar al usuario que ingrese un nombre de alumno a buscar con un sout

        System.out.println("Ingrese el nombre del alumno a buscar");
        String nombreIngresado = keyboard.next();
        boolean validar = true;
        // 6) Realiza una búsqueda en el Arrays, si encuentras coincidencia muestra por
        // pantalla el índice (la ubicación) y el nombre del
        // alumno.
        // reccorro los alumnos cargados para ver si existe alguna coincidencia con el
        // que cargó el usuario
        for (int i = 0; i < alumnos.length; i++) {

            if (alumnos[i].equalsIgnoreCase(nombreIngresado)) {
                System.out.println(" El Indice es " + i + " y el Nombre es " + alumnos[i]);
                validar = false;
            }

        }
        // Si no encuentras coincidencia deja un mensaje de aviso.
        //el valor de la variable booleana validar sigue siendo true por lo tanto no hubo coindicencias y muestro ese mensaje
        if (validar == true) {
            System.out.println("no hubo coincidencia");
        }

        keyboard.close();
    }

}