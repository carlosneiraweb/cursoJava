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
public class Main {
    
    
    public static void main(String args[])
    {
       Base base = new Base();
       A a =  base.fun();
       a.saludosA();
       System.out.println(a.A);
       
  
       Derived derived = new Derived();
       B b = derived.fun();
       b.saludosB();
        System.out.println(b.B);
       
    }
    
}
