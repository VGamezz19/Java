/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetopokemons_010;

/**
 *
 * @author User
 * 
 */
abstract public class Pokemon {
    
    private String nombre;

    //constructor 
    public Pokemon(String nombre) {
        this.nombre = nombre;
    }
    
    //Getter and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Tostring
    @Override
    public String toString() {
        return "Pokemon{" + "nombre=" + this.nombre + '}';
    }

    abstract public String ataque();
}