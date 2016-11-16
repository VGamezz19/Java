/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public final class Libro {
    private String nom;
    private Autor autor;
    private double precio;
    private int  cantidad;
    
    public Libro (String nom, Autor autor, double precio, int cantidad){
    this.setNom(nom);
    this.setAutor(autor);
    this.setCantidad(cantidad);
    this.setPrecio(precio);
        
}

    /* START Get*/
    public String getNom() {
        return nom;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    /* FIN Get*/
    
    /* START Set*/

    private void setNom(String nom) {
        this.nom = nom;
    }

    private void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    /* FIN Set*/
    
    /* toString*/
    
    @Override
    public String toString(){
        return "EL autor: " + this.getAutor() +  
                ",  Ha escrito el libro: " + this.getNom() +
                ", Cada unidad cuesta: " + this.getPrecio() +
                " Y tiene un total de: " + this.getCantidad() + 
                 " Unidades";
        
    }
    
    
}
