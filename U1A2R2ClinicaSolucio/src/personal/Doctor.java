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
public class Doctor extends Person{

//    private String nif;
//    private String name;
//    private String lastname;


    public Doctor(String nif, String name, String lastname) {
        super(nif, name, lastname);
    }

   
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

    

}
