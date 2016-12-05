
package personal;

import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Nurse extends Person{

//    private String nif;
//    private String name;
//    private String lastname;

    /*
    TODO
    */
    public Nurse(String nif, String name, String lastname) {
        super(nif, name, lastname);
    }

    

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

   

}
