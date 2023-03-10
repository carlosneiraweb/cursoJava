/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.Interrupted;

/**
 *
 * @author carlos
 */
public class Interrupted implements Runnable {

    @Override
    public void run() {
        
        try {
            while(true){
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
        }
    }
    
}

class main{
    
    
    public static void  main(String[] args){
      
        
     Thread t = new Thread(new Interrupted());
        System.out.println("Ejecutando "+t.getName());
        t.start();
        
    Thread t2 = new Thread(new Interrupted());
        System.out.println("Ejecutando "+t2.getName());
    t2.start();
        
       if(!t.isInterrupted())t.interrupt();
        
        try {
            t2.join();
        } catch (InterruptedException ie) {
        }
        
    }
    
    
    
}