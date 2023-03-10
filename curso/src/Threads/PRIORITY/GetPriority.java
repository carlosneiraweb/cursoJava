/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.PRIORITY;

/**
 *
 * @author carlos
 */
public class GetPriority extends Thread{

    public GetPriority(String name) {
        super(name);
    }
    
    public void saludar(){
        
        System.out.println("Dentro de run");
        
    }
    
    @Override
    public void run(){
        
        saludar();
        
        
    }
  
public static void main(String[] args){
    
    GetPriority t1 = new GetPriority("t1");
    GetPriority t2 = new GetPriority("t2");
    GetPriority t3 = new GetPriority("t3");
    
    //t1.run();
    t1.setPriority(2);
    t2.setPriority(5);
    t3.setPriority(8);
    
    System.out.println("Prioridad del hilo "+ t1.getName()+
            " es "+t1.getPriority());
    System.out.println("Prioridad del hilo "+t2.getName()+
            " es "+t2.getPriority());
    System.out.println("Proridad del hilo "+t3.getName()+
            " es "+t3.getPriority());
    
    System.out.println("Hilo actual "+Thread.currentThread().getName());
    System.out.println("Prioridad del hilo Main "+
            Thread.currentThread().getPriority());
    
}    




    
    
    //fin GetPriority

    
}
