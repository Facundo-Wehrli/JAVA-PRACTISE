import java.util.Scanner;
import java.util.Arrays;

public class Apepe {
    // 1. Crear un método que solicite datos personales a los usuarios ejemplo:
    // nombre,
    // apellido y la edad, y sean ingresado por teclado.

    public static void ingresarDatos() {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = obj.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = obj.nextLine();
        System.out.println("ingrese su edad");
        int edad = obj.nextInt();

        obj.close();
    }

    // 2. Crear otro método que imprima los datos de una persona ingresados por
    // teclado e
    // indicar si es mayor o menor de edad.
    public String imprimirDatos_MayoriaEdad() {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = obj.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = obj.nextLine();
        System.out.println("ingrese su edad");
        int edad = obj.nextInt();

        String mayorOmenor = "";

        if (edad >= 18 && edad < 110) {
            mayorOmenor = "mayor de edad";
        } else if (edad < 18 && edad > 1) {
            mayorOmenor = "menor de edad";
        } else
            System.out.println("error intente denuevo");

        String usuario = "nombre :" + nombre + " apellido :" + apellido + " edad :" + edad + "(" + mayorOmenor + ")";
        obj.close();
        return usuario;
    }

    // 3. Crear otro método que almacene los datos ingresados por el usuario en un
    // array,
    // puede ser unidimensional y por cada usuario se puede guardar la info
    // concatenada,
    // ejemplo nombre + apellido + edad.

    public void UsuarioEnArray() {
        Scanner obj = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = obj.nextLine();
        System.out.println("ingrese su apellido");
        String apellido = obj.nextLine();
        System.out.println("ingrese su edad");
        int edad = obj.nextInt();
        String[] usuario = { "nombre :" + nombre + " apellido :" + apellido + " edad :" + edad };
        // el sgte paso es innecesario ya que no pide que lo imprima
        System.out.println(Arrays.toString(usuario));
        obj.close();
    }

    public static void main(String[] args) {
        Apepe app = new Apepe();
        app.imprimirDatos_MayoriaEdad(); 
        // app.UsuarioEnArray();

    }

}
