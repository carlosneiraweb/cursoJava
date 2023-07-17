/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API.Thread;

/**
 *
 * @author carlos
 * 
 * Explicacion de la sincronizacion<br/>
 * de hilos. Si el metodo withdraw<br/>
 * no usara 'synchronized' los dos hilos<br/>
 * accederian al metodo. <br/>
 * Habria incongruencia.
 */
public class Sincronizacion {
    
    private int balance;
    
    public Sincronizacion(int initialBalance){
        balance = initialBalance;
    } 
    
    public synchronized boolean withdraw(int amount){
        
        try{
            Thread.sleep((int)(Math.random()*200));
        }catch(InterruptedException ie){
            
        }
        
        balance -= amount;
        return true;
    }
    
    public static void main(String[] args){
        
        final Sincronizacion sin = new Sincronizacion(100);
        
        Runnable r = new Runnable(){
            @Override
            public void run() {
                
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++) {
                    System.out.println(name + " withdraw $10: "+ sin.withdraw(10));
                }
            }
            
        };
        
    Thread thHus = new Thread(r);
    thHus.setName("Husband");
    Thread thWif = new Thread(r);
    thWif.setName("Wife");
    thHus.start();
    thWif.start();
        
        
        
    }
    
    
    
    
    
    //fin Sincronizacion
}
