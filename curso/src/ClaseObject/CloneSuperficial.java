/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseObject;


import Persona.Person;

/**
 *
 * @author Carlos
 */
public class CloneSuperficial implements Cloneable{
    
    String name;
    int age;
    Person persona;
    

    public CloneSuperficial(String name, int age, Person pe) {
        this.name = name;
        this.age = age;
        this.persona = pe;
    }

    public CloneSuperficial(String name, int age) {
        this.name = name;
        this.age = age;
    }
    

    public static void main(String[] args) throws CloneNotSupportedException {
         
         
         Person uno = new Person("Carlos", "Neira");
         
         //CLONACION SUPERFICIAL
         //Las propiedades que sean objetos "menos String que es inmutable"
         //Son alteradas Y modificas en cualquier objeto el autentico o el clon
         CloneSuperficial e1 = new CloneSuperficial("John",46,uno);
         
         CloneSuperficial e2 = (CloneSuperficial) e1.clone();
         System.out.print("Son el mismo objeto e1 y e2 =>" ); System.out.println( e1 == e2);//false
         System.out.println("Tienen el mismo nombre ");System.out.println(e1.name == e2.name);//falso
         System.out.println("El nombre de e1 es: "+e1.name+ " y el nombre de e2 es: "+e2.name);
         System.out.println("Modificamos el nombre de e1");
         e1.name = "lola";
         System.out.println("e1 name " +e1.name);
         System.out.println("e2 name "+e2.name);
         System.out.println(e1.name == e2.name);
         
         System.out.print("El nombre del objeto de Person es el mismo ");System.out.println(e1.persona.Name == e2.persona.Name);
         e1.persona.Name = "Pedro";
         System.out.println("Modificamos nombre de persona e1");
         System.out.println(e1.persona.Name);
         System.out.println("Ha cambiado el nombre de persona 2 ??? "+ e2.persona.Name);
         System.out.println("Tienen la misma referencia e1.person.Name e2.personName ");System.out.println(e1.persona.Name == e2.persona.Name);
         
        
         
     }
    
    
}
