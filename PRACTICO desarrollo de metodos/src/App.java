
/*
 Ejercicio 1.
Desarrollar una aplicación java de consola, crear un array de 10 posiciones de números con valores
pedidos por teclado. Mostrar por consola el índice y el valor al que corresponde. Haz dos métodos,
uno para rellenar valores y otro para mostrar.
 */
import java.util.Scanner;

public class App {
    Scanner obj = new Scanner(System.in);

    public void rellenar(int[] arreglo) {
        System.out.println("ingrese un número para el array");
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = obj.nextInt();
        }
        obj.close();
    }

    public void mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("posición: " + arreglo[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        // int arrey[] = new int[10];
        // App app = new App();
        // app.rellenar(arrey);
        // app.mostrar(arrey);

        triangle triangulo = new triangle();
        System.out.println(triangulo.isTriangle(1, 2, 3));

    }   

}

