/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Doctor extends Person  {

    

    
    public Doctor(String nif, String nombre, String apellido) 
    {
        super(nif,nombre,apellido);
    }
    /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre

    TODO Mètodes accessors    
    */       
    public static Doctor addDoctor() {
        
        
        System.out.println("Escribe el nombre del doctor");
        Scanner nombre = new Scanner(System.in);
        System.out.println("Escribe el apellido del doctor");
        Scanner apellido = new Scanner(System.in);
        System.out.println("Escribe el nif del doctor");
        Scanner nif = new Scanner(System.in);
        
        Doctor nuevo_doctor = new Doctor(nif.next(),nombre.next(),apellido.next());
        
        return nuevo_doctor;

    }

}
