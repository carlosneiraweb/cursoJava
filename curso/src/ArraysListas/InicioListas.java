/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysListas;

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
       
               myArr.
        
        
        
        
    Person uno = new Person("carlos","neira","sanchez");
    Person dos = new Person("pedro","neira","sanchez");
    Person tres = new Person("ange","neira","sanchez");
    
    ArrayList<Person> ArrayPerson = new ArrayList<>();
    ArrayPerson.add(tres);
    ArrayPerson.add(tres);
    ArrayPerson.add(uno); 
    
    lista.recorrerArrayLista(ArrayPerson);
      
    //lista.cambiarDatos(ArrayPerson, "middd");
    
    ArrayList<String> arr = new ArrayList<>();
    arr.add(uno.getName());
    arr.add(dos.getName());
    arr.add(tres.getName());
    lista.ordenarLista(arr);
     
    
   //fin main     
    }
    
    
    
}
