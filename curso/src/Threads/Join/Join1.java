/*
El método join() se utiliza para mantener la ejecución del hilo que se está ejecutando actualmente 
hasta que el hilo especificado esté muerto(ejecución terminada). 
*/
package Threads.Join;

/**
 *
 * @author carlos
 */
public class Join1 extends Thread{
    
    private final String id;
    private int count;
    
    public Join1(String id,int count){
        this.id = id;
        this.count = count;
    }
    
    @Override
    public void run(){
                
        
        do{
            System.out.println(id+" : "+count);
            count--;
            
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ie) {
            }
            
            
        }while(count > 0);
        System.out.println(id+ " end");
        
        
    }    
    
}


class main{
    
    public static void main(String[] args){
        
        try {
            
            Join1 j1 = new Join1("A",3);
            Join1 j2 = new Join1("B",3);
            Join1 j3 = new Join1("C",3);
            
            j1.start();
           
            j2.start();
            j2.join();           //hasta que no acabe j2 no empieza j3
            j3.start();
            
           
          
           
           
            
            
        } catch (InterruptedException e) {
        }
    }
    
    
}