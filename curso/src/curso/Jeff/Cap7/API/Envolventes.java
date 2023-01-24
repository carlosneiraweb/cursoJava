/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API;
import Persona.Person;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 *
 * @author carlos
 */
public class Envolventes {
    
    public void caracter(){
        
        Character ch = new Character('b');
        System.out.println("Compareto devuelve int comparando numericamente"+ ch.compareTo('c'));
        System.out.println("Boolean equals devuelve true con o no es nulo,"
                + " es de tipo boolean y ambos contienen el mismo valor "
                + ch.equals('c'));
        System.out.println("Metodos estaticos de character ");
        System.out.println("Es digito "+Character.isDigit('l'));
        System.out.println("Es lowerCase "+Character.isLowerCase('A'));
        
        
        //fin caracter
    }
    
    
    public void Boleano(){
        
        Boolean bo = false;
        Boolean bo2 = true;
        System.out.println("Valor de bo "+bo.booleanValue());
        System.out.println(" 0 si son iguales, positivo cuando es true y false \n"+
                " Comparamos dos objetos booleanos " +
                Boolean.compare(bo, bo2));
        //fin booleano
    }
    
    
}     
        
        
     
