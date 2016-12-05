/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

import java.util.Scanner;


public class Clinic {

    static private Integer comptaCode = 1; //El proper code a assignar
    private Integer code;
    private String name;
    private String address;
    private Element[] elements = new Element[10];
    private Integer comptaElements = 0;
    private Track[] tracks = new Track[100];
    private Integer comptaTracks = 0;

    public Clinic(String name, String address) {
        this.code = Clinic.getComptaCode();
        setComptaCode();
        this.name = name;
        this.address = address;
    }

    public static Integer getComptaCode() {
        return comptaCode;
    }

    public static void setComptaCode() {
        Clinic.comptaCode++;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Track[] getTracks() {
        return tracks;
    }

    public void setTracks(Track[] tracks) {
        this.tracks = tracks;
    }

    public Integer getComptaTracks() {
        return comptaTracks;
    }

    public void setComptaTracks(Integer comptaTracks) {
        this.comptaTracks = comptaTracks;
    }

    public static Clinic addClinic() {
        Scanner teclado = new Scanner(System.in);
        String nameClinic;
        String addressClinic;
        System.out.println("Nom de la clínica:");
        nameClinic = teclado.next();
        System.out.println("Adreça de la clínica:");
        addressClinic = teclado.next();
        return new Clinic(nameClinic, addressClinic);
    }

    public void updateClinic() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\nNom de la clínica: " + this.getName());
        System.out.println("\nEntra el nou nom:");
        this.setName(teclado.next());
        System.out.println("\nAddreça de la clínica: " + this.getAddress());
        System.out.println("\nEntra la nova adreça:");
        this.setAddress(teclado.next());
    }

    public void showClinic() {
        System.out.println("\nLes dades de la clínica amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("\nAddreça:" + this.getAddress());
    }

    /*
     Doctors
     */
    public void addDoctor() {
        elements[comptaElements] = Doctor.addDoctor();
        comptaElements++;

    }

    /*
     Nurses
     */
    public void addNurse() {
        elements[comptaElements] = Enfermera.addNurse();
        comptaElements++;
    }

    /*
     Patients
     */
    public void addPatient() {
        elements[comptaElements] = Paciente.addPatient();
        comptaElements++;
    }

    /*
     Departments
     */
    public void addDepartment() {
        elements[comptaElements] = Departamento.addDepartment();
        comptaElements++;
    }

    public Integer selectElement(Integer tipusElement) {
        Scanner teclado = new Scanner(System.in);
        Integer laClasse = tipusElement;
        switch (laClasse) {
            case 0:
                System.out.println("\nQuè vols seleccionar?:");
                System.out.println("1. Doctor:");
                System.out.println("2. Infermer/a:");
                System.out.println("3. Pacient:");
                System.out.println("4. Departament:");
                laClasse = teclado.nextInt();
                break;
            case 1:
                System.out.println("Nif del Doctor?:");
                break;
            case 2:
                System.out.println("Nif de l'infermer/a?:");
                break;
            case 3:
                System.out.println("Codi del Pacient?:");
                break;
            case 4:
                System.out.println("Codi del Departament?:");
                break;
        }
        String codiSel = teclado.next();
        Integer indexSel = -1;
        for (int i = 0; i < comptaElements; i++) {
            if (elements[i] instanceof Doctor && laClasse == 1) {
                if (((Doctor) elements[i]).getNif().equals(codiSel)) {
                    indexSel = i;
                    break;
                }
            }
            if (elements[i] instanceof Enfermera && laClasse == 2) {
                if (((Enfermera) elements[i]).getNif().equals(codiSel)) {
                    indexSel = i;
                    break;
                }
            }
            if (elements[i] instanceof Paciente && laClasse == 3) {
                if (((Paciente) elements[i]).getCode().equals(codiSel)) {
                    indexSel = i;
                    break;
                }
            }
            if (elements[i] instanceof Departamento && laClasse == 4) {
                if (((Departamento) elements[i]).getCode().equals(codiSel)) {
                    indexSel = i;
                    break;
                }
            }
        }
        return indexSel;
    }

    public void addElementDepartment(Integer tipusElement) {
        Departamento departmentsel = null;
        Integer indexSelDepartment = this.selectElement(4);
        if (indexSelDepartment >= 0) {
            departmentsel = (Departamento) this.getElements()[indexSelDepartment];
        } else {
            System.out.println("\nNo existeix aquest departament");
        }
        Integer indexSel = this.selectElement(tipusElement);
        if (indexSel >= 0) {
            departmentsel.addDepartment(this.getElements()[indexSel]);
        } else {
            System.out.println("\nNo existeix aquest element");
        }        
    }

    
    public void addTrack() {
        tracks[comptaTracks] = Track.addTrack();
        comptaTracks++;
    }
}
