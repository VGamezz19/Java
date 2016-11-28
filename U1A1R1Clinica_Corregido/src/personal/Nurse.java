
package personal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Nurse {

    private String nif;
    private String name;
    private String lastname;

    /*
    TODO
    */
    public Nurse(String nif, String name, String lastname) {
        this.nif = nif;
        this.name = name;
        this.lastname = lastname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




    /*
    TODO
    */
    public static Nurse addNurse() {
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
        return new Nurse(nifNurse, nameNurse, lastnameNurse);
    }

    /*
    TODO
    */
    public void updateNurse() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNif de l'infermer: " + this.getNif());
        System.out.println("\nEntra el nou nif:");
        this.setNif(teclado.next());
        System.out.println("\nNom de l'infermer: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        System.out.println("\nCognom de l'infermer: " + this.getLastname());
        System.out.println("\nEntra el nou cognom:");
    }

    public void showNurse() {
        System.out.println("\nLes dades de l'infermer amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
