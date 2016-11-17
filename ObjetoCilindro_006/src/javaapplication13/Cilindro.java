/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author User
 */

// START Contrsuctores 
public class Cilindro extends Cercle{
    private double altura;
    
    public Cilindro (){
        super();        //invoca el constructor circulo 
        this.altura = 1.0;
        
    }
    
    public Cilindro (double altura){
        super();
        this.altura = altura;
    }
    
    public Cilindro (double altura, double radi){
        super(radi);
        this.altura = altura;
        
    }
    
    public Cilindro (double altura, double radi, String color){
        super(radi, color);
        this.altura = altura;
          
    }
    
    // FIN Constructores 
    
    
    //START Setters and Getter
    
    
    public void setAltura(double altura){
        
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
    
    // FIN Setters and Getter
    
    
    public double Volum() {
        return super.calculaArea()* this.getAltura();
    }
    @Override
    public double calculaArea(){
        return 2*Math.PI*this.getRadi()*this.altura + 2*super.calculaArea(); 
                                                //Para llamar funciones del padre,
                                                // hay que ponder siempre "Super".
    }
    
    
}
