
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



 
     public boolean isTriangle(int lado1, int lado2, int lado3){
            
    boolean no = false;
    boolean si = true;
            if((lado1+lado2) >lado3){
                return no;
            }
            if((lado2+lado3) >lado1){
                return no;
            }
            if((lado3+lado1) >lado2){
                return no;
            }
            else{
                return si;
            }
     }
     triangle isTriangle = new triangle();

     
  }
