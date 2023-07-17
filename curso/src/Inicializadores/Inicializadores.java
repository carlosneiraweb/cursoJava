package Inicializadores;




public class Inicializadores extends padreINicializadores{
    //Primero se ejecutarán los inicializadores de clase (01), 
    //los de instancia (02) y al final el constructor.
   
/*
 La  variables y referencias  y los inicializadores de instancia 
    solo se inicializan cuando se instancia la clase. 
    Por otro lado, las variables y referencias y los inicializadores estáticos 
    se inicializan aunque se acceda a la clase sin realizar llamadas al constructor.
    Es decir, para inicializar estos últimos no es necesario que la clase se instancie, 
    ya que al ser estáticos no dependen de una instancia de la clase.
    
    Las variables de instancia pueden usar this y super
    Por cada llamada a constructor se instancian

    
    */
    
    static int a; //1
    int b; //2
    public int x;

    public Inicializadores(Integer i) {
        super(i);
        System.out.printf("Desde constructor Inicializadores Valor de a:%1s\n Valor de b:%2s\n", a, b);
    }
 
    
    
    
//    public Inicializadores() {
//        
//    }

//Inicializador Instancia
    { //2
        b = a * 2;
        System.out.println("Iniacializador de Instancia de INicializadores "+ b);
    }
 
 //Inicializador de clase
    static { //1
        a = 15;
        System.out.println("Inicializador de clase desde Inicializadores "+ a);
        
    }   
    
      public static void main(String[] args) {
          
        Inicializadores ini = new Inicializadores(5000);
        System.out.println("Accediendo a un inicializador sin instanciar la clase"+Inicializadores.a); 
          
          
       
   
    }
          
          
          
      
      
    //Inicializadores 
}
