/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Doctor extends Person {

   

    /*
    TODO
    */
    public Doctor(String nif, String name, String lastname) {
        super(nif, name, lastname);
    }


    /*
    TODO
    */
    public static Doctor addDoctor() {
        Scanner teclado = new Scanner(System.in);
        String nifDoctor;
        String nameDoctor;
        String lastnameDoctor;
        System.out.println("Nif del doctor:");
        nifDoctor = teclado.next();
        System.out.println("Nom del doctor:");;
        nameDoctor = teclado.next();
        System.out.println("Cognom del doctor:");
        lastnameDoctor = teclado.next();
        return new Doctor(nifDoctor, nameDoctor,lastnameDoctor);
    }

    /*
    TODO
    */
    public void updateDoctor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif del doctor: " + this.getNif());
        System.out.println("\nEntra el nou nif:");
        this.setNif(teclado.next());
        System.out.println("\nNom del doctor: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        System.out.println("\nCognom del doctor: " + this.getLastname());
        System.out.println("\nEntra el nou cognom:");
        this.setLastname(teclado.next());
    }

    public void showDoctor() {
        System.out.println("\nLes dades del doctor amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
