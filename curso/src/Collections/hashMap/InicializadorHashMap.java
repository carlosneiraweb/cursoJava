/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author carlos
 */
public class InicializadorHashMap {
    
     public static void main(String[] args) {
    
    ArrayList<String> nombres = new ArrayList<>();
    nombres.add("carlos");
    nombres.add("pedro");
    nombres.add("laura");
    
    ArrayList<Integer> dni = new ArrayList<>();
    dni.add(11111111);
    dni.add(222222222);
    dni.add(33333333);
         
    MyHashMap  p = new MyHashMap("carlos", "neira");
    HashMap x = p.usuarios;
    x.put("uno", "dos");
   // System.out.println(x.values());   
   
   HashMap <String, Integer> primer = new HashMap<>(); 
    
   
   for(int i =0; i < 3; i++){
       primer.put(nombres.get(i), dni.get(i));
   }
   
   
   
   System.out.println(primer.keySet());
   System.out.println(primer.values());
   
   
  /* 
   HashMap<String, String> animals = new HashMap<String, String>();
animals.put("cat", "one");
animals.put("dog", "two");
animals.put("mouse", "one");

// converting HashMap keys into ArrayList
List<String> keyList = new ArrayList<String>(animals.keySet());
System.out.println("Size of Key list from Map: " + keyList.size());

// converting HashMap Values into ArrayList
List<String> valueList = new ArrayList<String>(animals.values());
System.out.println("Size of Value list from Map: " + valueList.size());
   */
   //
    }
    
}
