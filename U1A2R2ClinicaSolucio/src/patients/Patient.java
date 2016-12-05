/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patients;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import principal.Element;

/**
 *
 * @author MiguelAngel
 */
public class Patient implements Element{

    private String code;
    private String name;
    private Date birthdate;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
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
    TODO
    */
    public Patient(String code, String name, Date birthdate) {
        this.code = code;
        this.name = name;
        this.birthdate = birthdate;
    }

    /*
    TODO
    */
    public static Patient addPatient() {
        Scanner teclado = new Scanner(System.in);
        String code;
        String name;
        Date birthdate = null;
        Float pes;
        Float alt;
        System.out.println("Codi del pacient:");
        code = teclado.next();
        System.out.println("Nom del pacient:");
        name = teclado.next();
        System.out.println("Data de naixement del pacient (dd/mm/aaaa):");
        String dateFormat = "dd/MM/yyyy";
        try {
            birthdate = new SimpleDateFormat(dateFormat).parse(teclado.next());
        } catch (Exception e) {
        }
        return new Patient(code, name, birthdate);
    }

    /*
    TODO
    */    
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
    }

    public void showElement() {
        System.out.println("\nLes dades del pacient amb codi " + this.getCode() + " són:");
        System.out.println("\nNom: " + this.getName());
        String dateFormat = "dd/MM/yyyy";
        String dateprint = new SimpleDateFormat(dateFormat).format(this.getBirthdate());
        System.out.println("\nData de naixement: "+ dateprint);
    }
    

}
