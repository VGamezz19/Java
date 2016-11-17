/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto_001;

/**
 *
 * @author User
 */
public class Testestudiantes {
    
    
    public static void main (String [] args){
        
        
        
       Estudiant e1 = new Estudiant();
       Estudiant e2 = new Estudiant ("DAVID");
       Estudiant e3 = new Estudiant ("DAVID", "DAW2");
       
       
        
        System.out.println("El nom de el es " +  e1.getNom());
        System.out.println("El curs de el es " +  e1.getCurs());
        System.out.println("El nom de el es " +  e2.getNom());
        System.out.println("El curs de el es " +  e2.getCurs());
        
        /*Utilizando el metodo toString creada en la clase Estudiant */
        
        System.out.println(e1);
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        
    }
}
