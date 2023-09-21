/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

/**
 *
 * @author carlos
 */
public class Bucles {
    
    
/**
 * For mejorado ideal<br>
 * para recorrer Arrays
 */    
public void forMejorado(){
    
    
    int[] numbers = 
             {1,2,3,4,5,6,7,8,9,10};
         for (int item : numbers) {
             System.out.println("Count is: " + item);
         }
    
    //fin forMejorado
}


/**
 * For con etiqueta<br>
 * Salta al codigo siguiente a la etiqueta.<br>
 * Especial para bucles anidados.
 * 
 */
   
public void forEtiqueta(){

    int bus = 12;
    int k = 0;
    int i = 0;
    boolean b = false;
    
    int[][] array = {
        {32,87,5,1000},
        {6,1036,12,5},
        {622,127,6,955},
        {622,127,6,12}
    };
    //Etiqueta el primer for por lo que
    //al llegar al break hara que no se ejecute más
    search:
        for (  k = 0; k < array.length; k++) {
            
            
            for (i = 0; i < array[k].length; i++) {
              System.out.println(k);
                if(array[k][i] == bus){
                    b = true;
                    
                        break search;
                         
                }
            }
 
        }
    
    if(b){
            System.out.println("Salimos"+k+" "+i);
    }else{
        System.out.println("No lo encontramos");
    }
//forEtiqueta    
}
 


/**
 * Salta la iteracion actual<br>
 * Dejando seguir el bucle<br>
 * de nivel superior.
 */    
public void forContinue(){
    
    String busc = "peter piper picked a " + "peck of pickled peppers";
    int max = busc.length();
    int cont = 0;
    
    
    for (int i = 0; i < max; i++) {
        
        if(busc.charAt(i) != 'p'){
            continue;
            
        }else{
            cont++;
        }
    }

    System.out.println("Total de 'p' "+cont);    
//fin forContinue    
}    
 
/**
 * Continue nos saca del ciclo anidado<br>
 * devolviendonos al principio del ciclo externo.<br>
 * IMPORTANTE no se ejecutara el codigo que halla despues<br>
 * del ciclo interno, en este caso linea 136,137.<br>
 * EL break nos saca por completo de los ciclos<br>
 * ejecutando el siguiente codigo.
 */
public void continueEtiquetado(){
    
    String busc = "Look for a substring in me";
    String sub = "sub";
    boolean find = false;
    
    int max = busc.length() - sub.length();
    //System.out.println("busc "+busc.length()+ " sub "+sub.length()+ " max "+max);
    test:
    
    for (int i = 0; i < max; i++) {
        
        int n = sub.length();
        int j = i;
        int k= 0;
        
            while(n-- != 0){
              
                if(busc.charAt(j++) != sub.charAt(k++)){
                    continue test;
                }
            }
        
        find = true;
        break test;
    }
   
    System.out.println(find ? "Found it ": "Dind't find it");
    
    
    //fin continueEtiquetado
}


/**
 * Switch con carios case <br>
 * para cada opcion.<br>
 * @param int a<br>
 * opcion a comprobar
 */
public void mySwitch(int a){
    
    
    switch(a){
        
        case 1, 2, 3 -> System.out.println("Valor a " +a);
        case 4, 5 -> System.out.println("Valor a "+a);
        case 7 -> System.out.println("Valor a "+a);
        default -> System.out.println("I sorry");    
        
        
        
        
        
        
    }
    
    
    
    
    
    //fin mySwitch
}



    //fin Bucles
}
