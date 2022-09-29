import java.util.Scanner;

public class hola {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner obj = new Scanner(System.in);

        // Ejercicio Final: Escribir una aplicación de consola Java que realice lo
        // siguiente:
        // 1. Crear un array de números y otro de String de 10 posiciones cada uno.

        float[] myarray = new float[10];
        String[] strarray = new String[10];

        /*
         * 2. Solicitar al usuario que ingrese las notas entre 0 y 10. Se debe controlar
         * que inserte
         * una nota valida, pudiendo ser decimal la nota en el array de números. Guardar
         * las
         * notas en el array.
         */

        for (int i = 0; i < myarray.length; i++) { // creo un for para cargar las notas en el array de números
            System.out.println("ingrese una nota entre 0 y 10");// le pido que ingrese una nota
            myarray[i] = obj.nextFloat();// ingresa la nota
            if (myarray[i] > 10 || myarray[i] < 0) { // si pone una nota fuera de los parámetros establecidos:
                System.out.println("nota no válida, intente denuevo");// le salta este mensaje
                i--; // y se resta un índice para que vuelva a cargar sobre el mismo alumno al
                     // iniciar el for
            }
        }

        /*
         * 3. Solicitar al usuario que ingrese los nombres de los alumnos. Guardar en el
         * array de
         * Strings los nombres de los alumnos ingresados.
         */
        obj.nextLine();// para consumir el \n del último float y no haya problema con el siguiente
                       // nextline
        for (int j = 0; j < strarray.length; j++) { // cargo los nombres de los alumnos con un for
            System.out.println("ingrese el nombre del alumno: " + j);
            strarray[j] = obj.nextLine();
        }

        /*
         * 4. Luego mostrar por pantalla cada alumno, su nota y resultado. Se debe
         * considerar para
         * el resultado las siguientes validaciones:
         * a. Si la nota esta entre 0 y 5,99 el resultado será “No aprobado”.
         * b. Si la nota esta entre 6 y 6,99 el resultado será “Aprobado bueno”.
         * c. Si la nota esta entre 7 y 8,99 el resultado será “Notable”.
         * d. Si la nota esta entre 9 y 10 el resultado será “Sobresaliente”.
         */

        for (int k = 0; k < 9; k++) { // con un for recorro los arrays para poner las notas y los alumnos
            System.out.println("la nota de ");
            System.out.println(strarray[k]); // aquí voy poniendo alumno por alumno
            System.out.println(" es : " + myarray[k] + " entonces su nota califica como : "); // aquí con su respectiva
                                                                                              // nota
            // aquí empiezo a poner las validaciones con ifs y depende la nota le va a
            // aparecer x mensaje
            if (myarray[k] >= 0 && myarray[k] < 6) {
                System.out.println("---- No aprobado----");
            }
            if (myarray[k] >= 6 && myarray[k] < 7) {
                System.out.println("----Approbado bueno----");
            }
            if (myarray[k] >= 7 && myarray[k] <= 9) {
                System.out.println("----Notable----");
            }
            if (myarray[k] > 9 && myarray[k] <= 10) {
                System.out.println("----Sobresalieente----");
            }
        }

        // Ejercicio Recuperatorio: Escribir una aplicación de consola Java que realice
        // lo siguiente

        /* 1. Crear un array de números de 5 posiciones. */
        int[] array1 = new int[5];
        /* 2. Inicializar el array creado con los siguientes valores {1,2,3,4,5}. */
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        array1[3] = 4;
        array1[4] = 5;
        int[] array2 = new int[array1.length];
        for (int i = array1.length - 1, j = 0; i >= 0; i--, j++) { // array1.lenght-1 es decir elige el 5,)
            // (porque el array tiene 5 posiciones pero cómo comienza del cero se le resta
            // uno, te da 4 que repito,
            // al empezar de cero es la quinta posición
            // el segundo array (usamos j) empieza de cero
            // el priero de i
            // mientras que el primero se decrementa el segundo se incrementa (ambos en una
            // unidad)
            array2[j] = array1[i];// y aquí vamos asignando los valores que se van intercambiando con sus índices
            System.out.println(array2[j]);
            System.out.println(array1[j]);
        }

        obj.close();
// Es el cierre del main y del class
    }
}