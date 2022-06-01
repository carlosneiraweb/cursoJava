package Inicializadores;




public class Inicializadores{
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
 
    public Inicializadores() {
        System.out.printf("Valor de a:%1s\nValor de b:%2s\n", a, b);
    }
 
//Inicializador Instancia
    { //2
        b = a * 2;
    }
 
 //Inicializador de clase
    static { //1
        a = 15;
    }   
    
      public static void main(String[] args) {
          Inicializadores ini = new Inicializadores();
         
      }
    
    //Inicializadores 
}
