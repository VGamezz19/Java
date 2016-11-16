/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public final class Autor {
    private String nom;
    private String email;
    private char genero;
 
public Autor (String nom, String email, char genero){
    this.setNom(nom);
    this.setEmail(email);
    this.setGenero(genero);
}

    /* START Get*/
    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public char getGenero() {
        return genero;
    }
    
    /* FIN Get */

    /* START Set */
    private void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private void setGenero(char genero) {
        this.genero = genero;
    }
    
    /* FIN Set */ 
   

    /*toString */   
   @Override
    public String toString () {
        
        return "El nombre del autor: " + this.getNom() + ", email: "
                + this.getEmail() + ", genero: " + this.getGenero();
    }
    
}
