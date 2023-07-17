/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Covariantes;

/**
 *
 * @author carlos
 */

class A {
    public String A = "Soy una propiedad de A";
    void  saludosA(){
        System.out.println("Saludos desde A");
    }
}
class B extends A {
    public String B = "Soy una propiedad de B";
    void saludosB(){
        System.out.println("Saludos desde B accedo a metodos y propiedades de A"); 
        System.out.println("Prueba a eliminar mi extends"); 
    }
}
public class Base {
    
    
    A fun()
    {
        System.out.println("Base fun()");
        return new A();
    }
}
  
class Derived extends Base
{
    @Override
    B fun()
    {
        System.out.println("Derived fun()");
        return new B();
    }  
    
}

