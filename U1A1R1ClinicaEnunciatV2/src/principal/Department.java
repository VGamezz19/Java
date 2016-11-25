/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import principal.Nurse;
import principal.Patient;
import java.util.Scanner;
import principal.Doctor;

/**
 *
 * @author MiguelAngel
 */
public class Department {

    private String code;
    private String name;
    private Doctor[] doctors = new Doctor[10];
    private Integer comptaDoctors = 0;
    private Nurse[] nurses = new Nurse[100];
    private Integer comptaNurses = 0;
    private Patient[] patients = new Patient[20];
    private Integer comptaPatients = 0;
    



    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public void setComptaDoctors(Integer comptaDoctors) {
        this.comptaDoctors = comptaDoctors;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public void setComptaNurses(Integer comptaNurses) {
        this.comptaNurses = comptaNurses;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public void setComptaPatients(Integer comptaPatients) {
        this.comptaPatients = comptaPatients;
    }
    
    
    
    public String getCode() {
        return code;
    

    }

    public String getName() {
        return name;
    }

    public Doctor[] getDoctors() {
        return doctors;
    }

    public Integer getComptaDoctors() {
        return comptaDoctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public Integer getComptaNurses() {
        return comptaNurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

  
    public Integer getComptaPatients() {
        return comptaPatients;
    }

    public Department(String code, String name) {
        this.code = code;
        this.name = name;
        
       /*
    TODO Constructor
    Paràmetres: codi i nom
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
     */
    /*
    TODO Mètodes accessors
     */   
    }
    
    

    public static Department addDepartment() {
        
        Scanner teclado = new Scanner (System.in);
        String code;
        String name;
        System.out.println("codigo del nuevo departamento");
        code=teclado.next();
        System.out.println("nombre del nuevo departamento");
        name= teclado.next();
        
        return new Department(code,name);
        
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear un nou departament (són les dades simples que demana el constructor)
        Retorneu: el departament creat
         */
    }

    
    public void addDoctorDepartment(Doctor doctor) {
        
        this.doctors[this.comptaDoctors] = Doctor.addDoctor(); //si podemos ver el codigo de addDoctor
                                                                //click derecho, navigator, go to source
        this.comptaDoctors ++;
    /*
    TODO 
    Paràmetres: doctor
    Accions:
    - afegeix el doctor del paràmetre a la llista de doctors d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }


    public void addNurseDepartment(Nurse nurse) {
        
        this.nurses[this.comptaNurses] = Nurse.addNurse(); //si podemos ver el codigo de addDoctor
                                                             //click derecho, navigator, go to source
        this.comptaNurses ++;
    /*
    TODO 
    Paràmetres: infermer (nurse)
    Accions:
    - afegeix l'infermer del paràmetre a la llista d'infermers d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }


    public void addPatientDepartment(Patient patient) {
        
         this.patients[this.comptaPatients] = Patient.addPatient(); //si podemos ver el codigo de addDoctor
                                                             //click derecho, navigator, go to source
        this.comptaPatients ++;
    /*
    TODO 
    Paràmetres: pacient (patient)
    Accions:
    - afegeix el pacient del paràmetre a la llista de pacients d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }

    public void showDepartment() {
        System.out.println("\nLes dades del departament amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("Aquest departament està format pels doctors:");
        for (int i = 0; i < this.getComptaDoctors(); i++) {
            this.getDoctors()[i].showDoctor();
        }
        System.out.println("Aquest departament està format pels infermers:");
        for (int i = 0; i < this.getComptaNurses(); i++) {
            this.getNurses()[i].showNurse();
        }
        System.out.println("Aquest departament està format pels pacients:");
        for (int i = 0; i < this.getComptaPatients(); i++) {
            this.getPatients()[i].showPatient();
        }
    }

}
