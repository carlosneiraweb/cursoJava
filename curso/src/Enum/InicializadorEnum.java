/**
 * https://jarroba.com/enum-enumerados-en-java-con-ejemplos/
 */
package Enum;

/**
 *
 * @author carlos
 */
public class InicializadorEnum {
    
    public static void main(String[] args) {
        
       /*
        Precio barato = Precio.BARATO;
        Precio caro = Precio.CARO;
        System.out.println("El precio más barato es "+barato.getPrecioMinimo()+ 
              " el precio más caro de barato es "+barato.getPrecioMaximo());
        System.out.println("Comparamos barato con caro "+ barato.compareTo(caro));
        Precio pre = Precio.valueOf("BARATO");
        System.out.println(
                """ 
                The natural order implemented by this method
                 is the order in which the constants are declared.
                """);
        System.out.println("pre con valueOf "+pre.name()+ " precio barato "+pre.getPrecioMinimo());
        System.out.println("La clase de caro es "+ caro.getClass());
     
        Person pe = new Person("carlos", Equipo.BARÇA);
        System.out.println(pe.toString());
        Person pe2 = new Person();
        
        
        
     
      String pre = precio.toString();
      Precio tmp = Precio.valueOf("BARATO");
      int db =  tmp.getPrecioMaximo() + tmp.getPrecioMinimo();
      System.out.println("Precio "+pre+ " "+db);
      
      System.out.println(precio.ordinal());
      precio.toString();
      
      System.out.println ("un precio " + precio + " esta entre " + 
      precio.getPrecioMinimo() + " y " + precio.getPrecioMaximo());
    
    */
      
      
    
      
      
    
    
        
        Demarcacion delantero = Demarcacion.DELANTERO;
        Demarcacion portero = Demarcacion.PORTERO;
        
        
       
    
            System.out.println("delantero.name()= "+delantero.name());
            System.out.println("delantero.toString()= "+delantero.toString());
            System.out.println("delantero tiene la posición "+delantero.ordinal());
            System.out.println("delantero compare to "+delantero.compareTo(portero));
        
            for(Demarcacion d: Demarcacion.values()){
                System.out.println(d.toString()+" - ");
            }    
            

            
        Equipo eq = Equipo.BARÇA;    
            
        System.out.println("el equipo eq es => "+eq.getNombreClub());  
        System.out.println("El puesto en la liga de eq es "+ eq.getPuestoLiga());            
            
    Futbolista casillas = new Futbolista("Casillas", 1, Demarcacion.PORTERO, Equipo.REAL_MADRID);
    Futbolista capdevila = new Futbolista("Capdevila", 11, Demarcacion.DEFENSA, Equipo.VILLAREAL);
    System.out.println(casillas.toString());
    System.out.println(capdevila.toString());
        
    
    }
}
