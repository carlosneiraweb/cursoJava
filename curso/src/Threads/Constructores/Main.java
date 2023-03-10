/**
 *  El método run es el corazón del subproceso, es donde tiene lugar la acción del subproceso. 
 *  Hay dos modos de proporcionar el el método run a un subproceso:
 *
 *   Derivando una clase de Thread y redefiniendo el método run
 *   Implementando el interface Runnable y definiendo la función run de dicho interface.
 *   La razón de que existan estas dos posibilidades es que en Java no existe la herencia múltiple.
 *   Si una clase deriva de otra no podemos hacer que derive también de Thread. 
 *   Por ejemplo, un applet deriva de la clase base Applet por tanto, ha de implementar el interface Runnable
 *   para que pueda definir el método run.
 */

/**
 * /**
 * http://profesores.elo.utfsm.cl/~agv/elo330/2s10/lectures/Java/threads/JavaThreads.html
 * Una instancia de la subclase es creada con new, luego llamamos al método start() 
 * de la thread para hacer que la máquina virtual Java ejecute el método run(). 
 * Ojo para iniciar la concurrencia invocamos a start(), así invocamos a run() en forma indirecta. 
 * Si invocamos a run() directamente, se comportará como el llamado a cualquier método llamado 
 * dentro de un mismo hilo (sin crear uno independiente)
 */
 
/*
https://stackoverflow.com/questions/27244677/what-is-the-difference-between-thread-join-and-synchronized
*/
package Threads.Constructores;

/**
 *
 * @author carlos
 */



    
public class Main {
  public static void main(String[] args) {
      
   
      Thread primero = new Thread(new ImplementarRunnable("carlos","neira"),"primero");
      Thread segundo = new Thread(new ImplementarRunnable("MANUEL", "GARCIA"));
      primero.start();
      segundo.start();
      
      
      ExtendiendoThreads tercero = new ExtendiendoThreads("LOLA","GARCIA","tercero");
      ExtendiendoThreads cuarto = new ExtendiendoThreads("MANOLO","RUAN","cuarto");
      tercero.start();
      cuarto.start();
      
      
      
      
  }
  
}