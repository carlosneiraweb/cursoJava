/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones.excepciones.Relanzar;

/**
 *
 * @author carlos
 */
public class RethrowException {
 

   public static void test1() throws Exception {
      System.out.println("The Exception in test1() method");
      throw new Exception("thrown from test1() method");
   }
   
   public static void test2() throws Throwable {
      try {
         test1();
      } catch(Exception e) {
         System.out.println("Inside test2() method");
         throw e.getCause();
      }
   }
   
   /**
    * As we can see, our code just rethrows any exception it catches. 
    * Because of this, we get the original stack trace without any changes.
    * @return boolean
    */
   public boolean relanzarNull(){
       
       String name = null;

        try {
            return name.equals("Joe"); // causes NullPointerException
        } catch (Exception e) {
            // log
            throw e;
        }


   }
   
   
   
   public static void main(String[] args) throws Throwable {
      try {
         test2();
      } catch(Exception e) {
         System.out.println("Caught in main");
      }
    
    
   }
    //fin
}
