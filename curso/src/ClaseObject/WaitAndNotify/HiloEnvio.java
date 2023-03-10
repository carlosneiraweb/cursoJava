/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseObject.WaitAndNotify;

/**
 *
 * @author carlos
 */
public class HiloEnvio extends Thread{
    
   private Bolsa bolsa;
   
   public HiloEnvio(Bolsa bolsa){
       super();
       this.bolsa = bolsa;
   }
           
   @Override
   public void run(){
       
       if(bolsa.estaLlena() != true){
        
        try{
            
        
           synchronized(bolsa){
               bolsa.wait();
           }
           
           
        }catch(Exception ie){
            
        }
           System.out.println("Enviando la bolsa "+bolsa.getSize()+" elementos");
       }
       
   }
    
    
   public Bolsa getBolsa(){
       return bolsa;
   } 
    
    public void setBolsa(Bolsa bolsa){
        this.bolsa = bolsa;
    }
    
    
    
    //fin HiloEnvio
}
