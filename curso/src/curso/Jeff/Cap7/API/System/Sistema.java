/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap7.API.System;

import java.io.Console;
import java.util.Arrays;
import java.util.Properties;

/**
 *
 * @author carlos
 */
public class Sistema {

    /**
     * Copiar Arrays
     */
    
public void arrayCopiar(){
    
    String[] a1 = {"Avila","Burgos","León","Palencia","Salamanca", "Segovia","Soria","Valladolid","Zamora"};	   
    String[] a2 = new String[a1.length]; 
    System.arraycopy(a1,0,a2,0,5);
    System.out.println(Arrays.toString(a2));
   
} 

/**
 * Leer entradas por consola
 * 
 */
public void consola(){
    
  Console console = System.console();
        if (console != null)
        {
            // lee toda la línea
            System.out.println("Escribe algo");
            System.out.println(console.readLine());
 
            // obtener el doble
            System.out.println(Double.parseDouble(console.readLine()));
 
            // obtener entero
            System.out.println(Integer.parseInt(console.readLine()));
        }else{
            System.out.println("No se dispone de metodo");
        }
      
//fin consola    
    
}

/**
 * Metodos de clase System
 */
public void metodos(){
    
    System.out.println("Sistema Java.currentTimeMillis()");
    long fecha = System.currentTimeMillis();
    System.out.println(fecha);
    
    
    System.out.println("Java System.exit (estado int)");
    System.out.println("Acaba el programa cualquier número distinto de 0 indica salida no exitosa");
    System.out.println("exit...");
    //System.exit(1);
    
    System.out.println("Sistema Java.gc()");
    System.out.println("Ejecuta el recolector de basura");
    System.gc();
    
    System.out.println("Sistema Java.getenv()");
    System.out.println("Obtiene el valor de la variable de entorno especificada.\n"
            + " Usar comando printenv | less para obtener una lista");
    //System.out.println(System.getenv());
    System.out.println(System.getenv("USERNAME"));
    System.out.println(System.getenv("TEMP"));
    System.out.println(System.getenv("PATH"));

    System.out.println("Sistema Java.getProperties()");
    System.out.println("Lee las propiedades del sistema");
    System.out.println(System.getProperty("user.country"));

    System.out.println("");
    Properties p = System.getProperties();
      //p.list(System.out);
    
      
    System.out.print("time in nanoseconds = ");
    System.out.println(System.nanoTime());  
    
    System.out.println(Runtime.getRuntime().availableProcessors());
    System.out.println(Runtime.getRuntime().freeMemory());
    System.out.println(Runtime.getRuntime().maxMemory());
    
      
      
      
      
    //fin metodos
}









    
    //fin Sistema
}
