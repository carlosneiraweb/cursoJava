/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API.Thread;

/**
 *
 * @author carlos
 */
public class ProductorConsumidor {
    
    public static void main(String[] args)
    {
        Shared sa = new Shared();
        new Producer(sa).start();
        new Consumer(sa).start();
    }        
    
}


class Shared{
    
    private char c = '\u0000';
    private boolean writable = true;
    synchronized void setSharedChar(char c){
        
        while(!writable)
            try{
            
                wait();
                  
           }catch(InterruptedException ie){
               
           }
        
        this.c = 'c';
        writable = false;
        notify();
    }
    
    synchronized char getSharedChar(){
        
        while(writable)
            try {
                wait();
        } catch (InterruptedException ie) {
        }
        writable = true;
        notify();
        return c;
    }
    
    
}

class Producer extends Thread{
    
    private Shared sa;
    Producer(Shared sa){
        this.sa = sa;
    }
    @Override
    public void run(){
        
        for(char ch = 'A'; ch <= 'Z'; ch++){
            synchronized(sa){
                sa.setSharedChar(ch);
                System.out.println(ch + " produced by producer");
            }
        }
    }
    
    
}

class Consumer extends Thread{
    
    private Shared sa;
    Consumer(Shared sa){
        this.sa = sa;
    }
    @Override
    public void run(){
        char ch;
        
        do{
            synchronized(sa){
                
                ch = sa.getSharedChar();
                System.out.println(ch + " consumed by consumer");
            }
        }
        
        while(ch != 'Z');
    }
}