public class App {

    // Ejercicio 11
    // El propósito de este ejercicio es practicar la lectura de códigos y reconocer
    // los patrones
    // transversales: búsqueda de un elemento en la matriz, recorrer los elementos y
    // realizar una
    // operación sobre cada uno, operación de reducción ("reduce" un
    // conjunto de valores a un solo
    // valor).
    // Los siguientes métodos son difíciles de leer, porque en lugar de usar nombres
    // significativos para
    // las variables y métodos, usan nombres de frutas.
    /**
     * It takes an array of integers and returns the product of all the integers in the array
     * 
     * @param a an array of integers
     * @return The product of all the numbers in the array.
     */
    public static int banana(int[] a) {
        int kiwi = 1;
        int i = 0;
        while (i < a.length) {
            kiwi = kiwi * a[i];
            i++;
        }
        return kiwi;
    }

//muestra los valores del array utilizando la variable kiwi 

  /**
   * Given an array of integers and a target integer, return the index of the target integer in the
   * array, or -1 if the target integer is not in the array.
   * 
   * @param a an array of integers
   * @param grape the number you're looking for
   * @return The index of the first occurrence of the value in the array.
   */
    public static int grapefruit(int[] a, int grape) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == grape) {
                return i;
            }
        }
        return -1;
    }
    //si la posición de larray coincide con el entero retorna el índice de la posición que coincidió con grape
    //y si no coincide retorna -1, se utiliza el return como un "else"

 /**
  * It takes an array of integers and an integer, and returns the number of times the integer appears
  * in the array
  * 
  * @param a an array of integers
  * @param apple the number you're looking for
  * @return The number of times the value of apple is found in the array a.
  */
    public static int pineapple(int[] a, int apple) {
        int pear = 0;
        for (int pine : a) {
            if (pine == apple) {
                pear++;
            }
        }
        return pear;
    }
 // toma un array de enteros y un entero, y retorna el número de veces que el entero aparece en el array a.


    // Para cada método, escribir una oración que describa lo que hace el método,
    // sin entrar en detalles
    // sobre cómo funciona. Para cada variable, identificar el papel que juega.
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
