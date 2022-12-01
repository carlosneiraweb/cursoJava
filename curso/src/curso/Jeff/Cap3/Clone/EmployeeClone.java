/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.Jeff.Cap3.Clone;

/**
 *
 * @author carlos
 */
  class Date{
            
        int year,month,day;
        Date(int year,int month,int day){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        
        
        
            }
    



public class EmployeeClone implements Cloneable{
    
    
    
    String name;
    int age;
    Date hireDate;
    
        EmployeeClone(String name, int age, Date hireDate){
            this.name = name;
            this.age = age;
            this.hireDate = hireDate;
        }
        
        @Override 
        public Object clone() throws CloneNotSupportedException
        {
            EmployeeClone emp =  (EmployeeClone) super.clone();
            if(hireDate != null)
                emp.hireDate = new Date(hireDate.year, hireDate.month, hireDate.day);
                        
            return emp;            
   
        }
        
        
        public static void main(String[] args) throws CloneNotSupportedException{
            
            EmployeeClone e1 = new EmployeeClone("John",46,new Date(2000,1,20));
            EmployeeClone e2 = (EmployeeClone) e1.clone();
            System.out.println(e1 == e2); //false
            System.out.println(e1.name == e2.name);//true
            System.out.println(e1.hireDate == e2.hireDate);//false
            System.out.println(e2.hireDate.year + " "+e2.hireDate.month+" "+e2.hireDate.day);
            System.out.println(e1.hireDate.year + " "+e1.hireDate.month+" "+e1.hireDate.day);
            e2.name = "fffff";
            e2.hireDate.day = 10;
            e2.hireDate.month = 3;
            e2.hireDate.year = 1900;
            System.out.println(e2.hireDate.year + " "+e2.hireDate.month+" "+e2.hireDate.day);
            System.out.println(e1.hireDate.year + " "+e1.hireDate.month+" "+e1.hireDate.day);
            System.out.println("NOmbre e2 "+e2.name+ " nombre e1 "+e1.name);
        }
        
    
    
    
}
