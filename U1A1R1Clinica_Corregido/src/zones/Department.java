/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zones;

import personal.Nurse;
import patients.Patient;
import java.util.Scanner;
import personal.Doctor;

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

    public Doctor[] getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctor[] doctors) {
        this.doctors = doctors;
    }

    public Nurse[] getNurses() {
        return nurses;
    }

    public void setNurses(Nurse[] nurses) {
        this.nurses = nurses;
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Integer getComptaDoctors() {
        return comptaDoctors;
    }

    public void setComptaDoctors(Integer comptaDoctors) {
        this.comptaDoctors = comptaDoctors;
    }

    public Integer getComptaNurses() {
        return comptaNurses;
    }

    public void setComptaNurses(Integer comptaNurses) {
        this.comptaNurses = comptaNurses;
    }

    public Integer getComptaPatients() {
        return comptaPatients;
    }

    public void setComptaPatients(Integer comptaPatients) {
        this.comptaPatients = comptaPatients;
    }

    /*
    TODO
    */
    public Department(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /*
    TODO
    */
    public static Department addDepartment() {
        Scanner teclado = new Scanner(System.in);
        String codeDepartment;
        String nameDepartment;
        System.out.println("Codi del departament:");
        codeDepartment = teclado.next();
        System.out.println("Nom del departament:");
        nameDepartment = teclado.next();
        return new Department(codeDepartment, nameDepartment);
    }

    /*
    TODO
    */
    public void addDoctorDepartment(Doctor doctor) {
        doctors[comptaDoctors] = doctor;
        comptaDoctors++;
    }

    /*
    TODO
    */
    public void addNurseDepartment(Nurse nurse) {
        nurses[comptaNurses] = nurse;
        comptaNurses++;
    }

    /*
    TODO
    */
    public void addPatientDepartment(Patient patient) {
        patients[comptaPatients] = patient;
        comptaPatients++;
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
