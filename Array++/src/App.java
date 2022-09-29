import java.util.Arrays;
import java.util.Collections;
public class App {
    public static void main(String[] args) throws Exception {
     //   in this project we're going to see "Arrays" class

    /*TODO   Programas con arrays.
   
     Algunos puntos importantes acerca de las matrices, arreglos o arrays de Java.
     ▪ En Java, todas las matrices se asignan dinámicamente. (Se analiza a continuación)
     ▪//* Como las matrices/arrays son objetos en Java, cada array tiene asociado una variable de instancia de longitud (length) 
     que contiene la cantidad de elementos que la matriz puede contener. (En otras palabras, length contiene el tamaño de la matriz.)
     // TODO como se declara un array en java
     ▪ Una variable array en Java se declara como otras variables con corchetes [] después del tipo de datos.
     ▪ Las variables en el array están ordenadas y cada una tiene un índice que comienza desde 0.
     ▪ El array Java también se puede usar como un campo estático, una variable local o un parámetro de método.
     ▪ El tamaño de un array debe especificarse mediante un valor int y no, long o short.
     ▪ La superclase directa de un tipo de array es Object.
     ▪ Cada tipo de array implementa las interfaces Cloneable y java.io.Serializable.
     ▪ El array puede contener tipos de datos primitivos así como también objetos  de una clase según la definición del array.
      En el caso de los tipos de datos primitivos, los valores reales se almacenan en ubicaciones de memoria contigua. En el caso de los objetos de una clase, los objetos reales se almacenan en heap.
*/
/*TODO 1. Qué es un Array en Java
//*Un array o arreglo es una colección de variables del mismo tipo, a la que se hace referencia por un nombre común.
    En Java, los arrays pueden tener una o más dimensiones, aunque el array unidimensional es el más común.
Los arrays se usan para una variedad de propósitos porque ofrecen un medio conveniente de agrupar variables relacionadas.
    Por ejemplo, puede usar una matriz para mantener un registro de la temperatura alta diaria durante un mes,
    una lista de promedios de precios de acciones o una lista de tu colección de libros de programación.
//*La ventaja principal de un array es que organiza los datos de tal manera que puede ser manipulado fácilmente.
    Por ejemplo, si tiene un array que contiene los ingresos de un grupo seleccionado de hogares, es fácil calcular el ingreso promedio haciendo un ciclo a través del array. Además, los arrays organizan los datos de tal manera que se pueden ordenar fácilmente.
    Aunque los arrays en Java se pueden usar como matrices en otros lenguajes de programación,
    tienen un atributo especial: se implementan como objetos. 
    Este hecho es una de las razones por las que la discusión de los arrays se pospuso hasta que se introdujeron los objetos.
    Al implementar arrays como objetos, se obtienen varias ventajas importantes,
    una de las cuales es que los arrays no utilizados pueden ser recolectados.
 */
/*TODO 2. Arrays unidimensionales

Un array unidimensional es una lista de variables relacionadas. Tales listas son comunes en la programación.
 Por ejemplo, puede usar un array unidimensional para almacenar los números de cuenta de los usuarios activos en una red.
  Otro array podría usarse para almacenar los promedios de bateo actuales para un equipo de béisbol.
//*La forma general de declarar un arreglo unidimensional es:
 */
//tipo nombre-array[]; 
//tipo [] nombre-array;

/*//*  La declaración de un array tiene dos componentes: el tipo y el nombre.
tipo declara el tipo de elemento del array. El tipo de elemento determina el tipo de datos de cada elemento que comprende la matriz.
 Al igual que la matriz de tipo int, también podemos crear una matriz de otros tipos de datos primitivos como char, float, double..etc 
 o tipo de datos definido por el usuario (objetos de una clase).
  Por lo tanto, el tipo de elemento para la matriz determina el tipo de datos que la matriz contendrá.
Ejemplo: */
// ambas son declaraciones válidas int intArray[];  
//int[] intArray; 
 
//Tipo de datos primitivos 

//byte byteArray[]; short shortArray[]; boolean booleanArray[]; long longArray[]; float floatArray[]; double doubleArray[]; char charArray[]; 
 
//Tipos de datos definidos por el usuario 
 
// una serie de referencias a objetos de la clase MyClass (una clase creada por  el usuario) 
 
// MyClass myClassArray[];  
 
//Object[]  ao,        // array de Object 
//Collection[] ca;  // array de Collection 

/* TODO Aunque la primera declaración anterior establece el hecho de que intArray es una variable de matriz, en realidad no existe una matriz.
 Simplemente le dice al compilador que esta variable
(intArray) contendrá una matriz del tipo entero. Para vincular intArray con una matriz física real de enteros, 
debe asignar una usando new y asignarlo a intArray. Ya veremos…
 */

/* TODO 2.1. Instanciando un array en Java
//*Cuando un array se declara, solo se crea una referencia del array.
 Para realmente crear o dar memoria al array (a partir de aquí solo mencionaré a array, y no matriz o arreglo),
  puede crear un array de la siguiente manera:
 */ // de esta forma tambièn le estas asignando memoria al array
//nombre-array = new tipo[n] ;

/* ▪ tipo especifica el tipo de datos que se asignará
▪ tamaño especifica el número de elementos en el array
▪ nombre-array es el nombre de la variable del array vinculado al mismo.
▪ Es decir, para usar new para asignar un array, debe especificar el tipo y la cantidad de elementos a asignar.
Ejemplo:
//*int intArray[]; //declarando un array 
//*intArray = new int; // asignando memoria al array
int[] intArray = new int; // combinando ambas declaraciones en una 
 */

/*TODO Nota:Los elementos en la matriz asignada se inicializarán automáticamente con los sgtes valores:
cero (para tipos numéricos),
false (para booleano)
o null (para tipos de referencia).
Obtener un array es un proceso de dos pasos. 
Primero, debe declarar una variable del tipo de array deseado. 
En segundo lugar, debe asignar la memoria que mantendrá el array, usar y asignarla a la variable del array.
 Por lo tanto, en Java, todos los arrays se asignan dinámicamente.
 */

/*TODO 2.2. Array Literal
//*¿Què es un literal?
A literal is a source code representation of a fixed value. They are represented directly in the code without any computation.
Un literal es una representación de código fuente de un valor fijo. Se representan directamente en el código sin ningún cálculo.
En una situación en la que ya se conoce el tamaño y los elementos del array, se pueden usar literalmente, los literales del array.
 */

int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; // Declarando un array literal
/* La longitud de este array determina la longitud del array creado.
No es necesario escribir new int[] en las últimas versiones de Java */

/* TODO 2.3. Accediendo a los elementos del Array usando el bucle for
A cada elemento del array se accede a través de su índice.
 El índice comienza con 0 y termina en (tamaño total del array) -1. 
 Se puede acceder a todos los elementos de la matriz usando el bucle for en Java.
 */
//acceder a los elementos del array for: 
/* (int i = 0; i < arr.length; i++)
 System.out.println("Elemento en el índice " + i + " : "+ arr);
 */
//Ejemplo:
// Programa Java para ilustrar la creación de un array de enteros,
 // coloca algunos valores en la matriz, e imprime cada valor

     // declara un array de enteros.
      int[] arr; 
      // asignando memoria para 5 enteros.
        arr = new int[5]; 
       // inicializa el primer elemento del array 
        arr[0] = 10;
        // inicializa el segundo elemento del array
        arr[1] = 20;
          // y así...
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50; 
        // accediendo a los elementos del array 
        for (int i = 0; i < arr.length; i++)
        System.out.println("Elemento en el índice " + i + " : "+ arr[i]);
        System.out.println("\n\n");
/* TODO 3. Uso de metodo length en Arrays
Debido a que los arreglos se implementan como objetos,
cada array tiene asociado una variable de instancia de longitud (length) que contiene la cantidad de elementos que el array puede contener.
(En otras palabras, length contiene el tamaño del array.) Aquí hay un programa que demuestra esta propiedad:
 */
// Demostrando el uso de length en Arrays class DemoArray 
        int lista[] = new int[10];
        int num[] = {1,2,3}; 
        int tabla[][]={  
                {1,2,3}, 
                {4,5}, 
                {6,7,8,9} 
        }; 
        System.out.println("Longitud de lista: "+lista.length);         
        System.out.println("Longitud de num: " +num.length); 
        System.out.println("Longitud de tabla: "+tabla.length); 
      /*   output:
        Longitud de lista: 10
        Longitud de num: 3
        Longitud de tabla: 3 */
        //Usando length para inicializar lista    
            for (int i=0; i < lista.length; i++)            
             lista[i] = (i*i); 
        System.out.print("La lista es: ");        
         //Ahora usamos length para mostrar lista        
          for (int i=0; i < lista.length; i++)   
        System.out.print(lista[i]+ " "); 
       
        System.out.println("\n ");
// CLASS ARRAUS
 
/*TODO .EQUALS:
 * compara cadenas para averiguar si son iguales
 * ejemplo:
 */

String myStr1 = "Hello"; 
String myStr2 = "Hello"; 
String myStr3 = "Another String"; 
System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal 
System.out.println(myStr1.equals(myStr3)); // false 

System.out.println("\n ");

/*TODO Diferencia entre el operador de igualaciòn  == y .equals () en Java 
En general, tanto .equals() como el operador "==" en Java se utilizan para comparar objetos para verificar la igualdad, pero estas son algunas de las diferencias entre los dos: 
//*▪	La principal diferencia entre el método .equals() y el operador == es que uno es un método y el otro es el operador. 
▪	Podemos usar operadores == para la comparación de referencias (comparación de direcciones) y el método .equals() para la comparación de contenido. En palabras simples, == comprueba si ambos objetos apuntan a la misma ubicación de memoria, mientras que .equals() evalúa la comparación de valores en los objetos. 
== compara los objetos y .equals evalùa el contenido de los objetos.
Si una clase no anula el método equals, entonces de forma predeterminada utiliza el método equals (Object o) de la clase principal más cercana que ha anulado este método.  
Ejemplo de codificación: 
 */

// Java program to understand 
// the concept of == operator   
    String s1 = "HELLO"; 
    String s2 = "HELLO"; 
    String s3 =  new String("HELLO"); 
    System.out.println(s1 == s2); // true 
    System.out.println(s1 == s3); // false 
    System.out.println(s1.equals(s2)); // true 
    System.out.println(s1.equals(s3)); // true 

    System.out.println("\n ");

/* TODO    Java.util.Arrays.equals() in Java  
 * Checks if both the arrays are equal or not.
*/ 

// Java program to demonstrate
// Arrays.equals() method

		// Get the Arrays
		int intArr[] = { 10, 20, 15, 22, 35 };

		// Get the second Arrays
		int intArr1[] = { 10, 15, 22 };

		// To compare both arrays
		System.out.println("Integer Arrays on comparison: "
						+ Arrays.equals(intArr, intArr1));
// it'll return false because those values ar not equals 
            System.out.println("\n ");

/* TODO  Arrays.toString()
It returns a string representation of the contents of this array. The string representation consists of a list of the array’s elements, enclosed in square brackets (“[]”). Adjacent elements are separated by the characters a comma followed by a space. Elements are converted to strings as by String.valueOf() function.
 */
  // Get the Array
  int intArr4[] = { 10, 20, 15, 22, 35 };
  
  // To print the elements in one line
  System.out.println("Integer Array: "
                     + Arrays.toString(intArr4));

                     System.out.println("\n ");
/* 
Output
Integer Array: [10, 20, 15, 22, 35] */


/* TODO Arrays.deepToString() in Java 
Devuelve una representación de cadena del "contenido profundo" de la matriz especificada. Si la matriz contiene otras matrices como elementos, la representación de cadena contiene su contenido y así sucesivamente. Este método está diseñado para convertir matrices multidimensionales en cadenas. El método simple toString () funciona bien para arreglos simples, pero no para arreglos multidimensionales. Este método está diseñado para convertir matrices multidimensionales en cadenas. 
  */
// Get the Array
int intArra[][] = { { 10, 20, 15, 22, 35 } };
  
// To get the deep String of the arrays
System.out.println("Integer Array: "
                   + Arrays.deepToString(intArra));
//output :
// Integer Array: [[10, 20, 15, 22, 35]]

//Example: 
/* Let us suppose that we are making a 2-D array of 3 rows and 3 column. 
    2   3   4    
    5   6   7
    2   4   9 
 
If use deepToString() method to print the 2-D array,  we will get string representation as :- [[2,3,4], [5,6,7], [2,4,9]]  */
//Printing multidimensional Array: 
// A Java program to print 2D array using deepToString() 
 
   
        // Create a 2D array        
        int[][] mat = new int[2][2];       
        mat[0][0] = 99;      
        mat[0][1] = 151;     
        mat[1][0] = 30;       
        mat[1][1] = 5;    
        // print 2D integer array using deepToString() 
        System.out.println(Arrays.deepToString(mat));    

        System.out.println("\n ");
        // imprime con corchetes por filas y columnas
      /*   Output: 
        [[99, 151], [30, 5]]   */


/* TODO     toString() vs deepToString() 
        toString () funciona bien para matrices unidimensionales, pero no funciona para matrices multidimensionales. 
         Java program to demonstrate that toString works if we  
         want to print single dimensional array, but doesn't work   for multidimensional array.   */
        // Trying to print array of strings using toString 
        String[] strs = new String[] {"practice.geeksforgeeks.org", 
                                      "quiz.geeksforgeeks.org" 
                                     }; 
        System.out.println(Arrays.toString(strs));    
        // Trying to print multidimensional array using 
        // toString 
        int[][] mat1 = new int[2][2];  
                mat1[0][0] = 99;
                mat1[0][1] = 151;       
                mat1[1][0] = 30;       
                mat1[1][1] = 50; 
        System.out.println(Arrays.toString(mat)); 

        System.out.println("\n ");
/* Output: 
[practice.geeksforgeeks.org, quiz.geeksforgeeks.org] 
[[I@15db9742, [I@6d06d69c]  */

/* deepToString () funciona tanto para unidimensionales como para multidimensionales,
 pero no funciona para una matriz unidimensional de primitivas  */

// Java program to demonstrate that deepToString(strs)) 
// works for single dimensional arrays also, but doesn't // work single dimensional array of primitive types. 
String[] stris = new String[] {"practice.geeksforgeeks.org", 
                                      "quiz.geeksforgeeks.org" 
                                     }; 
        System.out.println(Arrays.deepToString(stris)); 
           
        Integer []  arr1 = {10, 20, 30, 40}; 
        System.out.println(Arrays.deepToString(arr1));   
        
        System.out.println("\n ");
      /*   Output: 
[practice.geeksforgeeks.org, quiz.geeksforgeeks.org] 
[10, 20, 30, 40] 
 */
        
        /* Uncommenting below code would cause error as     
            deepToString() doesn't work for primitive types 
      si descomentamos el còdigo aparecerà un error de que dee.ToString no puede resolver la variable[] tipo int       
               int []  arr2 = {10, 20, 30, 40}; 
        System.out.println(Arrays.deepToString(arr2));   */     

      /*  TODO Arrays.fill() in Java 
      Assigns this fill value to each index of this arrays.
     Este método asigna el valor del tipo de datos especificado a cada elemento del rango especificado de la matriz especificada. 
 */

// Get the Arrays
int intArrs[] = { 10, 20, 15, 22, 35 };
  
int intKey = 22;

// Filling the array with the value of intKey.
Arrays.fill(intArrs, intKey);

// To fill the arrays
System.out.println("Integer Array on filling: "
                   + Arrays.toString(intArrs));

 System.out.println("\n ");
/* output:
           Integer Array on filling: [22, 22, 22, 22, 22]
 */


// Java program to fill a subarray array with  
// given value. 
/*TODO Arrays.fill() fromIndex toIndex */
        int ar[] = {2, 2, 2, 2, 2, 2, 2, 2, 2};    
        // Fill from index 1 to index 4. 
        Arrays.fill(ar, 1, 5, 10); 
      // primer parámetro, índice incluído, segundo parámetro hasta el índice no incluído es decir i-1 
      // y el tercer parámetro es el valor que va a tener el array dentro de esa intérvalo.
        System.out.println(Arrays.toString(ar)); 

        System.out.println("\n ");
    
/* Output: 
[2, 10, 10, 10, 10, 2, 2, 2, 2]  */

/*  Podemos usar un bucle para llenar una matriz multidimensional. 
1) TODO Rellenar matriz 2D 
 Java program to fill a multidimensional array with
given value. 

        int [][]ar2 = new int [3][4];    
         Fill each row with 10.    
            for (int[] row : ar) 
            Arrays.fill(row, 10); 
      
        System.out.println(Arrays.deepToString(ar)); 
    
/* Output: 
[[10, 10, 10, 10], [10, 10, 10, 10], [10, 10, 10, 10]]  */
//2) Fill 3D Array 
// Java program to fill a multidimensional array with  // given value.  
   
int[][][] ar2= new int[3][4][5];    
// Fill each row with -1.        
  for (int[][] row : ar2) {         
        for (int[] rowColumn : row) { 
        Arrays.fill(rowColumn, -1); 

        }
  }   
        System.out.println(Arrays.deepToString(ar2));    
        
        System.out.println("\n ");
/* Output: 
[[[-1, -1, -1, -1, -1], [-1, -1, -1, -1, -1], [-1, -1, -1, -1, -1], [-1, -1, -1, -1, -1]], [[-1, -1, -1, -1, -1], [-1, -
1, -1, -1, -1], [-1, -1, -1, -1, -1], [-1, -1, -1, -1, -1]], [[-1, -1, -1, -1, -1], [-1, -1, -1, -1, -1], [-1, -1, -1, 1, -1], [-1, -1, -1, -1, -1]]] 
 */
System.out.println("'Arrays.sort' \n");
/* TODO Arrays.sort() in Java 

https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/

Una clase de matriz es una clase que contiene métodos estáticos que se utilizan con matrices para buscar, ordenar, comparar, insertar elementos o devolver una representación de cadena de una matriz. en una matriz. Entonces, especifiquemos las funciones primero y luego discutiremos las mismas. Son los siguientes que han estado presentes en la clase java.util.Arrays. Aquí discutiremos diferentes gráficos usando el método sort () de la clase Arrays. 
//*El método Arrays.sort () consta de dos variaciones, una en la que no pasamos ningún argumento en el que clasifica la matriz completa, ya sea una matriz de enteros o una matriz de caracteres, pero si se supone que debemos ordenar una parte específica utilizando este método de la clase Arrays, entonces lo sobrecargamos y pasamos el índice inicial y el último a la matriz. 
Syntax: sort() Method  
Arrays.sort();  
Syntax:  Overloaded sort() Method 
public static void sort(int[] arr, int from_Index, int to_Index) ; 
Parameters: It takes three parameters as can be perceived from the syntax which are as follows: 
//*1)The array to be sorted 
//*2)The index of the first element, inclusive, to be sorted (Referred to as from_index) 
//*3)The index of the last element, exclusive, to be sorted (Referred to as last_index) 
//*Return Type: It does not return any value. 
 */
/* TODO Throws Possible Exceptions  :
1)IllegalArgumentException if fromIndex > toIndex.
2)ArrayIndexOutOfBoundsException if fromIndex < 0 or >array.length 
 */
//TODO Example 1: Java Program to Sort Array of Integers by Default Sorts in an Ascending Order using Arrays.sort() Method 
System.out.println("example1");
        // Custom input array 
        int[] arra = { 13, 7, 6, 45, 21, 9, 101, 102 };   
        // Applying sort() method over to above array 
        // by passing the array as an argument 
        Arrays.sort(arra); 
        // Printing the array after sorting 
        System.out.printf("Modified arra[] : %s", 
        Arrays.toString(arra)); 
     /*    output :
        Modified arra[] : [6, 7, 9, 13, 21, 45, 101, 102] */
System.out.println("\n ");
      
/* TODO     Example 2 Java program to Sort a Subarray in Array   Using Arrays.sort() method  */
//*sorting a subarray means to sort a portion of an array */
//*TODO Arrays.sort() works with the same dynamic as Arrays.fill() */
System.out.println("example2");
    // Custom input array 
    // It contains 8 elements as follows   
               int[] arro = { 13, 7, 6, 45, 21, 9, 2, 100 };   
    // Sort subarray from index 1 to 4, i.e.,//* the term i.e means "that is" o en español "esto es" */
    // only sort subarray {7, 6, 45, 21} and 
    // keep other elements as it is. 
                Arrays.sort(arro, 1, 5); 
    // Printing the updated array which is 
    // sorted after 2 index inclusive till 5th index exclusive
                System.out.printf("Modified arro[] : %s", 
                                   Arrays.toString(arro)); 
             /*  output:
                           Modified arro[] : [13, 6, 7, 21, 45, 9, 2, 100] */
        
                                   System.out.println("\n");

/*  TODO Example 3  */
System.out.println("example3");
// Java program to Sort a Subarray in Descending order 
        // Note that we have Integer here instead of 
        // int[] as Collections.reverseOrder doesn't 
        // work for primitive types. 
        Integer[] arri = { 13, 7, 6, 45, 21, 9, 2, 100 };   
        // Sorts arr[] in descending order using 
        // reverseOrder() method of Collections class 
        // in Array.sort() as an argument to it 
        Arrays.sort(arri, Collections.reverseOrder());   
        // Printing the array as generated above 
        System.out.printf("Modified arri[] : %s", 
                           Arrays.toString(arri)); 

                           System.out.println("\n");
/* output:
Modified arri[] : [100, 45, 21, 13, 9, 7, 6, 2] */

  /*TODO Example 4 */   
  System.out.println("example 4");          
 
        // Custom input string 
        String arru[] = { "practice.geeksforgeeks.org", 
                         "quiz.geeksforgeeks.org", 
                         "code.geeksforgeeks.org" }; 
  
      System.out.println("ascending order: (c,p,q)");
        // Sorts arr[] in ascending order 
        Arrays.sort(arru); 
        System.out.printf("Modified arru[] : \n%s\n\n", 
                           Arrays.toString(arru));   
        // Sorts arr[] in descending order 
        Arrays.sort(arru, Collections.reverseOrder()); 
  System.out.println("descending order: (q,p,c)");
        // Lastly printing the above array 
        System.out.printf("Modified arru[] : \n%s\n\n", 
                           Arrays.toString(arru)); 
          
                           System.out.println("\n");

/* output:
                ascending order: (c,p,q)
      Modified arru[] :
      [code.geeksforgeeks.org, practice.geeksforgeeks.org, quiz.geeksforgeeks.org]

      descending order: (q,p,c)
      Modified arru[] :
      [quiz.geeksforgeeks.org, practice.geeksforgeeks.org, code.geeksforgeeks.org] */


/* TODO printf vs println (extra material)    
 explanation video : https://www.youtube.com/watch?v=c2B_Av3x65s
    println is used when you want to create a new line with just simple text or even text containing concatenation. ("Hello " + "World" = "Hello World.")

printf is used when you want to format your string. This will clean up any concatenation. For a simple example -> ("Hello, " + username + "! How are you?") could easily be cleaned up a bit by using ("Hello, %s! How are you?", username). It's up to you really when you want to use this.

I would definitely recommend it if you are using multiple variables. In that case you would use multiple conversions in your string. Please feel free to read up on the Formatter Documentation as it will help you understand it better and it provides a full list of available conversion characters. */
      
/*TODO Información importante extra 
la longitud del array no es parte de su tipo:
 * es decir que su longitud no se relaciona, ni cambia con el tipo de dato que almacene el array
 * 
 * si despuès del for(ya sea comùn o mejorado) no hay llaves te toma todo lo que haya hasta el primer ";"
 * 
 * los ìndices de un array siempre tiene que ser de tipo "int".
 * 
 * cada elemento de un array  se llama componente(component)
 * 
 *(an array reference)== es una referencia del array osea: es el nombre de ese array.
 *
 *los arrays se pueden anidar es decir poner arrays dentro de arrays.
 */









    }
}
