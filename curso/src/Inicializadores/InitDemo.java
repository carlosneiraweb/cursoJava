package Inicializadores;



/**
 *
 * 1º Se asigna  valores default a variables de clase<br>
 * 
 * 2º Se asigna valor determinado en los inicializadores de clase<br>
 * 
 * 3º No se puede acceder a las variables de instancia <br>
 *    antes de la llamada al constructor. <br>
 * 
 * 4º Se llama al constructor, pero antes de ejecutar su codigo<br>
 *    inicializa los inicializadores de clase a default y luego<br>
 *    a valores predeterminados.<br>
 * 
 * 5º Se ejecuta el constructor aunque tenga propiedades de clase
 */


public class InitDemo {

    
    
    static boolean bool1;
    boolean bool2;
    static byte byte1;
    byte byte2;
    static char char1;
    char char2;
    static double double1;
    double double2;
    static float float1;
    float float2;
    static int int1;
    int int2;
    static long long1;
    long long2;
    static short short1;
    short short2;
    static String string1;
    String string2;
    
    
    //Iniciacion de clase
    static{
        System.out.println("Inicializador de clase");
        System.out.println("[class] bool1 = "+ bool1);
        System.out.println("[class] byte1 = "+ byte1);
        System.out.println("[class] char1 = "+ char1);
        System.out.println("[class] double1 = "+ double1);
        System.out.println("[class] float1 = "+ float1);
        System.out.println("[class] int1 = "+ int1);
        System.out.println("[class] long1 = "+ long1);
        System.out.println("[class] short1 = "+ short1);
        System.out.println("[class] string1 = "+ string1);
    }
    
    static{
       bool1 = true;
       byte1 = 127;
       char1 = 'A';
       double1 = 1.0;
       float1 = 2.0F;
       int1 = 10000000;
       long1 = 10000000L;
       short1 = 32676;
       string1 = "abc";
       
       System.out.println("");
       System.out.println("Se muestran variables de clase antes llamar al constructor");
       System.out.println("");
       System.out.println("[class] bool1 = "+ bool1);
       System.out.println("[class] byte1 = "+ byte1);
       System.out.println("[class] char1 = "+ char1);
       System.out.println("[class] double1 = "+ double1);
       System.out.println("[class] float1 = "+ float1);
       System.out.println("[class] int1 = "+ int1);
       System.out.println("[class] long1 = "+ long1);
       System.out.println("[class] short1 = "+ short1);
       System.out.println("[class] string1 = "+ string1);
       System.out.println();
       
    }
    
    
    //Inicializador de instancia
    {
    
        System.out.println("Inicializador de instancia despues de la llamada al constructor");
        System.out.println("Con valores default");
        System.out.println("[instance] bool2 = "+ bool2);
        System.out.println("[instance] byte2 = "+ byte2);
        System.out.println("[instance] char2 = "+ char2);
        System.out.println("[instance] double2 = "+ double2);
        System.out.println("[instance] float2 = "+ float2);
        System.out.println("[instance] int2 = "+ int2);
        System.out.println("[instance] long2 = "+ long2);
        System.out.println("[instance] short2 = "+ short2);
        System.out.println("[instance] string2 = "+ string2); 
    }
    
    
   
   {
      
       bool2 = true;
       byte2 = 127;
       char2 = 'A';
       double2 = 1.0;
       float2 = 2.0F;
       int2 = 10000000;
       long2 = 10000000L;
       short2 = 32676;
       string2 = "abc";
       
       
       System.out.println("");  
       System.out.println("""
                          Se ha asignado valor determinado a variables de instancia
                          Pero no son accesibles antes de la llamada al constructor
                          """);
       System.out.println("Ejemplo bool2 "+bool2);
       System.out.println("");
   }
    
   {
        System.out.println("");
        System.out.println("Constructor InitDemo() called");
        
        System.out.println("");
    }
   
   
   
    public String saludo;
    static String prueba ="Propiedad estatica ";
    
    //constructor
    InitDemo(String x){
        this.saludo = x;
        System.out.println(saludo);
        System.out.println("Desde constructor propiedad static "+prueba);
        System.out.println("");
   }
    
    
    
   

    public static void main(String[] args) {
       
      
       System.out.println("main() started");
       System.out.println();

       for(int i = 0; i < 2; i++){
           System.out.println("About to create InitDemo object "  +i);
           System.out.println("");
           System.out.println("Error al llamar antes del constructor [instance] id.bool2 = id.bool2");
           System.out.println("");
           System.out.println("LLamamos al constructor");
           System.out.println("""
                              Pero antes de ejecutar su codigo inicializa los inicializadores
                              de instancia a default y luego a valores determinados
                              """);
           System.out.println("");
           
           InitDemo id = new InitDemo("Creamos objeto initDemo");
           System.out.println("Id Created");
           System.out.println();
           
        System.out.println("[instance] id.bool2 = "+ id.bool2);
        System.out.println("[instance] id.byte2 = "+ id.byte2);
        System.out.println("[instance] id.char2 = "+ id.char2);
        System.out.println("[instance] id.double2 = "+ id.double2);
        System.out.println("[instance] id.float2 = "+ id.float2);
        System.out.println("[instance] id.int2 = "+ id.int2);
        System.out.println("[instance] id.long2 = "+ id.long2);
        System.out.println("[instance] id.short2 = "+ id.short2);
        System.out.println("[instance] id.string2 = "+ id.string2);

       }
       
       
       
       
       
       
       /*
         
  */     
    }
  


}