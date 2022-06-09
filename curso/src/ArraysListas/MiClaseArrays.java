
package ArraysListas;
import java.util.Arrays;
import Persona.Person;
import java.util.Collections;
import java.util.List;



/**
 *
 * @author carlos
 */
public class MiClaseArrays {

    public MiClaseArrays() {
    }

    /**
     * Metodo que recive unb array de String 
     * y muestra sus elementos
     * @param x
     * Elemento a mostrar 
     */
public void mostrarArray(String[] x){
    
    for (String elemento : x) {
        System.out.println(elemento);
        
    }
    
    
    
}    
    
    
/**
 * Metodo que cambia los datos de un array
 */
public String[] modelo = {"seat", "bmw", "opel"};
public String[] modelo2 = {"seat","bmw","opel"};

public String[] cambiarDatos(String item, int posicion){
    
            modelo[posicion] = item;
            
            
    return modelo;
    
}   
    
public int[] inicializarArrays(){
    
    int[] x;
    x = new int[10];
    
    
    
   
    
  return x;  
}   

 /**
  * Metodo que compara dos matrices
  */

public Boolean compare( String[] uno, String[] dos){
    Boolean test;
    
    test = Arrays.equals(uno, dos);
    
    return test;
}




/**
 * Arrays convertidos en lista
 */

public void ArrayToList(){
    
    String[] arr = new String[10];
    arr[0] = "casa";
    arr[2] = "pan";
    
    List<String> lista = Arrays.asList(arr);
    System.out.println(lista);
    
    
 //fin ArrayToList   
}

/**
 * BUsqueda binaria
 * busca un numero en un array.
 * Devuelve numero negativo
 * Si no esta en el array 
 * o la posicion en la que se encuentra<br>
 * Importante <br>
 * Primero hay que ordenar el array con sort
 * @param arreglo <br>
 * Arreglo de integer
 * @param num <br>
 * Numero a buscar
 */

public Integer busquedaBinaria(Integer[] arreglo, Integer num){
    Arrays.sort(arreglo);
    Integer numero = Arrays.binarySearch(arreglo, num);
  
    return numero;
    
}



/**
 * Instancia array bidimensional
 * @return miBidimensional
 */
public String[][] arrayBidimensional(){
    
    String[][]miBidimensional = {{"carlos", "sofa"},{"uno","dos","tres"}};
    
    return miBidimensional;
}
    
/**
 * Metodo que muestra 
 * un array con arrays
 */
public void jugarConArrays(){
    
    String[] a = {"uno", "dos", "tres"};
    String[] b = {"aaa","bbb","ccc"};
    String[] c = {"1111","2222","33333"};
    String[] d = {"xxx","yyyyy","ppppp"};
    String[][] x = new String[2][];
    x[0] = a;
    x[1] = b;
    
    
    //x[2] = c;
   // x[3] = d;
    for(String[] p : x){
        System.out.println("mostramos arrays de arrays");
        System.out.println(p.toString());
    }
    
}

/**
 * CopyOf <br>
 * Metodo que copia los elementos indicadfos de un array
 * y rellena con nulos si es necesario
 * al tamaño señalado <br>
 * Lanza nullpointerException si el array es de objetos
 * y sobrepasamos el tamaño del array
 * 
     * @param arr
     * @param num
     * @return 
 */

public Person[] copyOfTamaño(Person[] arr, int num){
    
    Person[] per = Arrays.copyOf(arr,num);
    

    return per;
}

/**
 * copyOfRange
 * Metodo que copia los elementos
 * de un array desde un punto inicial 
 * tantos elementos como los indicados
 * 
 */    
public void copyOfRange(){
    
    
    char[] miChar = {'c', 'a', 'p'};
    char[] copia = java.util.Arrays.copyOfRange(miChar,0,miChar.length);
    for(char item : copia){
        System.out.println(item);
    }
    
}  

/**
 * Muestra el contenido de un array
 * tipo STring pero solo si no contiene 
 * otros arrays no mostrara su contenido
 */
public void arrayToString(){
    
        String[] miString = new String[2];
        miString[0] = "hola";
        miString[1] = "adios";
        System.out.println(Arrays.toString(miString));
        System.out.println("Creamos array bidimensional");
        String[][] mi2String = new String[2][3];
        mi2String[0][0] = "hola";
        mi2String[0][1] = "adios";
        mi2String[0][2] = "wuaaau";
        mi2String[1][0] = "aaaa";
        mi2String[1][1] = "bbb";
        mi2String[1][2] = "ccccc";
        System.out.println("Mostramos mi2String con Arrays.toString");
        System.out.println(java.util.Arrays.toString(mi2String));
}

/**
 * DeepToString  podemos mostrar arrays bidimensionales
 * como si fueran String. Ojo con los datos primitivos
 */
    
public void deepToString(){
    
    System.out.println("Creamos array bidimensional");
        String[][] mi2String = new String[2][3];
        mi2String[0][0] = "hola";
        mi2String[0][1] = "adios";
        mi2String[0][2] = "wuaaau";
        mi2String[1][0] = "aaaa";
        mi2String[1][1] = "bbb";
        mi2String[1][2] = "cccccc";
    System.out.println("Mostramos array bidimensional con deepToString, "
            + " funciona perfectamente con arrays simples que con dimensionales");
    System.out.println(Arrays.deepToString(mi2String));
    System.out.println("Ejemplo de un array de tipo primitivo");
        Integer[] mi3 = new Integer[5];
        mi3[0] = 0;
        mi3[1] = 1;
        mi3[2] = 2;
        mi3[3] = 3;
        
    System.out.println("Mostramos con array.toString mi3");
    System.out.println(java.util.Arrays.toString(mi3));
    System.out.println("Mostramos con deepToSring");
    System.out.println(java.util.Arrays.deepToString(mi3));
    
}

/**
 * Este metodo compara dos arrays para saber si son iguales.
 * Tambien sobreescribimos el metodo para hacer la comparacion
 * a nuestra necesidad.Y deepEquals
 */
public void functionEquals(){
    
    
    String[] a = new String[]{"uno", "dos"};
    String[] b = {"uno", "dos", "dos"};
    System.out.println("Solo seran iguales si tienen el mismo contenido y tamaño ¿a es igual a b? "+ Arrays.equals(a,b));
    System.out.println("Aplicando equals al primer array "+a.equals(b));
    
    
    String[] array = {"hola", "adios"};
    Person[] uno = {new Person("carlos", "neira", "40", array),
                    new Person("carlos", "neira", "40",array)};
    
    Person[] dos = {new Person("carlos", "neira", "40",array),
                    new Person("carlos", "neira", "40", array)};
    
   System.out.println("Mostramos los dos objetos");
   for (Person x : uno){
       x.mostrarPersona(x);
   }
   
    
    System.out.println("Instanciamos dos arrays de objetos Persona y comparamos sin sobreescribir "
            + " el metodo equals ");
    System.out.println("¿Son iguales?...."+ Arrays.equals(uno, dos));
    
    System.out.println("Veamos el hascode de cada objeto "+
            " uno "+Arrays.hashCode(uno)+ "dos "+Arrays.hashCode(dos));
    
    System.out.println("Como vemos tienen distinto hasCode . "+
             " Son distinto objeto. Pero vamos a sobreescribir el metodo equals  de la clase."+
            "para ver si su contenido es igual.");
    System.out.println("Son iguales "+ Arrays.equals(uno, dos));
    
    
    
}


public void  metodoFill(){
    
    System.out.println("Rellenamos array desde 2º a 5º con una 'h' ");
    char[] miChar = {'a','b','c','d','e','h','i'};
    Arrays.fill(miChar,2,5, 'h');
    System.out.println(miChar);
    
    System.out.println("Vamos a rellenar array bidimensioanl con el número 10");
    int[][] miBid = new int[2][3];
    
        for(int[] row  : miBid){
            java.util.Arrays.fill(row, 10);
        }
        
            System.out.println(Arrays.deepToString(miBid));
    
    System.out.println("Probamos con un array Tridimensional");
    int[][][] mi3Bid = new int[3][4][5];
    
        for(int[][] row : mi3Bid){
            System.out.println(row.length);
            for(int[] rowColum : row){
                Arrays.fill(rowColum, 10);
            }
        }
       
    System.out.println(Arrays.deepToString(mi3Bid));
    
    
//fin metodoFill    
}

/**
 * Metodo que ordena un array
 * 
 */
 public void sortArrays(){
     
     int[] arr = new int[5];
     arr[0] = 1;
     arr[1] = 2;
     arr[2] = 3;
     arr[3] = 0;
     arr[4] = -1;
     
     System.out.println("Vamos a ordenar este array");
     for(int x : arr){
         System.out.print(x);
     }
     
     System.out.println("De mayor a menor");
     Arrays.sort(arr);
     for(int x : arr){
         System.out.print(x);
     }
     System.out.println("");
     System.out.println("Para modificar al revés el tipo de dato no puede ser primitivo");
     Integer [] arrObj = {1,2,3,4,6,-2,4,5};
     Arrays.sort(arrObj, Collections.reverseOrder());
     System.out.println(Arrays.toString(arrObj));
     
 //fin sortArrays    
 }       

//fin Arrays    


    
}
