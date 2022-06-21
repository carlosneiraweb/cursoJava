/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.ArrayLista;

import Collections.ArrayLista.ArrayLista;
import Persona.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author carlos
 */
public class InicioListas {
    
    public static void main(String[] args) {
      
        ArrayLista lista = new ArrayLista();
        List myList = new ArrayList();
        ArrayList<String> myArr = new ArrayList<>();
       
              
     //Solo admite datos de tipo objeto
     //no admite datos tipo primitivo
        
        
        
    Person uno = new Person("carlos","neira","sanchez");
    Person dos = new Person("pedro","neira","sanchez");
    Person tres = new Person("ange","neira","sanchez");
    
    ArrayList<Person> ArrayPerson = new ArrayList<>();
    ArrayList<Person> ArrayPerson2 = null;
    ArrayPerson.add(tres);
    ArrayPerson.add(dos);
    ArrayPerson.add(uno); 
    
    /**
     * Eliminamos elementos null de la lista
     */
   // ArrayPerson2 = lista.EliminoNulosPorItinerador(ArrayPerson);
    //ArrayPerson2 = lista.eliminarNulosRemoveList(ArrayPerson);
    //lista.recorrerArrayListaPersona(ArrayPerson2);
      
    
    
    
    
    //lista.cambiarDatos(ArrayPerson, "middd");
    
    ArrayList<String> arr = new ArrayList<>();
    arr.add(uno.getName());
    arr.add(dos.getName());
    arr.add(tres.getName());
   // lista.ordenarLista(arr);
    
    
    
    ArrayList<String> addNuevo = new ArrayList<>();
    addNuevo.add("HOLA");
    addNuevo.add("Adios");
    //lista.insertarLista(arr,addNuevo);
    //lista.recorrerListaString(arr);
   //fin main     
    
    
    System.out.println("La lista contiene el elemento " + lista.contains(ArrayPerson, uno));
    
    
    
            }  
}
