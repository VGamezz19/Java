/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Triangulo implements Figura {
     private Integer altura;
     private Integer base;
     
     public Triangulo (){
        
         this.altura = 1;
         this.base = 2;
         
     }
     
     public Triangulo (Integer altura, Integer base){
         
         this.altura = altura;
         this.base = base;
         
         
     }

    public Integer getAltura() {
        return altura;
    }

    public Integer getBase() {
        return base;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public void setBase(Integer base) {
        this.base = base;
    }
     @Override
    public double CalculaArea(){
        
        return (this.getAltura()* this.getBase()) / 2;
        
    }

    @Override
    public String toString() {
        return super.toString()+ "Triangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
    
  

     
    
}
