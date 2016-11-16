/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objeto_001;

/**
 *
 * @author User
 */
public class Estudiant{
    
   private String nom;
   private String curs;
   
   
   /*INICIO CONSTRUCTORES */
   
    public Estudiant (){
        this.nom = "PENE";
        this.curs = "Prostitucion";       
    }
    
      public Estudiant (String nom){
        this.nom = nom;
        this.curs = "Circo";       
    }
    
        public Estudiant (String nom, String curs){
        this.nom = nom;
        this.curs = curs;       
    }
    /*Fin CONSTRUCTORES */
        
    /*Inicio GET */
        
    public String getNom(){
        return this.nom;
    }
    
    public String getCurs(){
        return this.curs;
    }
    
    /*Fin GET */
    
    /*INICIO SET */
    public void setNom(String nomEntrada){
        this.nom = nomEntrada;
    }
    
    public void setCurso(String nomEntrada){
        this.curs = nomEntrada;
    }
    
    /*FIN SET*/
    
    /*Inicio Aplicaciones */
    
   @Override
    public String toString () {
        
        return "el alumne es-> " +  this.nom + " i cursa -> " + this.curs;
    }

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
