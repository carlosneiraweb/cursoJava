/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia.EquipoFutbol;

/**
 *
 * @author carlos
 */
public class Masajista extends SeleccionFutbol {
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(  int id, String nombre, String apellidos, int edad,String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    
	
   @Override
   public void entrenamiento() {
      System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
   }

   public void darMasaje() {
      System.out.println("Da un Masaje");
   }
    
    
    
    //fin masajista

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
