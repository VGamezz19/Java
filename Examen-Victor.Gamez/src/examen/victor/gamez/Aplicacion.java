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
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion de estudiantes
        Estudiante e1 = new Estudiante ("Victor", 18);
        Estudiante e2 = new Estudiante ("Ivan", 23);
        Estudiante e3 = new Estudiante ("Davida", 24);
        
        
        //Asignar asignaturas a cada estudiante
        //Para Victor
        e1.addAsignatura(new Asignatura("Matematicas", 8));
        e1.addAsignatura(new Asignatura("Castellano", 5));
        e1.addAsignatura(new Asignatura("Catalan", 6));
        e1.addAsignatura(new Asignatura("Ingles", 3));
        
        //Para Ivan
        e2.addAsignatura(new Asignatura("Matematicas", 4));
        e2.addAsignatura(new Asignatura("Castellano", 7));
        e2.addAsignatura(new Asignatura("Catalan", 5));
        e2.addAsignatura(new Asignatura("Ingles", 0));
        
        //Para David
        e3.addAsignatura(new Asignatura("Matematicas", 10));
        e3.addAsignatura(new Asignatura("Castellano", 10));
        e3.addAsignatura(new Asignatura("Catalan", 10));
        e3.addAsignatura(new Asignatura("Ingles", 10));
        
        //Mostrar por pantalla
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        
    }
    
}
