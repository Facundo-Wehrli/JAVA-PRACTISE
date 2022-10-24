// Ejercicio 2.
// Revisa el flujo de ejecución a través de un programa con múltiples métodos.
// Lee el siguiente código y responde las preguntas.

public class Buzz {
    public static void baffle(String blimp) {              //8
        System.out.println(blimp);                         //9
        zippo("ping", -5);                          //10
    }

    public static void zippo(String quince, int flag) {     //2
        if (flag < 0) {                                     //3
            System.out.println(quince + "zoop");            //4
        } else {                                            //5
            System.out.println("ik");                     //6
            baffle(quince);                                 //7
            System.out.println("boo-wa-ha-ha");          //11
        }
    }

    public static void main(String[] args) {                 //1
        zippo("rattle", 13);                    //1.5
    }
}
// 1. Escribir el número 1 al lado de la primera línea de código en este
// programa que se ejecutará.
// 2. Escribir el número 2 al lado de la segunda línea de código, y así
// sucesivamente hasta el final del
// programa. Si una línea se ejecuta más de una vez, podría terminar con más de
// un número al lado.
// 3. ¿Cuál es el valor del parámetro blimp cuando se invoca el baffle?
// 4. ¿Cuál es el resultado de este programa?
