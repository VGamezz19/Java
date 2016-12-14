/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.victor.gamez;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author victor
 */
public class Estudiante {
    
    private String non;
    private Integer edad;
    private  List<Asignatura> assignaturas = new ArrayList<Asignatura>();
    private Integer numAsignaturas = 0;


//Constructor

    public Estudiante(String non, Integer edad) {
        this.non = non;
        this.edad = edad;
    }
    
//METODOS GETTERS & SETTERS
    
    public void setNon(String non) {
        this.non = non;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNon() {
        return non;
    }

    public Integer getEdad() {
        return edad;
    }
    
    public void addAsignatura (Asignatura asignatura) {   
        
        boolean validacion = true;
        /*
        for (int i = 0; i < numAsignaturas; i++) {
            if (assignaturas.get(i).equals(asignatura.getNom())) {
                validacion = false;
                break;
                
                //Si encontramos una asignatura con el mismo nombre, 
                //Validacion tendra el valor de "False"
                //Y el For terminara.
            }
        }
        */
        
        boolean repetit = false;
        
             for (Asignatura a: this.assignaturas) {
                 repetit = a.getNom().equalsIgnoreCase(asignatura.getNom());
             }
        
        //Despues, segun el valor de Validacion, decido si insertar la asignatura
        //O nviar un mensaje de error al usuario.
        if (validacion != true){
            System.out.println("Error repeticion de asignatura");
        } else {
            
            this.assignaturas.set(this.numAsignaturas, asignatura);
            this.numAsignaturas ++;
        }
        
    }
    
    public double calculMitja () {
        double mediaTotal = 0;
        Integer i = 0;
        
        for (i = 0; i < numAsignaturas; i++) {
            mediaTotal = mediaTotal + assignaturas.get(i).getNota();
        }
        
        return mediaTotal = mediaTotal / i;
    }

    @Override
    public String toString() {
        
        Integer i = 0;  
        String InfoAsignaturas = "";
        
        for (i = 0; i < numAsignaturas; i++) {
            InfoAsignaturas += "\nAsignatura "+ i +"(" +assignaturas.get(i).getNom() + ") Nota : " + assignaturas.get(i).getNota() + " || "+ assignaturas.get(i).getAprovat(assignaturas.get(i).getNota());
        }
        return "\nEstudiante{" + "non=" + non + ", edad=" + edad + "} " + InfoAsignaturas + "\nCon una media total de: " + this.calculMitja();
    }

 
    
}
