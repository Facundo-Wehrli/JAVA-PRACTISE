
public class triangle {
    // Ejercicio 3.
    // Dado tres palos, podemos o no organizarlos en un triángulo.
    // Por ejemplo, si uno de los palos tiene 12 pulgadas de largo y los otros dos
    // tienen una pulgada de
    // largo, no podrás hacer que los palos cortos se encuentren en el medio. Para
    // cualquiera de las tres
    // longitudes, hay una prueba simple para ver si es posible formar un triángulo:
    // Si cualquiera de las tres longitudes es mayor que la suma de las otras dos,
    // no puede formar un
    // triángulo.
    // Escribir un método llamado isTriangle que tome tres enteros como argumentos y
    // devuelva
    // verdadero o falso, dependiendo de si puede o no formar un triángulo a partir
    // de palos con las longitudes dadas. El objetivo de este ejercicio es usar
    // enunciados condicionales para escribir un
    // método de valor.

    /**
     * If any of the three lengths is greater than the sum of the other two, then
     * you cannot form a
     * triangle.
     * 
     * Otherwise you can.
     * 
     * The sum of the lengths of any two sides of a triangle is always greater than
     * the length of the
     * third side.
     * 
     * This is also known as the triangle inequality
     * 
     * @param palo1 the length of the first side of the triangle
     * @param palo2 3
     * @param palo3 the length of the first side of the triangle
     * @return The method is returning a boolean value.
     */
    // public boolean isTriangle(int palo1, int palo2, int palo3) {
    // if (palo1 > (palo2 + palo3))
    // return false;

    // if (palo2 > (palo1 + palo3))
    // return false;

    // if (palo3 > (palo2 + palo1))
    // return false;

    // return true;

    // }

    public static boolean isTriangle(int palo1, int palo2, int palo3) {
        return (palo1 > 0 && palo2 > 0 && palo3 > 0 && palo1 > palo2 +palo3 && palo2> palo1+ palo3 && palo3 > palo2 + palo1);
    }
}
