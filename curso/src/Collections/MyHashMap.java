/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import java.util.HashMap;
import java.util.Map;
import Persona.Person;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author carlos
 */
public class MyHashMap {

    public MyHashMap() {
    }

    
    
    /**
     * Inicializa y devuelve <br>
     * un hashMap con el id <br>
     * Y un objeto persona.<br>
     * @param id <br>
     * Array de ids
     * @param pe <br>
     * Array de objetos Person
     * @return <br>
     * HashMap
     * 
     */

    public HashMap <String, Person> inicializoHashPersona(String[] id, Person[] pe){
        
        
    HashMap<String,Person> inicializo = new HashMap<>();
    
    int v = id.length;
        
        
    for(int i = 0; i < v; i++){
        inicializo.put(id[i], pe[i]);
    }    
        
    return inicializo;
      
    //FIN inicializoHashPersona    
    }
    
    
   /**
    * Metodo que recive un hashMap<br>
    * He imprime su contenido<br>
    * @param has<br>
    * hashMap para mostrar su contenido
    */ 
    public void mostrarHashMap(HashMap<String, Person> has){
    
    System.out.println("Primero lo recorremos con un forEach");
//    has.forEach((clave, value)->{
//     
//        System.out.println("Con id "+ clave + " esta el usuario "+ value.getName() + " que tiene "+
//                value.getAge());
//        
//    });
    
    
    System.out.println("Recorremos ahora con un for" + has.keySet());
//    for(String clave: has.keySet()){
//        System.out.println("Primero la clave "+clave+" y luego el objeto que esta asociado a esa clave");
//        Person p = has.get(clave);
//        System.out.println("Con el id "+clave+ " esta la persona que se llama "+ p.getName()+ 
//                " con "+p.getAge()+ " años.");
//    }
        
 
    System.out.println("Ahora lo recorremos con un iterator ");
    Iterator<String> it = has.keySet().iterator();
    while(it.hasNext()){
        String clave = it.next();
        Person p = has.get(clave);
        System.out.println("El usuario con id "+clave+ " se llama "+
                p.getName()+" su edad es: "+p.getAge());
        
    }

    //fin mostrarHashMap    
    }
   
    /**
     * Metodo que comprueba con containsKey si un clave esta<br>
     * Ademas usa constainsValue para saber si el hash tiene un valor concreto<br>
     * @param has<br>
     * hash tipo String Person<br>
     * @param clave <br>
     * String con la clave a buscar en el hash
     */
    
   public void  contieneKey(HashMap<String, Person> has, String clave ){
       
       System.out.println("Comprobamos que la clave esta "+ has.containsKey(clave));
       
       Person p1 = has.get(clave);
       Person p2 = has.get(clave);
       Person p3 = has.get(clave);
       Person p4 = p1;
       System.out.println("Comprobamos que un valor esta en el has");
       System.out.println("Probamos "+has.containsValue(p3));

   //contieneKey    
   } 
    
    /**
     * Metodo para probar values,Size y Remove<br>
     * @param has <br>
     * hashMap de tipo Person
     */
    public void probarValuesSizeRemove(HashMap<String, Person> has){
        
     System.out.println("El tamaño del hash es: "+ has.size());
     
     //System.out.println("Imprimimos el contenido del has "+ has);
     //System.out.println("El contenido del has con Values "+ has.values());
     //System.out.println("El contenido de has con un iterator: ");
    System.out.println("Si el nombre del usuario es raul o eliminamos con Remove");
 
     Iterator <String> i = has.keySet().iterator();
     while(i.hasNext()){
         String k = i.next();
         Person p = has.get(k);
         System.out.println("EL nombre del usuario es "+ p.getName());
         if(p.getName() == "raul"){i.remove();}
     }


        //fin probarValuesSizeRemove   
    }
    //fin de clase
}
