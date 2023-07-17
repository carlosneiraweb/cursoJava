/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;
import Persona.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author carlos
 */
public class ArrayLista {

    
    public ArrayLista() {
    }
    
    
    /**
     * Metodo que elimina los elementos<br>
     * nulos por Itinerador de una lista.
     * @return 
     */
    
    public ArrayList<Person> EliminoNulosPorItinerador(ArrayList<Person> list){
        
      // Create an iterator from the list
        Iterator<Person> itr = list.iterator();

         
        // Find and remove all null
        while (itr.hasNext()) {
            if (itr.next() == null)
                itr.remove(); // remove nulls
        }
  
        // Return the null
        return list;
            
  
     //fin  EliminoNulosPorItinerador
    }
    
    /**
     * Meotodo que elimina nulos <br>
     * por metodo remove de la Interfaz List
     */
     
    public ArrayList<Person> eliminarNulosRemoveList(ArrayList<Person> list){
        
        while(list.remove(null)){}
        
    return list;    
    }
    
    
    /**
     * Metodo que recorre un arrayList<br>
     * con bucle for Each <br>
     * @param arr 
     * Lista de objeto persona
     */
    public void recorrerArrayListaPersona(ArrayList<Person> arr){
    
        
        arr.forEach(person -> {
           System.out.println( "El nombre de la persona es: "+ person.getName());
        });
    //fin recorrerArrayListaPersona
    }
    
    /**
     * Metodo que recorre una lista de String
     */
    
    public void recorrerListaString(ArrayList<String> li){
        
        Iterator it = li.iterator();
        
        while(it.hasNext()){
           
        System.out.println(it.next());
    }

   
        //fin recorrerListaString
    }
    
    /**
     * Metodo que extrae el segundo elemento de una lista <br>
     * Le cambia el apellido y muextra los datos
     * 
     */
    
    public void cambiarDatos(ArrayList<Person> arr, String newSurname){
     
        Person pe = arr.get(1);
        System.out.println("El apellido actual es: "+ pe.getSurname());
        pe.setSurname(newSurname);
        System.out.println("El nuevo apellido es " +pe.getSurname());
        
    //fin cambiarDatos    
    }
    
    /**
     * Metodo que ordena una lista<br>
     */
    public void ordenarLista(ArrayList<String> arr){
      
        Collections.sort(arr);
        for(String x : arr){
            System.out.println(x + "<br>");
        }
     //ordenarLista   
    }
    
    /**
     * Metodo que inserta todos los elementos <br>
     * de una lista en otra
     */
    public void insertarLista(ArrayList<String> original, ArrayList<String> añadir){
        
     original.addAll(añadir);
     
     
    //fin  insertarLista       
    }
 
    
    /**
     * Metodo que comprueba que un elemento se encuentra en la lista
     * @param lis<br>
     * ArrayList de objetos Person<br>
     * @param p <br>
     * Objecto person<br>
     * @return 
     * Boolean
     */
    
    public Boolean contains(ArrayList<Person> lis, Person p){
        
        return lis.contains(p);
        
    //ffin contains    
    }
    
    
    /**
     * Metodo que recibe una lista sin sincronizar<br>
     * la sincroniza y hace modificaciones sobre ella<br>
     * @param lis <br>
     * Lista de objetos Person
     */
    public void SynchronizedList(ArrayList<Person> lis){
        
    List<Person> lisSinc = Collections.synchronizedList(new ArrayList(lis));
    synchronized(lisSinc){
        Iterator<Person> it = lisSinc.iterator();
        while(it.hasNext()){
            Person p = it.next();
            if(p.getName() == "carlos"){ it.remove();}
            System.out.println("La lista queda asi: "+ lisSinc);
        }
        
    } 
        
    
        
    //fin SynchronizedList    
    }
    
    //fin clase
}
