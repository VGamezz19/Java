/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author User
 */

//START Contrsuctor

public class Punto2D {
   private int x = 0; //numero DEFAULT
   private int  y = 0; //numero DEFAULT
   
     public Punto2D() {
        this.setX(0);
        this.setY(0);
    }
     
    public Punto2D(int  x, int y) {
        this.setX(x);
        this.setY(y);
    }
    
   // FIN Constructor
    
    // STRAT Setter and Getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //FIN Setter and Getter
    
    @Override
    public String toString(){
        return "Punto [" + this.getX() + ", " + this.getY() + "]";
    }
}
   
    
