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

public class Punto2D implements Movible {
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

 
    public  void arriba(double y) {
        this.y = (int) (this.y +y);
    }


    public void abajo(double y) {
        this.y = (int) (this.y - y);
       
    }

  
    public void derecha(double x) {
       this.x = (int) (this.x + x);
    }

    
    public void izquierda(double x) {
        this.x = (int) (this.x - x);
        
    }

    @Override
    public void arriba() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void abajo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void derecha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void izquierda() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
   
    
