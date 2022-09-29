import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
Scanner obj = new Scanner(System.in);
/*

 // Declaración del array 
        int[] myarray = new int[4];

// asignación de valores al array (por el usuario)
for (int i = 0; i < myarray.length; i++) {
    System.out.println("ingrese el valor para el índice "+i);
    myarray[i] = obj.nextInt();
}

// recorrido del array

        for (int i = 0; i < myarray.length; i++) {
            System.out.println("estoy en el índice "+i);
            System.out.println(" y tengo guardado un "+myarray[i]);
            System.out.println("----------------");
        }
 
 */

//                  TP8

/*Ejercicio 1 – Array Booleano
Diseñar un programa que recorra las butacas de una sala de cine y determine cuántas butacas
desocupadas hay en la sala. Suponga que inicialmente tiene un array con valores booleanos
que si es true (verdadero) implica que está ocupada y si es false (falso) la butaca está
desocupada. Tenga en cuenta que el array deberá ser creado e inicializado al principio del
algoritmo. */
/*
 
// creo e inicializo el array
boolean[] miarray = {true, false, false, true, false, false, true, true};
// recorro el array con un for
for (int i = 0; i < miarray.length; i++) {
    if (miarray[i]==false) { // corroboro si la butaca está desocupada con un if
        System.out.println("la butaca número "+(i+1)+" está desocupada");// le agrego un +1 porque elarray y el for comienzan en 0
// también pude haber inicializado el for con un 1 en lugar de cero y arrojaría el mismo resultado
    }
} 
 
 */

/*
Ejercicio 2 – Diseñar un programa que calcula la suma total de una serie de números
ingresados por teclado. El programa deberá leer 10 números enteros y los debe guardar en un
array. Luego realizar la suma de todos los números y mostrar por pantalla el resultado final.
 */

int[] elarray = new int[10];  // creo e inicializo el array
int total=0; // creo una variable total para ir guardando los valores y sumándolos
for (int i = 0; i < elarray.length; i++) { // recorro el array
    elarray[i] = obj.nextInt();   //cargo los valores
    total += elarray[i];          // guardo los valores y los voy sumando a medida que se van cargando los datos
}
System.out.println("el total es "+total); // muestro la suma total por pantalla










obj.close();
    }
}
