/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;
import Application.Enfermera;
import Application.Paciente;
import java.util.Scanner;
import Application.Doctor;


/**
 *
 * @author MiguelAngel
 */
public class Departamento implements Element {

    private String code;
    private String name;
    private Element[] elements = new Element[100];
    private Integer comptaElements = 0;
  

    
    
    
    public Departamento(String cod, String nam){
        
        this.code = cod;
        this.name = nam;
        
    }
    /*
    TODO Constructor
    Paràmetres: codi i nom
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */   

    
    public String getCode() {
        return code;
    /*

        TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear un nou departament (són les dades simples que demana el constructor)
    Retorneu: el departament creat

    */ 
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    TODO Mètodes accessors
     */
    public String getName() {
        return name;
    }

    public Element[] getElements() {
        return elements;
    }

    public Integer getComptaElements() {
        return comptaElements +1;
    }


    public void setElements(Element[] doctors) {
        this.elements = doctors;
    }

    public void setComptaElements(Integer comptaElements) {
        this.comptaElements = comptaElements;
    }


    public static Departamento addDepartment() {
        
        System.out.println("Escribe el codigo del departamento");
        Scanner codigo = new Scanner(System.in);
        System.out.println("Escribe el nombre del departamento:");
        Scanner nombre = new Scanner(System.in);
        
        Departamento nuevo_dept = new Departamento(codigo.next(),nombre.next());
        
        return nuevo_dept;
        /*
        TODO
        Paràmetres: sense
        Accions:
        - demanar les dades per consola per crear un nou departament (són les dades simples que demana el constructor)
        Retorneu: el departament creat
         */
    }

    @Override
    public void updateElement() {
        
        System.out.println("Introduce el nuevo nombre");
        Scanner nuevo_codigo = new Scanner(System.in);
        System.out.println("Introduce el nuevo apellido");
        Scanner nuevo_nombre = new Scanner(System.in);
        this.setCode(nuevo_codigo.next());
        this.setName(nuevo_nombre.next());
       
        
    }
    
    public void addDoctorDepartment(Doctor doctor) {
        
          this.elements[this.comptaElements] = doctor;
       this.comptaElements++;
        
    /*
    TODO 
    Paràmetres: doctor
    Accions:
    - afegeix el doctor del paràmetre a la llista de doctors d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }


    public void addNurseDepartment(Enfermera nurse) {
          this.elements[this.comptaElements] = nurse;
       this.comptaElements++;
    /*
    TODO 
    Paràmetres: infermer (nurse)
    Accions:
    - afegeix l'infermer del paràmetre a la llista d'infermers d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }


    public void addPatientDepartment(Paciente patient) {
          this.elements[this.comptaElements] = patient;
       this.comptaElements++;
    /*
    TODO 
    Paràmetres: pacient (patient)
    Accions:
    - afegeix el pacient del paràmetre a la llista de pacients d'aquest departament (l'objecte actual)
    Retorneu: no hi ha retorn
    */ 
    }

    @Override
    public void showElement() {
        System.out.println("\nLes dades del departament amb codi " + this.getCode() + " són:");
        System.out.println("\nNom:" + this.getName());
        System.out.println("Aquest departament està format pels doctors:");
        for (int i = 0; i < this.getComptaElements(); i++) {
            this.getElements()[i].showElement();
        }
        System.out.println("Aquest departament està format pels infermers:");
        for (int i = 0; i < this.getComptaElements(); i++) {
            this.getElements()[i].showElement();
        }
        System.out.println("Aquest departament està format pels pacients:");
        for (int i = 0; i < this.getComptaElements(); i++) {
            this.getElements()[i].showElement();
        }
    }

    void addDepartment(Element element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
