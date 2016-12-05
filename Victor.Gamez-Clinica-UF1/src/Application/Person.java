/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
abstract public class Person implements Element {
    
    private String nif;
    private String name;
    private String lastname;
    
     public Person(String nif, String nombre, String apellido) 
    {
        this.nif = nif;
        this.name = nombre;
        this.lastname = apellido;
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

    public void setNif(String nif) {
        this.nif = nif;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    @Override
    public void updateElement() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif és: " + this.getNif());
        System.out.println("\nEntra el nou nif:");
        this.setNif(teclado.next());
        System.out.println("\nNom és: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        System.out.println("\nCognom és: " + this.getLastname());
        System.out.println("\nEntra el nou cognom:");
        this.setLastname(teclado.next());
    }
    
    @Override
    public void showElement() {
        String laClasse = this.getClass().getSimpleName();
        System.out.println("\nLes dades de "+laClasse+" amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }
}
