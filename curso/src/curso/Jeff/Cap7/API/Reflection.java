/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API;

import Persona.Person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author carlos
 */
public class Reflection {
    
    public void reflection() throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    try{
            
            Person pe = new Person("carlos","20");
            
            
            System.out.println("Hay 3 formas de obtener la clase");
            Class p = Class.forName("Persona.Person");
            System.out.println(p.getName());
            System.out.println(pe.getClass());
            System.out.println(Person.class);
            System.out.println("Con invoke podemos llamar a los metodos");
            Method[] met = pe.getClass().getMethods();
            String edad = (String)met[5].invoke(pe, null);
            System.out.println("Edad "+ edad);
            System.out.println();
            
            Class<?> clazz = Class.forName("java.lang.Boolean");
            System.out.println("NAME: "+clazz.getName());
            System.out.println("PACKAGE: "+clazz.getPackageName());
            System.out.println("FIELDS");
            Field[] fields = clazz.getDeclaredFields();

                for (int i = 0; i < fields.length; i++) {
                    System.out.println(fields[i]);
                }
            System.out.println("CONSTRUCTOR");
            Constructor[] con = clazz.getDeclaredConstructors();

                for (int i = 0; i < con.length; i++) {
                    System.out.println(con[i]);
            }
            System.out.println("METHODS");
            Method[] me = clazz.getDeclaredMethods();

                for (int i = 0; i < me.length; i++) {
                    System.out.println(me[i]);
            }
        
        }catch(ClassNotFoundException cnfe){
            System.out.println("Podria no localizar clase");
        }        
        
    
    }
    
    
    //fin Reflection
}
