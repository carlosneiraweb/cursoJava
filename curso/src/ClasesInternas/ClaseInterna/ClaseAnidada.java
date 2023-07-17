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
    private String claseAnidada = "Saludos";
   
    private class Punto{
    
      
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
    
    
    
//fin Punto   
  }    
    
    /**
     *
     */
    public ClaseAnidada(){
        puntos = new ArrayList<>();
        
        
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


