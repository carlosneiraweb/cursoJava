package Inicializadores;

/**
 *
 * 1º   Inicializador de clase padre
 * 2º   Inicializador de clase hija
 * 3    Inicializador de instancia clase padre
 * 4º   Constructor clase padre
 * 5º   Inicializador de instancia clase hija
 * 6º   Constructor clase hija
 * 
 */


public class Inicializadores extends padreINicializadores{

    
    static int staticHija;
    static int staticSinInicializar;
    int instaciaHija; //2
    public int x;

    //Integer i
    public Inicializadores(int i) {
        super(i);
        System.out.println("Estamos en el constructor de la clase hija");
        System.out.printf("Desde constructor Inicializadores Valor de staticHija :%1s \n Valor de instaciaHija:%2s\n", staticHija, instaciaHija);
        System.out.println("");
    }
 

//Inicializador Instancia
    { //2
        System.out.println("Valor default de la variable de instancia en clase hija 'instaciaHija' => "+instaciaHija);
        instaciaHija = staticHija * 2;
        System.out.println("Iniacializador de Instancia desde clase hija instaciaHija => "+ instaciaHija);
        System.out.println("Se pueden usar variables de clase en inicializadores de instancia");
        System.out.println("");
    }
 
 //Inicializador de clase
    static { //1
        System.out.println("Valor default de variable staticHija de clase en la clase hija => "+staticHija);
        staticHija = 5;
        System.out.println("Se asigna valor determinado desde clase hija en el inicializador de clase => "+ staticHija);
        System.out.println("");
    }   
    
     
    //Inicializadores 
}
