package Excepciones.excepciones;







/**
 *
 * @author carlos
 */
public class Excepciones {



    public static void main(String[] args) {

       Ejercicio ex = new Ejercicio();
       
       
       
        try {
           ex.introducirMayorCero();
        } catch (MisExcepcionesNumericas.numeroCero e) {
            System.out.println(e.getCause());
        }
       
       
       
        
        
        
        
        
        
        
        
        
        
        
    /*
    MiClaseExcepciones exc = new MiClaseExcepciones();    
        
        
        int k = 0;
        k = exc.leerEntero();
        System.out.println("int introducido -> " + k);
        
       
        double a = 0;
        
        a = exc.leerDouble();
        System.out.println("El número que has introducido es "+a);
        */
    }

    
}
