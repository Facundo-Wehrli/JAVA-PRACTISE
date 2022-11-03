// Ejercicio 2.
// ¿Cuál es el resultado del siguiente programa?
public class App {
    public static void main(String[] args) {
        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        // revisa si los ambos flag son true
        if (flag1 && flag2) {
            System.out.println("ping!");
        }

        // se fija si flag 1 o flag 2 es true
        if (flag1 || flag2) {
            System.out.println("pong!");
        }
    }

    public static boolean isHoopy(int x) {
        boolean hoopyFlag;
        // se fija si el número es par.
        // el operador de resto va a dividir lo que hay en x por 2 y te va a dar el
        // resto y va a comparar si ese resto es == 0
        // indicando si es par o no
        if (x % 2 == 0) {
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }

    public static boolean isFrabjuous(int x) {
        boolean frabjuousFlag;
        if (x > 0) {
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }
}

/*
 output:
 true
 true
 ping!
 pong!
 */