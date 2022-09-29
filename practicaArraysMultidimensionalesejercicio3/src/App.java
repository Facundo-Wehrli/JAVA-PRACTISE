import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     
        /* Crear dos arrays de nxn y sumar sus valores, los resultados se deben almacenar en
otro array. Los valores y la longitud serán insertados por el usuario. Mostrar los arrays
originales y el resultado. */

Scanner obj = new Scanner(System.in);
System.out.println("ingrese la cantidad de filas");
int filas = obj.nextInt();
System.out.println("ingrese la cantidad de columnas");
int columnas = obj.nextInt();

int[][] arr1 = new int [filas][columnas];
int[][] arr2 = new int [filas][columnas];
int[][] total = new int[filas][columnas];

for (int i = 0; i < total.length; i++) {
    for (int j = 0; j < total[i].length; j++) {
        System.out.println("inserte el valor para: + ["+i+":"+j+"] del primer array");
        arr1[i][j] = obj.nextInt();
        System.out.println("inserte el valor para: + ["+i+":"+j+"] del segundo array");
        arr2[i][j] = obj.nextInt();
        total[i][j]+=(arr1[i][j]+arr2[i][j]);
    }
}

System.out.println("primer array:");
for (int i = 0; i < total.length; i++) {
    for (int j = 0; j < total.length; j++) {
        System.out.print(arr1[i][j]+ " ");
    }
    System.out.println();
}

System.out.println("segundo array");
for (int i = 0; i < total.length; i++) {
    for (int j = 0; j < total.length; j++) {
        System.out.print(arr2[i][j]+ " ");
    }
    System.out.println();
}

System.out.println("array resultante");
for (int i = 0; i < total.length; i++) {
    for (int j = 0; j < total.length; j++) {
        System.out.print(total[i][j]+ " ");
    }
    System.out.println();
}



obj.close();
    }
}
