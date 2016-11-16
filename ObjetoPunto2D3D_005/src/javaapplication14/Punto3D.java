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
public class Punto3D extends Punto2D {
  
    private int z;
    
    public Punto3D(){
        super();
        this.setZ(0);
    }
    
    public Punto3D(int x, int y, int z){
        super(x,y);
        this.setZ(z);           
    }
    
    //START Getter and Setter
    
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    //FIN Getter nd Setter
    
    @Override
    public String toString(){
        return "Punto 3D [" + super.getX() + ", " + super.getY() + ", " + this.getZ() + "]";
    }
        
    
}
