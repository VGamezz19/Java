/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.victor.gamez;

/**
 *
 * @author victor
 */
public class Estudiante {
    
    private String non;
    private Integer edad;
    private Asignatura[] assignaturas = new Asignatura[10];
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
        
        for (int i = 0; i < numAsignaturas; i++) {
            if (assignaturas[i].getNom().equals(asignatura.getNom())) {
                validacion = false;
                break;
                
                //Si encontramos una asignatura con el mismo nombre, 
                //Validacion tendra el valor de "False"
                //Y el For terminara.
            }
        }
        
        //Despues, segun el valor de Validacion, decido si insertar la asignatura
        //O nviar un mensaje de error al usuario.
        if (validacion != true){
            System.out.println("Error repeticion de asignatura");
        } else {
            
            this.assignaturas[this.numAsignaturas] = asignatura;
            this.numAsignaturas ++;
        }
        
    }
    
    public double calculMitja () {
        double mediaTotal = 0;
        Integer i = 0;
        
        for (i = 0; i < numAsignaturas; i++) {
            mediaTotal = mediaTotal + assignaturas[i].getNota();
        }
        
        return mediaTotal = mediaTotal / i;
    }

    @Override
    public String toString() {
        
        Integer i = 0;  
        String InfoAsignaturas = "";
        
        for (i = 0; i < numAsignaturas; i++) {
            InfoAsignaturas += "\nAsignatura "+ i +"(" +assignaturas[i].getNom() + ") Nota : " + assignaturas[i].getNota() + " || "+ assignaturas[i].getAprovat(assignaturas[i].getNota());
        }
        return "\nEstudiante{" + "non=" + non + ", edad=" + edad + "} " + InfoAsignaturas + "\nCon una media total de: " + this.calculMitja();
    }

 
    
}
