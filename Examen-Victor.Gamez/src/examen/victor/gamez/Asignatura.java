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
public class Asignatura {
    
    private String nom;
    private double nota;

//CONSTRUCTOR
    
    public Asignatura(String nom, double nota) {
        this.nom = nom;
        this.nota = nota;
    }
       
//METODOS GETTERS & SETTERS
    
    public String getNom() {
        return nom;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
// METODOS APLICACION
    
    public String getAprovat (double notaA) {
      String miNota ="";
      
        if (notaA >= 5) {
            miNota = "HAS APROBADO!";
        } else if (notaA < 5){
            miNota = "HAS SUSPENDIDO :( ";
        }
        
        return (miNota);
    }

//toSTRING sobrescrito
    
    @Override
    public String toString() {
        return "Asignatura{" + "nom=" + this.getNom() + ", nota=" + this.getNota()+ '}';
    }   
}
