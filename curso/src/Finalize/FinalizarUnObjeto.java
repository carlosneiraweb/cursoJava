/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finalize;

/**
 *
 * @author carlos
 */
public class FinalizarUnObjeto {
    
    
   
 public static void main(String[] args) {
   FinalizarUnObjeto fuo = new FinalizarUnObjeto();
   System.out.println(fuo.toString());
   fuo = null;
   System.runFinalization();				
 }

 
 
 protected void finalize() throws Throwable{
   System.out.println("Finalizando el Objeto");
   super.finalize();
 }

    
}
