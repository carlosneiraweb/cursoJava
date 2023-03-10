/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API.Thread;

/**
 *
 * @author carlos
 * Al aplivcar volatile al campo<br/>
 * lo hacemos nuclear a cualquier hilo.<br/>
 * Todos comparten ese valor.<br/>
 * No utilizar en maquinas virtuales de 32 bits.
 */
public class volatil {


public static void main (String[]args){
    
    
  class StoppableThread extends Thread{
      
      private volatile boolean stopped = false;
      
      @Override
      public void run(){
          
          while(!stopped)
              System.out.println(Thread.currentThread().getName());
      }
      
      public void stopThread(){
          stopped = true;
      }
      
      
  }  
    
    StoppableThread thd = new StoppableThread();
    thd.setName("1");
    thd.start();
    
    try {
        Thread.sleep(1000);
    } catch (InterruptedException ie) {
    }
    thd.stopThread();
    
    
    
}


//fin volatil    
}
