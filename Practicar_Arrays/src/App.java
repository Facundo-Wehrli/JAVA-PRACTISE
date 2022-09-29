import java.util.Scanner;

import java.util.Random;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("EJERCICIO1");
        // ejercicio1
     
// Creating a new object of the class Random.
        // Creating a new object of the class Random.
        Random random = new Random();
        Scanner obj = new Scanner(System.in);
        int tamanio;
        int suma = 0;
// Asking the user to enter the size of the array.
        System.out.println("ingrese el tamaño del array");
        tamanio = obj.nextInt();
        // Ejercicio 1: Crea un array de números donde le indicamos por teclado el
        
       // Creating an array of integers with the size of the variable tamanio.
        int[] arreglo = new int[tamanio];

       // Creating a random number between 0 and 9 and adding it to the array.
        for (int i = 0; i < arreglo.length; i++) {
            int numaleatorio = random.nextInt(9);
            arreglo[i] = numaleatorio;
            suma += arreglo[i];
        }
        // al final muestra por pantalla el
        // valor de cada posición y la suma de todos los valores.
        // Printing the value of each position of the array.
        for (int j = 0; j < arreglo.length; j++) {
            System.out.println("en la posición " + "'" + j + "'" + " hay un =" + arreglo[j]);
        }

        // Ejercicio 2: Crear un array de números de un tamaño pasado por teclado,
        System.out.println("EJERCICIO 2");
        System.out.println("------------------");

        System.out.println("ingrese el tamaño del array ");
        int size = obj.nextInt();
        int[] myarray = new int[size];
        int biggerNumber = 0;
        // solicitar al
        // usuario que ingrese los valores que contendrá el array,
        for (int i = 0; i < myarray.length; i++) {
            System.out.println("ingrese el valor del índice " + i);
            myarray[i] = obj.nextInt();
            if (myarray[i] > biggerNumber) {
                biggerNumber = myarray[i];

            }

        } // Closing the for loop.
        System.out.println("el mayor es " + biggerNumber);
        System.out.println("---------------------");
        System.out.println("EJERCICIO 3");

        // Ejercicio 3: Crear un array de números de 100 posiciones, que contendrá los
        // números del 1 al
        // 100.

        double sumaa = 0;
        double promedioo = 0;
        int[] arrey = new int[100];
        for (int i = 0; i < arrey.length; i++) {
            arrey[i] = i;
            System.out.println(i);
        }
        for (int j = 1; j < arrey.length; j++) {
            sumaa += j;
            promedioo = sumaa / arrey.length;
        }
        System.out.println("la suma de los números es :" + sumaa);
        System.out.println(" y el promedio es : " + promedioo);

        obj.close();
        // Closing the main method and the class.
    }
}
