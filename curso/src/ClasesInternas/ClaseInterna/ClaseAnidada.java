/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesInternas.ClaseInterna;



import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class ClaseAnidada {
 
    private ArrayList<Punto> puntos;
    public String SaludosClaseExterna = "Saludos clase externa";
    private String SaludosPrivate =" Saludos desde clase externa campo private";
    
    private class Punto{
    
      private String SaulosPrivateClaseInterna = "SaulosPrivateClaseInterna";
      private int x,y;
      
        public Punto(int x, int y){
            fijarX(x);
            fijarY(y);
        }

        public void fijarX(int x){
            this.x = x;
        }
        
        public void fijarY(int y){
            this.y = y;
        }
   
    public int retornarCuadrante(){
        if( x > 0 && y > 0 )
            return 1;
        else if ( x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else if (x > 0 && y < 0)
            return 4;
        else 
            return -1;
   
    }
    
    public void SaludosDesdeClaseINternaPrivate(){
        System.out.println(SaulosPrivateClaseInterna);   
    }
    public void SaludoClaseExternaPrivate(){
        System.out.println(SaludosPrivate);
    }
    public void SaludoClaseExterna(){
        System.out.println(SaludosClaseExterna);
    }
    public void SaludosClaseInterna(){
        System.out.println("Saludos desde clase interna");
    }
    
//fin Punto   
  }    
    
    
    public ClaseAnidada(){
        puntos = new ArrayList<Punto>();
        
    }
    
    public void agregarPunto(int x, int y){
        puntos.add(new Punto(x,y));
    }
    
    public int cantidadPuntosCuadrante(int cuadrante){
       int cant = 0;
        for(Punto pun : puntos){
           if (pun.retornarCuadrante() == cuadrante)
               cant++;
        } 
           return cant;
       
    }
 
   
//fin ClaseAnidada    
}


