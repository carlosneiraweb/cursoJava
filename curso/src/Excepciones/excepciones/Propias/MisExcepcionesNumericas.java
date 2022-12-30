
package Excepciones.excepciones.Propias;





/**
 *
 * @author carlos
 */
public class MisExcepcionesNumericas {
   
    public static class altaExcepcion extends Exception{
        
        public altaExcepcion(String msg){
            super(msg);
        }
    }
    
    
    
    public static class numeroCero extends Exception{

    
    private int num;
        public numeroCero(int num) {
            super("El numero introducido es "+num);
            this.num = num;
        }
   
    }
    
    public static class numeroDouble extends Exception{

        public numeroDouble(String message) {
            super(message);
        }
   
    }
    

    
    public static class leerEnteroMayor5 extends Exception {
        
        public leerEnteroMayor5(String message){
            super(message);
        }
    
    }
    
    
    
    public static class leerDouble extends Exception{
        
        public leerDouble(String message){
            super(message);
        }
    }
    
    public static class relanzarException extends Exception{
        private int uno;
        private int dos;
        private Exception bajaExcepcion;
        public relanzarException (int uno, int dos, Exception bajaExcepcion){
        super("Uno de los numeros introducido no es un 0 primer numero "+uno+
                " segundo número "+dos+ " Excepcion devuelta ha pasado "+bajaExcepcion.getMessage());
        this.uno = uno;
        this.dos = dos;
        this.bajaExcepcion = bajaExcepcion;
        }
        
    }
    
   
   
    
    
    
    
    //fin mis excepciones
}
