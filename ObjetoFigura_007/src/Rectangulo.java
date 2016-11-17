/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Rectangulo extends Figura{
    
    private int ancho;
    private int costado;
    
    public Rectangulo (){
        super();
        this.ancho = 3;
        this.costado = 4;
    }
    
    public Rectangulo (String color, int ancho, int costado){
        super(color);
        this.ancho = ancho;
        this.costado = costado;
                  
    }

    public int getAncho() {
        return ancho;
    }

    public int getCostado() {
        return costado;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setCostado(int costado) {
        this.costado = costado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Rectangulo{" + "ancho=" + this.ancho + ", costado=" + this.costado + '}';
    }
    
    @Override
    public double CalculaArea(){
        return this.costado * this.ancho;
    }
    
    
    
}
