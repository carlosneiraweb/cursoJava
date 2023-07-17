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
public class ExtendiendoThreads extends Thread{
    
    String nombre;
    String apellido;
    

    public ExtendiendoThreads(String nombre, String apellido, String name) {
        super(name);
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
    
    
    @Override
    public void run() {
        //super.run(); //To change body of generated methods, choose Tools | Templates.
       
       boolean x = true;
       
        try {
            
            while(x){
           
                System.out.println("Nombre : "+this.nombre);
                System.out.println("Apellido : "+this.apellido);
                System.out.println("Nombre del hilo "+Thread.currentThread().getName());
                Thread.sleep(100l);

                x = false;
                
            }
        } catch (InterruptedException ie) {
        }
    }
    
    
    ////fin ExtendiendoThreads

}
