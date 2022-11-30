
package Equals;
import Persona.Person;

/**
 *
 * @author carlos
 */

public class MetodoEquals {

    public MetodoEquals() {
    }
    
    
    
        //La clase Person  puede tener sobreescrito el metodo equal
        int a = 1;
        int b = 2;
        Person t1 = new Person("a","b","c"); 
        Person t2 = new Person("a","b","c"); 
        Person t3 = t1; 
  
        String s1 = new String("GEEKS"); 
        String s2 = new String("GEEKSkkkkk"); 
        String uno = "hola4444";
        String dos = "hola";

        /**
         * Meotod que muestra ejemplos
         */
public void mostrarEjemplos(){
    
    //REVISAR NO ESTE SOBREESCRITO METODO EQUALS EN PERSON
        System.out.println("Si no se sobreescribe el metodo en la clase equals");
        System.out.println(" funciona igual que == osea compara la referencia");
        System.out.print("Equals compara  si son el mismo objeto => ");
        System.out.println(t1.equals(t2));
        System.out.print("Equals da true por que el contenido es el mismo, solo con clase String => ");
        System.out.println(s1.equals(s2)); 
        System.out.print("t3 equals t1 => ");
        System.out.println(t3.equals(t1)); 
       
        System.out.print("Si no sobrescribimos el metodo equals da false =>");
        System.out.println(t1.equals(t2));
    /*
    System.out.print("Con datos primitivos == ");
        System.out.println(a == b);
        System.out.print("Compara string sin crear objeto string ");
        System.out.println(uno == dos);
        System.out.print("Creamos objetos string y el operador de comparacion == compara si son el mismo objeto no su contenido");
        System.out.println(s1 == s2); 
        System.out.print("Son el mismo objeto t1 y t3");
        System.out.println( t1 == t3); 
        System.out.print("Son el mismo objeto t1 y t2");
        System.out.println(t1 == t2); 
        System.out.println("El comparador == con objetos primitivos compara el contenido "+
                " con objetos compara la referencia.");
        System.out.println(t1.getName() == t2.getName());
        System.out.println(t1.getName().compareTo(t2.getName()));
    */

    
    /*
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
