import java.util.Scanner;
 
public class App {
 
    // Ejercicio Nº 1
    static String[] basedeDatos = new String[3]; // variable global de tipo array de string
 
    public static void alumnos(String nombre, String apellido, int edad, int indicedeArray) { // metodos que recibe
                                                                                              // argumentos
 
        if (verificarEdad(edad)) { // evaluando el valor recibido del metodo verdificar edad
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad ");
        }
        cargarDatos(nombre, apellido, edad, indicedeArray);// llamo a otro metodo que le paso por parametros
        // metodo que envia parametros
 
        basedeDatos[indicedeArray] = nombre + " " + apellido + " " + (edad); // calcular
 
    }
 
    private static void cargarDatos(String nombre, String apellido, int edad, int indicedeArray) {
    }
 
    public static boolean verificarEdad(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
 
    }
 
    public static void mostrarDatos() {
        for (int i = 0; i < basedeDatos.length; i++) {
            System.out.println(basedeDatos[i]);
        }
    }
 
    public static void main(String[] args) throws Exception {
 
        Scanner s = new Scanner(System.in);
        String nombre;
        String apellido;
        int edad;
 
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su nombre ");
            nombre = s.next();
            System.out.println("Ingrese su apellido ");
            apellido = s.next();
            System.out.println("Ingrese su edad");
            edad = s.nextInt();
            alumnos(nombre, apellido, edad, i);
            
        }
 
        mostrarDatos();
        s.close();

        
}
}