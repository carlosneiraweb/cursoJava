
package Threads.Constructores;



/**
 *
 * @author carlos
 */
public class Constructores implements Runnable{
    
    String name;
    Integer edad;
    Thread t10;
    Thread t2;
    Thread t3;

    public Constructores(Integer edad) {
        this.edad = edad;

    }
    
    
    
    public Constructores( Thread t2) {
        
        this.t2 = t2;
  
    }

    public Constructores(String name) {
        
        this.t2 = new Thread(this,name);
        
    }
    
    
    

    @Override
    public void run() {
        
        System.out.println(t2.getName()+" "+t2.getId());
       
    }
    
    
    
   
    //fin Constructores

}


class Extender extends Thread{

    public Extender(String name) {
        super(name);
    }
    
    
    @Override
    public void run(){
        
        System.out.println("Soy un hilo extendido, mi nombre es: "+this.getName());
 
    }
    
}

class lanzar{
    
    
    public static void main(String[] args){
        
    
        Thread t1 = new Thread(new Constructores(20));
        
        
        Constructores t2 = new Constructores(new Thread());
        
        Constructores t3 = new Constructores("hilo3");
        
        Extender ext = new Extender("extendido");
        
        
        t1.start();
        
        
        
    }
    
    
    
    
    
    
    
    
}