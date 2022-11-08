public class parte2 {

    // Ejercicio 12¿
    // Cuál es
    // el resultado
    // del siguiente programa?
    // Describir en
    // pocas palabras
    // lo que
    // hace mus.

    // Guía de
    // ejercicios Programación II–C2 29/09/2022

    public static int[] make(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        //a cada uno de los valores del array le suma i +1
        return a;
    }

   /**
    * The function takes an array of integers and doubles each element in the array
    * 
    * @param jub the array to be doubled
    */
    public static void dub(int[] jub) {
        for (int i = 0; i < jub.length; i++) {
            jub[i] *= 2;
        }
        
    }

    public static int mus(int[] zoo) {
        int fus = 0;
        for (int i = 0; i < zoo.length; i++) {
            fus += zoo[i];
        }
        //suma los valores del array pasado por parámetro y los guarda en fus
        return fus;
    }
    
 
    public static void main(String[] args) {
        //el siguiente código toma un array de enteros, duplica cada elemento y retorna la suma del array
        int[] bob = make(5);
        dub(bob);
        System.out.println(mus(bob));
    }
}
