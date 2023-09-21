/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.EquipoFutbol;

/**
 *
 * @author carlos
 */
public class Entrenador extends SeleccionFutbol {
   
    
    private int idFederacion;

    public Entrenador( int id, String nombre, String apellidos, int edad,int idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    
    
    
    
    
   @Override
   public void entrenamiento() {
      System.out.println("Dirige un entrenamiento (Clase Entrenador)");
   }

   @Override
   public void partidoFutbol() {
      System.out.println("Dirige un Partido (Clase Entrenador)");
   }

   public void planificarEntrenamiento() {
      System.out.println("Planificar un Entrenamiento");
   }
    
    
    
    
    
    //fin entrenador
}
