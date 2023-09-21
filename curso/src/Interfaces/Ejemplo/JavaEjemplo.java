/*
*
*http://dis.um.es/~bmoros/Tutorial/fuentes/java514.java
*
*
**/


package Interfaces.Ejemplo;

/**
 *
 * @author carlos
 */
public class JavaEjemplo {
    
public static void main( String args[] ) {
        System.out.println(
			"Instancia objA de tipo ClaseA, mete datos y los muestra." );
        ClaseA objA = new ClaseA();
        objA.put( 2 );
        objA.show();    
  
        System.out.println("""
                           
                           Asigna objA a la variable de referencia de tipo MiInterfaz llamada objAA.
                           
                           """);
        MiInterfaz objAA = objA;
        System.out.println(
			"Invoca el metodo put() sobre objAA para modificar los datos.");
        objAA.put( 4 );
      
        System.out.println(
			"Invoca el metodo get() sobre objAA para ver los datos modificados.");
        System.out.println("dato objA = " + objAA.get() );
    
        
        
        
        
        
        System.out.println(
            "\nInstancia un objeto de tipo ClaseB llamado objB.\n" +
			"Asigna inmediatamente la refrencia a una variable de referecia " +
			" de tipo MiInterfaz\n en lugar de a una variable de tipo ClaseB" );
        MiInterfaz objB = new ClaseB();
        
        System.out.println(
			"Invoca a su metodo put() para guardar datos." );
        objB.put(11);
        System.out.println(
			"Invoca su metodo get() para visualizar los datos." );
        System.out.println( "dato objB = " + objB.get() );

        
        
        System.out.println(
			"\nAsigna correctamente objA a objB y muestra objB" );
        objB = objA;
        System.out.println( "dato objB = " + objB.get() );

        System.out.println(
			"\nInvoca el metodo put() sobre objAA para modificar sus datos.");
        objAA.put( 16 );    
        System.out.println(
			"Asigna correctamente objAA a objB y muestra objB" );
        objB = objAA;
        System.out.println( "dato objB = " + objB.get() );
    
        System.out.println(
			"\nRestaura a objB su tipo y valor iniciales." );
		// objB ya esta definido como tipo MiInterfaz
        objB = new ClaseB();
        objB.put( 11 );
        System.out.println(
			"Asigna correctamente objB a objAA y muestra objAA" );
        objAA = objB;
        System.out.println( "dato objAA = " + objAA.get() );

        System.out.println(
			"\nIntenta asignar objB a objA y falla porque se necesita " +
			"un \n\"Moldeado especifico que convierta MiInterfaz a ClaseA\"." );
        // objA = objB;   // Comentado para poder ejecutar
    
        System.out.println(
		    "\nIntenta invocar el metodo show() de objAA y falla porque" +
            "\n\"El metodo show() no esta declarado en el " +
			"interfaz MiInterfaz\"." );
        // objAA.show();  // Comentado para poder ejecutar
    
        System.out.println("Fin del programa.");
        }   
    
    
    
    
    //fin JavaEjemplo
}
