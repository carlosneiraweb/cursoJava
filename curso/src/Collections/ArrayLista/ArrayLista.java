/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.ArrayLista;
import Persona.Person;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author carlos
 */
public class ArrayLista {

    
    public ArrayLista() {
    }
    
    /**
     * Metodo que recorre un arrayList<br>
     * con bucle for Each <br>
     * @param arr 
     * Lista de objeto persona
     */
    public void recorrerArrayLista(ArrayList<Person> arr){
    
    
        arr.forEach(person -> {
            System.out.println("El nombre de la persona es: "+ person.getName());
        });
    //fin recorrerArrayLista
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
     * Metodo que nordena una lista<br>
     */
    public void ordenarLista(ArrayList<String> arr){
      
        Collections.sort(arr);
        for(String x : arr){
            System.out.println(x + "<br>");
        }
     //ordenarLista   
    }
    
}
