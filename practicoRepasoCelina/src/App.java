import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);

        /*
         * 1. Solicitar al usuario que ingrese dos números enteros por teclado.
         * Guardar los números ingresados en dos variables para tal fin.
         * Validar que los dos números no sean iguales.
         * Si lo son,
         * volver a solicitar los dos números.
         * Luego, dado el rango de números enteros conformados por
         * los dos números ingresados, obtener la cantidad de números enteros que
         * contiene.
         * Mostrar el
         * resultado por pantalla.
         */

        /*
         * System.out.println("ingrese un número");
         * int num1 = tec.nextInt();
         * System.out.println("ingrese otro número");
         * int num2 = tec.nextInt();
         * if (num1!=num2){
         * 
         * }
         */

        /*
         * 2. Confirmado el rango de números enteros en el ejercicio 1, obtener la
         * cantidad de números
         * pares que contiene. Mostrar el resultado por pantalla.
         */

        /*
         * 3. Solicitar al usuario que ingrese un número entero por teclado. Guardar el
         * número ingresado
         * en una variable denominada nmultiplos para tal fin. Obtener la cantidad de
         * los primeros
         * nmultiplos números que son múltiplos de 5. Mostrar el resultado por pantalla.
         */

        /*
         * System.out.println("ingrese un entero");
         * int nmultiplos = tec.nextInt();
         * int i = 0;
         * while (i++ <= 100) {
         * System.out.println(i);
         * if (i % nmultiplos == 0) {
         * System.out.println("el '" + i + "' es múltiplo de " + nmultiplos);
         * }
         * 
         * }
         */

        /*
         * 4. Solicitar al usuario que ingrese dos números enteros por teclado.
         * Guardar los números ingresados en dos variables para tal fin.
         * Dado los 2 números identificar si son amigos,
         * (recuerdeque dos números son amigos si la suma de sus divisores de uno de
         * ellos es igual al otro y
         * viceversa), por ejemplo 220 y 284 son amigos:
         * Divisores de 220 son:
         * 1 + 2 +4 + 5 + 10 + 11 + 20 + 22 + 44 + 55 + 110 = 284
         * Divisores de 284 son:
         * 1+2+4+71+142 =220
         * Mostrar el resultado por pantalla.
         */
        /*
         * 
         * System.out.println("ingrese un número");
         * int num1 = tec.nextInt();
         * System.out.println("ingrese otro número");
         * int num2 = tec.nextInt();
         * int i = 1;
         * int suma = 0;
         * while (i < num1) {
         * if (num1 % i == 0) {
         * suma += i;
         * 
         * }
         * 
         * i++;
         * }
         * System.out.println("la suma es de los múltiplos del primer número es "
         * +suma+" entonces ");
         * if (suma == num2) {
         * System.out.println("los números son amigos");
         * }
         * else{
         * System.out.println(" los números no son amigos");
         * }
         * 
         */

        /*
         * 5. Escribir un programa que solicite la carga de un número entre 0 y 999, y
         * nos muestre un
         * mensaje de cuantos dígitos tiene el mismo. Finalizar el programa cuando se
         * cargue el valor 0.
         * Mostrar el resultado por pantalla.
         */

       
        int num;
        do {
            System.out.println("escribe un número entre 0 y 999");
            num = tec.nextInt();
            if (num > 0 && num < 1000) {
                if (num > 0 && num <= 9) {
                    System.out.println("el número " + num + " tiene 1 dígito");
                }
                if (num >= 10 && num <= 99) {
                    System.out.println("el número " + num + " tiene 2 dígitos");
                }
                if (num >= 100 && num <= 999) {
                    System.out.println("el número " + num + " tiene 3 dígitos");
                }
            }
        } while (num != 0);
        System.out.println("ingresó un cero, programa finalizado");

        /*
         * 6. Escribir un programa que solicite la carga de números por teclado en un
         * bucle repetitivo,
         * obtener su promedio. Finalizar la carga de valores cuando se cargue el valor
         * 0.
         */

        int[] numeros = new int[5];
        for (int j = 0; j < numeros.length; j++) {
            System.out.println("escribe un número");
            numeros[j] = tec.nextInt();
            
        }










        tec.close();
    }
}