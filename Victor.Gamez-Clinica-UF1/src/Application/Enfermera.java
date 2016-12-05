/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Scanner;

public class Enfermera extends Person {

   

    
    public Enfermera(String nif, String nombre, String apellido)
    {
        super(nif,nombre,apellido);
    }
    /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    */    

    /*
    TODO Mètodes accessors    
    */    
    
    public static Enfermera addNurse() {
        
        Scanner teclado = new Scanner(System.in);
        String nifNurse;
        String nameNurse;
        String lastnameNurse;
        System.out.println("Nif de l'infermer:");
        nifNurse = teclado.next();
        System.out.println("Nom de l'infermer:");;
        nameNurse = teclado.next();
        System.out.println("Cognom de l'infermer:");
        lastnameNurse = teclado.next();        
        return new Enfermera(nifNurse, nameNurse, lastnameNurse);
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou infermer (són les dades que demana el constructor)
    Retorneu: L'infermer creat
    */ 
    }


    @Override
    public void updateElement() {
        
         System.out.println("Introduce el nuevo nombre");
        Scanner nuevo_nombre = new Scanner(System.in);
        System.out.println("Introduce el nuevo apellido");
        Scanner nuevo_apellido = new Scanner(System.in);
        System.out.println("Introduce el nuevo nif");
        Scanner nuevo_nif = new Scanner(System.in);
        super.setNif(nuevo_nif.next());
        super.setName(nuevo_nombre.next());
        super.setLastname(nuevo_apellido.next());
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades de l'infermer per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    }

    @Override
    public void showElement() {
        System.out.println("\nLes dades de l'infermer amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}