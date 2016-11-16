
package principal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Nurse {

    private String nif;
    private String name;
    private String lastname;

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
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou infermer (són les dades que demana el constructor)
    Retorneu: L'infermer creat
    */ 
    }

    public String getName() {
        return name;
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
    public String getLastname() {
        return lastname;
    }

    public static Nurse addNurse() {
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear un nou infermer (són les dades que demana el constructor)
        Retorneu: L'infermer creat
         */
    }


    public void updateNurse() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades de l'infermer per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    }

    public void showNurse() {
        System.out.println("\nLes dades de l'infermer amb nif " + this.getNif() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nCognom:" + this.getLastname());
    }

}
