
package Static;


/**
 *
 * @author carlos
 */


public class InicializacionStatic {
    
    public static void main(String[] args) {
        
        
        
        
        
        CamposEstaticos primera = new CamposEstaticos(5,5);
        CamposEstaticos segundo = new CamposEstaticos(10,10);

        primera.calcularSuma();
        System.out.println("Total sumas "+ CamposEstaticos.devuelvoCont());
        segundo.calcularSuma();
        System.out.println("Total sumas "+ CamposEstaticos.devuelvoCont());

        //CamposEstaticos.cont = 20;
        System.out.println("Total sumas "+ CamposEstaticos.devuelvoCont()); 
    
    }
    
    
    
    
}
