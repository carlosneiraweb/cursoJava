/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads.Constructores;

/**
 *
 * @author carlos
 */
public class ImplementarRunnable implements Runnable{
    
    public String nombre;
    public String apellido;

    public ImplementarRunnable(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    @Override
    public void run() {
        boolean x = true;
        while(x){
            
            try {
                
                System.out.println("Nombre : "+this.nombre);
                System.out.println("Apellido : "+this.apellido);
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(100l);
                
            } catch (InterruptedException ie) {
            }
        x = false;    
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
        
    
    
    //fin ImplementarRunnable

}