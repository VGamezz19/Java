/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
 public class Figura {

    // Constructores
    
    private String color;
    
    public Figura () {
        this.color = "rojo";
    }
    
    public Figura(String color){
        this.color = color;
    }
    
    
    // getters y setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
    //
    //    abstract public double CalculaArea();
    //La clase CalculaArea se pasara a Medible
    
    @Override
    public String toString() {
        return "Figura{" + "color=" + color + '}';
    }
    

    
}
