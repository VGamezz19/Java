/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author MiguelAngel
 */
public class Doctor {

    private String nif;
    private String name;
    private String lastname;
    /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
     */
    /*
    TODO Mètodes accessors
     */    

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public static Doctor addDoctor() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou doctor (són les dades que demana el constructor)
    Retorneu: El doctor creat
    */ 
    }

    /*
    TODO
    */
    public void updateDoctor() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades del doctor per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    }

    public void showDoctor() {
        System.out.println("\nLes dades del doctor amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
