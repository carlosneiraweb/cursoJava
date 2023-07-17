
package Interfaces;

/**
 *
 * @author carlos
 */
public class Animal implements  Interfaz_1{

    private static int total = 0;
    public Animal( ) {
      incrementar();
    }

    public static void incrementar(){
        
        total++;
        System.out.println("total "+total);
    }
    
    
    /**
     * devuelve la suma de cont
     * @return int
     */
    public static Integer devuelvoTotal(){

        return total;
    }
    
   
    @Override
    public void respirar() {
        System.out.println("Este animal respira por los pulmones");    
    }    

    @Override
    public String comer() {
        String respuesta = "Este animal come por la boca";
    return respuesta;   
    }
    
   
    
}
