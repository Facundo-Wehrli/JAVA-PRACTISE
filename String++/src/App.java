
public class App {
    public static void main(String[] args) throws Exception {
    
   /*  TODO    Strings en Java 
Toda cadena en una aplicación de Java es una instancia de la clase String. Más precisamente, hay una 
sola instancia de la clase String, que contiene todas las cadenas de la aplicación. Esto se llama patrón
singleton .	 
En ingeniería de software, singleton o instancia única es un patrón de diseño que permite restringir la creación de objetos pertenecientes a una clase o el valor de un tipo a un único objeto.
 */
/* TODO String Literals  
Un literal de cadena consta de cero o más caracteres entre comillas dobles. 
 */

/*TODO Clase String 

La clase String representa cadenas de caracteres. Todos los literales de cadena en los programas Java, como "abc", se implementan como instancias de esta clase. 
Las cadenas son constantes; sus valores no se pueden cambiar después de crearlos. Los búferes de cadenas admiten cadenas mutables. Debido a que los objetos String son inmutables, se pueden compartir. Por ejemplo: 
String str = "abc"; 
Es equivalente a: 
     char data[] = {'a', 'b', 'c'}; 
     String str = new String(data); 
 Algunos ejemplos más de cómo se pueden usar las cadenas: 
     System.out.println("abc"); 
     String cde = "cde"; 
     System.out.println("abc" + cde); 
     String c = "abc".substring(2,3); 
     String d = cde.substring(1, 2);
      
     La clase String incluye métodos para examinar caracteres individuales de la secuencia, comparar cadenas, buscar cadenas, extraer subcadenas y crear una copia de una cadena con todos los caracteres traducidos a mayúsculas o minúsculas. El mapeo de casos se basa en la versión estándar de Unicode especificada por la clase Character. 

El lenguaje Java proporciona soporte especial para el operador de concatenación de cadenas (+) y para la conversión de otros objetos a cadenas. 
A menos que se indique lo contrario, pasar un argumento null a un constructor o método en esta clase hará que se arroje un NullPointerException. 
Un String representa una cadena en formato UTF-16 (https://en.wikipedia.org/wiki/UTF-16) en la que los caracteres complementarios se representan mediante pares sustitutos (ver Representaciones de caracteres Unicode en la clase Character para obtener más información). Los valores de índice se refieren a unidades de código char, por lo que un carácter complementario utiliza dos posiciones en un archivo String. 

La clase String clase proporciona métodos para tratar con puntos de código Unicode (es decir, caracteres), además de aquellos para tratar con unidades de código Unicode (es decir, valores char). 
A menos que se indique lo contrario, los métodos para comparar cadenas no tienen en cuenta la configuración regional. La clase Collator proporciona métodos para una comparación de cadenas más detallada y sensible a la configuración regional. 
 */
/* TODO En Java, los String son objetos. 
  Por ejemplo, en la declaración: 
System.out.println("En Java, los String son objetos"); 
El String “En Java, los String son objetos”. automáticamente se convierte en un objeto String por Java.
anteriores. 
Se puede construir un String igual que se construye cualquier otro tipo de objeto: utilizando new y llamando al constructor String. Por ejemplo: 
String str = new String("Hola"); 
Esto crea un objeto String llamado str que contiene la cadena de caracteres “Hola”. También puedes construir una String desde otro String. Por ejemplo: 
String str = new String("Hola"); 
String str2 = new String(str); 
Después de que esta secuencia se ejecuta, str2 también contendrá la cadena de caracteres “Hola”. 
  */
 
  /* TODO Métodos de la clase String */
System.out.println(".length()");
 //length(): Devuelve la cantidad de caracteres del String con un número entero.
int salid ="Javadesdecero.es".length();
System.out.println(salid);
//retorna 16 

System.out.println();

System.out.println(".chatAt()"); 
// charAt(int índice)   devuelve el caracter del índice que coloques empezando por 0.
System.out.println("Javadesdecero.es".charAt(3)); 
// retorna 'a' 

System.out.println();

System.out.println(".substring()");
//susbtring(int ndice) retorna lo que sigue desde el índice hacia adelante incluyendoló. es decir terminará retorando una subcadena.
System.out.println("Javadesdecero.es".substring(4));
 // retorna desdecero.es 
 
 System.out.println();

 System.out.println(".substring(i, j)");
//substring(int i, int j) Devuelve la subcadena del índice i a j-1. es decir, incluye i y exluye j
System.out.println("Javadesdecero.es".substring(4,9));
 // retorna desde 

System.out.println();

System.out.println(".concat()");
 //concat(str) concatena una cadena especificada al final de la primera.
String s1 = "Java"; 
String s2 = "desdeCero"; 
String salida = s1.concat(s2); 
System.out.println(salida);
// retorna "JavadesdeCero" 

System.out.println();

System.out.println(".indexOf()");
//indexOf(String i) Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada. 
String s = "Java desde Cero"; 
int salidaa = s.indexOf("Cero"); 
System.out.println(salidaa);
// retorna 11 

System.out.println();

System.out.println("indexOf(ch :,fromIndex: )");
//indexOf(String s, int i) Devuelve el índice dentro de la cadena de la primera aparición de la cadena especificada, comenzando en el índice especificado. 
String st = "Java desde Cero"; 
//te dice en que índice aparece la primer cadena específicada desde el índice especificado
 int salidas = st.indexOf('e',7);
 System.out.println(salidas);
 //retorna 9 ya que en el 6 está la primera "e" pero como ponemos fromIndex 7 no cuenta la primera "e".

 System.out.println();

System.out.println("lastIndexOf(ch: )");
 //lastIndexOf (int ch): Devuelve el índice dentro de la cadena de la última aparición de la cadena especificada
String str = "Java desde Cero"; 
int saalida = str.lastIndexOf('e');
System.out.println(saalida);
 // retorna 12

 System.out.println();

System.out.println(".equals(anObject: object)");
 //equals (Objeto otroObjeto): Compara este String con el objeto especificado. 
 Boolean salidA = "Java".equals("Java");
 System.out.println(salidA);
  // retorna true 
 Boolean salidA2 = "Java".equals("java");
 System.out.println(salidA2);
  // retorna false  porque la j del primer objeto es  con mayúsculas

  System.out.println();

  System.out.println("String.equalsIgnoreCase(anotherString)");
//equalsIgnorecase(String otro String) compara cadenas ignorando las mayúsculas y minúsculas
Boolean salida1= "Java".equalsIgnoreCase("Java"); 
System.out.println(salida1);
// retorna true 
 Boolean salida2 = "Java".equalsIgnoreCase("java");
 System.out.println(salida2); 
 // retorna true 

System.out.println();

System.out.println(".compareTo(anotherString: )");
//.compareTo() se utiliza para saber si una cadena es menor mayor o igual a otra comparando su lexicografía
//la comparación se hace de forma alfabética
//retorna cero si las dos cadenas son iguales
//un valor mayor que 0 si son diferentes
String palabra1 = "HOLA";
String palabra2 = "Hola";
int num = palabra1.compareTo(palabra2);
if (num<0)
{
    System.out.println("palabra 1 es menor que palabra2");
}else if (num>0){  
    System.out.println("palabra 1 es mayor que palabra2");
}
else 
System.out.println("son palabras iguales ");
//retorna un número distinto de cero ya que no son iguales
// en resumen, que si no da cero son distintas, siempre teniendo en cuenta el uso de mayúsculas y minúsculas

System.out.println();

System.out.println(".compareToIgnorecase(anotherString: )");
// funciona exactamente igual que el compareTo pero ignorando las mayúsculas y minúsculas
String palabra3 = "HOLA";
String palabra4 = "Hola";
System.out.println(palabra3.compareToIgnoreCase(palabra4));
//retorna cero al ser iguales ignorando mayúsculas y minúsculas

System.out.println();

System.out.println(".toLowerCase(:CADENA)");
//.toLowerCase(String) cómo dice el propio método pasa la cadena a minúsculas
String cadena = "CADENA";
System.out.println(cadena.toLowerCase());

System.out.println();

System.out.println(".toUpperCase(:cadena)");
//.toUpperCase(String) cómo dice el propio método pasa la cadena a mayúsculas
String cadenita = "cadena";
System.out.println(cadenita.toUpperCase());

System.out.println();

System.out.println(".trim(  hola como estas    )");
//.trim(String) retorna una copia de una cadena eliminando los espacios en blanco que hay en ambos extremos
String Cadena = "  hola como estas   ";
System.out.println(Cadena.trim());

System.out.println();

System.out.println(".replace(char:oldChar, char:newChar)");
//.replace(caracterviejo, nuevo caracter) en el primer parámetro va el caracter a cambiar y en el segundo el nuevo que lo reemplazará, ejemplo:
String estrin = "yavadesdecero"; 
//reemplazo la y con la j 
 
 System.out.println(estrin.replace('y' ,'j'));
 //retorna javadesdecero 

 System.out.println();

 System.out.println("\"Arrays de Strings\"  \n");
/* TODO Arrays de Strings 
 Al igual que cualquier otro tipo de datos, los String se pueden ensamblar en arrays. Por ejemplo: 
  */

  String strin[]={"Java", "desde","Cero"};       
    System.out.println("Array Original: ");   
    for (String sst : strin) 
  System.out.print(sst+ ""); 
System.out.println("\n");     
// retorna JavadesdeCero  
//Cambiando un String      
     strin[1]="Curso";   
     strin[2]="Online"; 
System.out.println("Array Modificado: "); 
    for (String sst : strin) 
System.out.print(sst+ ""); 
System.out.println("\n"); 
//retorna JavaCursoOnline


/*TODO Los String son inmutables 
El contenido de un objeto String es inmutable. Es decir, una vez creada, la secuencia de caracteres que compone la cadena no se puede modificar. Esta restricción permite a Java implementar cadenas de manera más eficiente. Aunque esto probablemente suene como un serio inconveniente, no lo es. 
Cuando necesite una cadena que sea una variación de una que ya existe, simplemente cree una nueva cadena que contenga los cambios deseados. Como los objetos String no utilizados se recolectan de forma automática, ni siquiera tiene que preocuparse por lo que sucede con las cadenas descartadas. Sin embargo, debe quedar claro que las variables de referencia de cadena pueden, por supuesto, cambiar el objeto al que hacen referencia. Es solo que el contenido de un objeto String específico no se puede cambiar después de haber sido creado. 
Para comprender completamente por qué las cadenas inmutables no son un obstáculo, utilizaremos otro de los métodos de String: substring(). El método substring() devuelve una nueva cadena que contiene una parte especificada de la cadena invocadora. Como se fabrica un nuevo objeto String que contiene la subcadena, la cadena original no se altera y la regla de inmutabilidad permanece intacta.
*/
String estr="Java desde Cero"; 
//Construyendo un substring 
 String substr=estr.substring(5,15); 
 System.out.println("str: "+estr); 
 System.out.println("substr: "+substr); 
//retorna
 //str: Java desde Cero
  //substr: desde Cero 


/*TODO información resaltada por GUSTAVO 
  Las instancias de la clase String representan secuencias de puntos de código Unicode. Un objeto String tiene un valor constante (invariable). Los literales de cadena son referencias a instancias de la clase String. El operador de concatenación de cadenas + ) crea implícitamente un nuevo objeto String cuando el resultado no es una expresión constante.
   La codificación que nominalmente es Unicode, termina siendo UTF-8 a todos los efectos prácticos.

    *La codificación por defecto en Windows 10 es UTF-16.

   * En situaciones que requieran escribir caracteres en lugar de bytes no se debe usar la clase PrintStream, sino la clase PrintWriter.  
   
 */

/*TODO Objeto JSON 
Un objeto JSON es un texto plano, que tiene una lista de pares de la forma "propiedad":valor, separados por comas, y encerrados entre dos llaves {}. O sea: 
{"propiedad1":valor1, "propiedad2":valor2, "propiedad3":valor3, …} 
El nombre de la propiedad siempre va entre dos comillas dobles. Por ejemplo: "apellido". 
Si el valor de la propiedad es una cadena, se pone la cadena encerrada entre dos comillas dobles. Por ejemplo: "nombre":"José". 
Si el valor de la propiedad es un objeto JSON, se pone ese objeto JSON, encerrado entre sus dos llaves correspondientes. Por ejemplo: "empleado":{"nombre":"José", "apellido":"Pérez"}. 

 */


    } 
}
