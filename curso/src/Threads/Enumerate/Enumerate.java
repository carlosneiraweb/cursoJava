/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.Enumerate;

/**
 *
 * @author carlos
 */
public class Enumerate {
    

public static void main(String[] args){
    
    
   Thread t = Thread.currentThread();
   t.setName("thread actual");
   
    System.out.println("Nombre del thread "+ t);
    
    int count = Thread.activeCount();
    System.out.println("Thread activos = " + count);
    
    Thread th[] = new Thread[count];
    Thread.enumerate(th);
    
    for (int i = 0; i < count; i++) {
        System.out.println(i +" : "+th[i]);
    }
    
    
    
    
    
    
    
}


//fin Enumerate    
}
