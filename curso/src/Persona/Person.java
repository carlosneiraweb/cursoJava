
package Persona;

import java.util.Objects;

/**
 * Clase de ejemplo Persona
 * @author carlos
 */
public class Person {

    public Person(String Name, String Surname, String Age, String[] letras) {
        this.Name = Name;
        this.Surname = Surname;
        this.Age = Age;
        this.Letras = letras;
    }
    
    
    public Person() {
    }
    
    
    public String Name;
    public String Surname;
    public String Age;
    public String[] Letras;

    /**
     * Get the value of Age
     *
     * @return the value of Age
     */
    public String getAge() {
        return Age;
    }

    /**
     * Set the value of Age
     *
     * @param Age new value of Age
     */
    public void setAge(String Age) {
        this.Age = Age;
    }


    /**
     * Get the value of Surname
     *
     * @return the value of Surname
     */
    public String getSurname() {
        return Surname;
    }

    /**
     * Set the value of Surname
     *
     * @param Surname new value of Surname
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }


    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public String[] getLetras() {
        return Letras;
    }

    public void setLetras(String[] Letras) {
        this.Letras = Letras;
    }
    
    
public  void mostrarPersona(Person uno){
    
     System.out.println("Mostramos los objetos");
    
        System.out.println(this.getName());
        System.out.println(this.getSurname());
        System.out.println(this.getAge());
         for(String z : this.getLetras()){
             System.out.println("Primer item "+z);
             
         }
        
    }
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.Name);
        hash = 71 * hash + Objects.hashCode(this.Surname);
        hash = 71 * hash + Objects.hashCode(this.Age);
        return hash;
    }
    
    

    
    @Override
    public boolean equals(Object obj){
        boolean test;
        if(obj == this){
            return true;
        }else{
            test = false;
        }
        if(!(obj instanceof Person )){
            test = false;
            return test;
        }
        Person persona = (Person)obj;
        
        if( (!this.Name.equals(persona.getName()) || !this.Surname.equals(persona.Surname))
                || !this.Age.equals(persona.Age)){
            test = false;
        }else{
            test = true;
        }
        
        
        
        
        return test;
        
        
}
  

//fin Person
}