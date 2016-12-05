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
import principal.Element;

/**
 *
 * @author MiguelAngel
 */
public class Department implements Element{

    private String code;
    private String name;
    private Element[] elements = new Element[100];
    private Integer comptaElements = 0;

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

     public Element[] getElements() {
        return elements;
    }

    public void setElements(Element[] elements) {
        this.elements = elements;
    }

    public Integer getComptaElements() {
        return comptaElements;
    }

    public void setComptaElements(Integer comptaElements) {
        this.comptaElements = comptaElements;
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

    public void addElementDepartment(Element element) {
        elements[comptaElements] = element;
        comptaElements++;
    }

    public void updateElement() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nCodi del departament és: " + this.getCode());
        System.out.println("\nEntra el nou nif:");
        this.setCode(teclado.next());
        System.out.println("\nNom del departament és: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
    }

    public void showElement() {
        System.out.println("\nLes dades del departament amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("Aquest departament està format pels elements:");
        for (int i = 0; i < this.getComptaElements(); i++) {
            this.getElements()[i].showElement();
        }
    }

}
