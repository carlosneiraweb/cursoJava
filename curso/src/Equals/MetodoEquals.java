
package Equals;
import Persona.Person;
import java.util.Objects;

/**
 *
 * @author carlos
 */

public class MetodoEquals {

    public MetodoEquals() {
    }
    
    
    
        //La clase Person  puede tener sobreescrito el metodo equal
        int a = 1;
        int b = 1;
        Integer c = 4;
        Integer d = 4;
        Integer e = 4;
        Integer f = 85;
        
        Person t1 = new Person("a","b","c"); 
        Person t2 = new Person("a","b","c"); 
        Person t3 = t1; 
  
        String s1 = new String("GEEKS"); 
        String s2 = new String("GEEKS"); 
        String uno = "hola";
        String dos = "hola";

        /**
         * Metodo que muestra ejemplos
         */
public void mostrarEjemplos(){
 
    //REVISAR NO ESTE SOBREESCRITO METODO EQUALS EN PERSON
    
    
    //Comparamos contenido con datos primitivos
    //y referencias en caso de objetos sea String o Person
    //En el caso de String sin new funciona como un dato primitivo
    System.out.print("Con datos primitivos == a == b ");
        System.out.println(a == b);
        System.out.print("d == c ");
        System.out.println(Objects.equals(d, c));  
        System.out.print("e == f ");
        System.out.println(e == f);
        System.out.print("Compara string sin crear objeto string uno == dos  ");//Compara contenido
        System.out.println(uno == dos);
        System.out.print("Creamos objetos string y el operador de comparacion == "
                + "\n compara si son el mismo objeto no su contenido s1 == s2 ");
        System.out.println(s1 == s2); //Compara la referencia
        System.out.print("Son el mismo objeto t1 y t3");
        System.out.println( t1 == t3); 
        System.out.print("Son el mismo objeto t1 y t2");
        System.out.println(t1 == t2); 
        System.out.print("El comparador == con objetos primitivos compara el contenido "+
                "\n con objetos compara la referencia.t1.getName() == t2.getName()");
        System.out.println(t1.getName() == t2.getName());
        System.out.println(t1.getName().compareTo(t2.getName()));
   
    
    /*
    //Datos primitivos compara contenido
        //Objetos compara referencia si no se sobre escribe el metodo equals
        //COn objetos String compara contenido
        System.out.print("SOn e == e =>");
        System.out.println( e.equals(f));
        System.out.println("Si no se sobreescribe el metodo en la clase Person equals");
        System.out.println(" funciona igual que == osea compara la referencia");
        System.out.print("Equals compara  si son el mismo objeto t1.equals(t2) => ");
        System.out.println(t1.equals(t2));
        System.out.print("Equals da true por que el contenido es el mismo, solo con clase String s1.equals(s2) => ");
        System.out.println(s1.equals(s2)); 
        System.out.print("t3 equals t1 => ");
        System.out.println(t3.equals(t1)); 
       
        System.out.print("Si no sobrescribimos el metodo equals da false t1.equals(t2) =>");
        System.out.println(t1.equals(t2));
    
        System.out.print("Metodo equals con String sin new compara contenido uno.equals(dos) => ");
        System.out.println(uno.equals(dos));
           
      
    
   
    
        //CompareTo compara cadenas lexicográficamente  
        //si a1 > a2, devuelve un número negativo
        //si a1 < a2, devuelve un número positivo
        //si a1 == a2, devuelve 0

        String str_Sample = "a";
        System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
        str_Sample = "b";
        System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
        str_Sample = "b";
        System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
        
        */
        
      
    
       
     
}
        
        
    
    
    
    
    
    
    
}
