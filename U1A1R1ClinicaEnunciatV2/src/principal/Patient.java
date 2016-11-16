/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Patient {

    private String code;
    private String name;
    private Date birthdate;

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

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

    /*
    TODO Constructor
    Paràmetres: String codi, String name, Date birthdate
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */    
    
    /*
    TODO Mètodes accessors    
    */

    public static Patient addPatient() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nou pacient (són les dades que demana el constructor)
    Retorneu: El pacient creat
    */ 
    }

  
    public void updatePatient() {
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades del pacient per consola i modifiqueu la propietat corresponent
        Nota: penseu que estem modificant l'objecte actual ...
    Retorneu: no hi ha retorn
    */
    }

    public void showPatient() {
        System.out.println("\nLes dades del pacient amb codi " + this.getCode() + " són:");
        System.out.println("\nNom: " + this.getName());
        String dateFormat = "dd/MM/yyyy";
        String dateprint = new SimpleDateFormat(dateFormat).format(this.getBirthdate());
        System.out.println("\nData de naixement: "+ dateprint);
    }
    

}
