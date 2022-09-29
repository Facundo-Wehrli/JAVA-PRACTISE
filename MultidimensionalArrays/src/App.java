import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        // Creating a new object of the class Scanner, which is used to read the input
        // from the keyboard.
        Scanner obj = new Scanner(System.in);

        // // Creating a two-dimensional array of integers with 3 rows and 2 columns.
        // int[][] matriz = new int[3][2];
        // // O alternativamente
        // int[][] matriz2;
        // matriz = new int[2][2];
        // // Ahora procedemos a cargar la matriz con valores:

        // // Assigning values to the elements of the array.
        // matriz[0][0] = 1;
        // matriz[0][1] = 2;
        // matriz[1][0] = 3;
        // matriz[1][1] = 4;

        // /*
        // * También se pueden cargar directamente los elementos, durante la declaración
        // * de la matriz de
        // * la siguiente manera:
        // */
        // // declaring 2 elements for each row of the array separated by keys.
        // int[][] matriz3 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        // // Para obtener el número de filas de la matriz, podemos recurrir a la
        // // propiedad
        // // “length” de los
        // // arrays, de la siguiente manera:
        // int filas = matriz.length;

        // // Para el caso del número de columnas sería de la siguiente forma:
        // int columnas = matriz[0].length;

        // // También Java nos permite la posibilidad de clonar una matriz, es decir,
        // // crear
        // // una matriz nueva
        // // a partir de otra matriz, siguiendo esta sintaxis:
        // int[][] nuevaMatriz = matriz.clone();
        // int[][] alumnosfxniveleidioma = new int[3][4];

        // alumnosfxniveleidioma[0][0] = 7;
        // alumnosfxniveleidioma[0][1] = 14;
        // alumnosfxniveleidioma[0][2] = 8;
        // alumnosfxniveleidioma[0][3] = 3;
        // alumnosfxniveleidioma[1][0] = 6;
        // alumnosfxniveleidioma[1][1] = 19;
        // alumnosfxniveleidioma[1][2] = 7;
        // alumnosfxniveleidioma[1][3] = 2;
        // alumnosfxniveleidioma[2][0] = 3;
        // alumnosfxniveleidioma[2][1] = 13;
        // alumnosfxniveleidioma[2][2] = 4;
        // alumnosfxniveleidioma[2][3] = 1;

        // // También, podríamos asignar contenido de esta otra forma, como ya se ha
        // // explicado
        // // anteriormente:
        // int[][] alumnosfxniveleidiomaa = { { 7, 14, 8, 3 }, { 6, 19, 7, 2 }, { 3, 13,
        // 4, 1 } };

        // /* Ejercicio Array multidimensional */

        // // Creating a two-dimensional array of Strings with 5 rows and 25 columns. It
        // // is
        // // then assigning the
        // // value "Pedro Hernández Gonzàlez" to the element in the third row and 24th
        // // column. Finally, it is
        // // printing the value of that element.
        // String[][] nombreAlumno = new String[5][25];
        // nombreAlumno[2][23] = "Pedro Hernández Gonzàlez";
        // System.out.println("El alumno número 24 del curso tercero se llama " +
        // nombreAlumno[2][23]);
        // // El resultado del programa es la aparición del mensaje “El alumno número 24
        // // del curso tercero
        // // se llama Pedro Hernández González.
        // // En este ejemplo, [5] representa a los cursos. Hablamos de 5 cursos que son
        // // identificados con 0,
        // // 1, 2, 3, 4, por lo que [2] hace mención al tercer curso; lo mismo podemos
        // // decir de [23], que
        // // corresponde al alumno número 24. Hay que recordar que siempre en Java
        // // tenemos
        // // que contar
        // // el cero, ya que si no lo hacemos podemos cometer errores

        // int[][] numeros;
        // int i, j2;
        // numeros = new int[2][3];

        // for (i = 0; i < numeros.length; i++) { // recorre filas

        // for (int j2 = 0; j2 < numeros.length; j2++) {// de cada fila recorre todas
        // // sus columnas
        // // lleno la matriz con ceros
        // numeros[i][j2] = 0;
        // System.out.println(numeros[i][j2] + " ");
        // }

        // }

        // Creating two arrays, one of Strings with 4 rows and 3 columns, and another
        // one of Strings
        // with 4 elements.
        String[][] ciudades = new String[4][3];
        String[] países = new String[4];
        // Asking for the name of the countries and storing them in the array países.
        System.out.println("Introduzca el nombre de cuatro países.");
        // Asking for the name of the countries and storing them in the array países.
        for (int i = 0; i < países.length; i++) {
            países[i] = obj.nextLine();
        } 

        // Asking the user to input three cities for each country.
        for (int país = 0; país < 4; país++) {
            System.out.println("Introduzca tres ciudades de " + países[país] + ".");
            for (int ciudad = 0; ciudad < 3; ciudad++) {
                System.out.println("la ciudad número " + ciudad + " del país :" +
                        países[país] + "\n");
                System.out.println("posición de la matriz = [" + país + ":" + ciudad + "]");
                ciudades[país][ciudad] = obj.nextLine();
            }
        }

        // Printing the countries and cities.
        System.out.print("\nLos países y ciudades introducidos son los siguientes: \n");
        // Printing the countries in the array.
        for (int l = 0; l < 4; l++) {
            System.out.print("\n" + países[l] + ": \t");
            // Printing the cities of the country.
            for (int m = 0; m < 3; m++) {
                System.out.print(ciudades[l][m] + "\t");
            }
        }

    
        // Closing the scanner object.
        obj.close();
        // Closing the main method and the class.
    }
}
