
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

    }

    public String getName() {
        return name;
    }


    public String getLastname() {
        return lastname;
    }

    public Nurse(String nif, String name, String lastname) {
        this.nif = nif;
        this.name = name;
        this.lastname = lastname;
        
     /*
    TODO Constructor
    Paràmetres: String nif, String name, String lastname
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
     */
    /*
    TODO Mètodes accessors
     */        
    }
    
    
   
    public static Nurse addNurse() {
        
        
        Scanner teclado = new Scanner (System.in);
        String nif;
        String name;
        String lastname;
        System.out.println("Introduce el NIF del enfermeo");
        nif=teclado.next();
        System.out.println("Introduce el nombre del enfermeo");
        name= teclado.next();
        System.out.println("Introduce el apellido del enfermeo");
        lastname= teclado.next();
        
        return new Nurse(nif, name, lastname);
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear un nou infermer (són les dades que demana el constructor)
        Retorneu: L'infermer creat
         */
    }


    public void updateNurse() {
        
        
      Scanner teclado = new Scanner (System.in);
      String nif;
      String name;
      String lastname;
    
      System.out.println ("\nNif Enferemero: " + this.getNif());
      System.out.println("\nNom del Enferemero: " + this.getName());
      System.out.println("\nApellido del Enferemero: " + this.getLastname());
      
      System.out.println ("Introduzca NIF actualizado");
      nif=teclado.next();
      System.out.println ("Introduzca Nombre actualizado");
      name=teclado.next();
      System.out.println ("Introduzca NIF actualizado");
      lastname=teclado.next();
      
        setNif(nif);
        setName(name);
        setLastname(lastname);
        
      
      System.out.println("\nDoctor Actualizada! " + this.getNif()+ " " + this.getName() + " " + this.getLastname());
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
