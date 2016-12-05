/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Paciente implements Element {

    private String code;
    private String name;
    private Date birthdate;


    
public Paciente(String codigo, String nombre, Date fecha)
{
    this.code = codigo;
    this.name = nombre;
    this.birthdate = fecha;
}

    public Integer getAge() {
        Calendar dob = Calendar.getInstance();
        dob.setTime(birthdate);
        Calendar today = Calendar.getInstance();
        Integer age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }


    public String getCode() {
        return code;
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nou pacient (són les dades que demana el constructor)
    Retorneu: El pacient creat
    */ 
    }

    public String getName() {
        return name;
    }

    /*
    TODO Constructor
    Paràmetres: String codi, String name, Date birthdate
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
     */
    public Date getBirthdate() {
        return birthdate;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    /*
    TODO Mètodes accessors
     */
    public static Paciente addPatient() {
        
        System.out.println("Introduce el codigo del paciente");
        Scanner cod = new Scanner(System.in);
        System.out.println("Introduce el nombre del paciente");
        Scanner nombre = new Scanner(System.in);
        System.out.println("Introduce el año de nacimiento");
        Scanner años = new Scanner(System.in);
         System.out.println("Introduce el mes de nacimiento");
        Scanner meses = new Scanner(System.in);
         System.out.println("Introduce el dia de nacimiento");
        Scanner dias = new Scanner(System.in);
        
        int año = Integer.parseInt(años.next());
        int mes = Integer.parseInt(meses.next());
        int dia = Integer.parseInt(dias.next());
        Date fecha = new Date(año,mes,dia);
        Paciente nuevo = new Paciente(cod.next(),nombre.next(),fecha);
        
        return nuevo;
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear una nou pacient (són les dades que demana el constructor)
        Retorneu: El pacient creat
         */
    }

  
    @Override
    public void updateElement() {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi del pacient: " + this.getCode());
        System.out.println("\nEntra el nou codi:");
        this.setCode(teclado.next());
        System.out.println("\nNom del pacient: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        String dateFormat = "dd/MM/yyyy";
        String dateprint = new SimpleDateFormat(dateFormat).format(this.getBirthdate());
        System.out.println("\nData de naixement del pacient: "+ dateprint);
        System.out.println("\nEntra la nova Data de naixement (dd/mm/aaaa):");
        try {
            this.setBirthdate(new SimpleDateFormat(dateFormat).parse(teclado.next()));
        } catch (Exception e) {
        }
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades del pacient per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    }

    @Override
    public void showElement() {
        System.out.println("\nLes dades del pacient amb codi " + this.getCode() + " són:");
        System.out.println("\nNom: " + this.getName());
        String dateFormat = "dd/MM/yyyy";
        String dateprint = new SimpleDateFormat(dateFormat).format(this.getBirthdate());
        System.out.println("\nData de naixement: "+ dateprint);
    }
    
    

}
