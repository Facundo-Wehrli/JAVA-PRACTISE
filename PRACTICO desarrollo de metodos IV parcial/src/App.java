import java.util.Scanner;

// Ejercicio 1.
// Crear una aplicación java de consola que contenga lo siguiente:
// 1.	Crear un método para mostrar la tabla de multiplicar de cualquier número ingresado por teclado.
// Ejercicio 2.
// Crear una aplicación java de consola que contenga lo siguiente: un método que simule el proceso de subir a un piso en un ascensor, donde el número de piso es ingresado por teclado.
// Ejercicio 3.
// Crear una aplicación java de consola que contenga lo siguiente:
// 1.	Diseñe un método en el que se pida ingresar por teclado su género (M o F). 
// 2.	Luego solicitar su nombre que le corresponde a un varón o mujer.
// 3.	Imprimir por consola los datos ingresados por el usuario.
// Ejercicio 4.
// Crear una aplicación java de consola para un supermercado, donde se hace un 20% de descuento a los clientes cuya compra supere los $ 1.000 en las áreas de frutas, verduras y abarrotes. ¿Cuál será el total que pagará una persona por su compra?, se debe mostrar el nombre del cliente, producto, precio, cantidad, descuento y total a pagar. 
// Crear los métodos que consideres necesarios para la resolución de esta aplicación.

public class App {
  static Scanner obj = new Scanner(System.in);

  public static void main(String[] args) throws Exception {
    ingresarDatos();
    // mostrarTabla();
    // subirPiso();
  }

  // 1. Crear un método para mostrar la tabla de multiplicar de cualquier número
  // ingresado por teclado.
  // XXX ejercicio 1 terminado
  public static void mostrarTabla() {
    Scanner obj = new Scanner(System.in);
    System.out.println("ingrese un número");
    int num = obj.nextInt();
    // Creating a variable that will not be modified when the for loop is executed.
    int j = num;
    for (int i = 0; i < 11; i++) {
      num = j * i;
      System.out.println(j + "multiplicado por " + i + " es = (" + num + ")");
    }

  }

  // XXX ejercicio 2

  // Ejercicio 2.
  // Crear una aplicación java de consola que contenga lo siguiente: un método que
  // simule el proceso de subir a un piso en un ascensor, donde el número de piso
  // es ingresado por teclado.

  public static void subirPiso() {
    Scanner obj = new Scanner(System.in);
    System.out.println("ingrese el número de piso al que quiere llegar");
    int piso = obj.nextInt();
    for (int i = 0; i <= piso; i++) {
      if (i == 0) {
        System.out.println("está en planta baja");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
        i++; // acá lo aumenté para que después no ponga está en el piso 0 entonces empieza
             // del 1
      }
      if (i == piso) {
        System.out.println("hemos llegado al piso " + piso + " que nos pidió ya puede bajarse (musiquita de ascensor)");
        break;
      }
      System.out.println("está en el piso " + i);
      System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - -");
    }
  }

  public static void ingresarDatos() {
    System.out.println("ingrese su género M masculino, F femenino");
    String genero = obj.nextLine();
    System.out.println("ingrese su nombre");
    String nombre = obj.nextLine();
    System.out.println("Gracias " + nombre + " (" + genero + ") ! ha ingresado sus datos de manera exitosa ;)");
  }
}
