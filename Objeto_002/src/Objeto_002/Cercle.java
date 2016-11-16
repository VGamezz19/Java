/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto_002;

public class Cercle {
    
       private double radi;
        private String color; 

    /*INICIO CONSTRUCTORES */ 

    public Cercle(){
        radi=1.0;
        color= "vermell";   
    }   

    public Cercle (double radi){
        this.radi = radi;
        color = "vermell";
    }

    public Cercle (double radi, String color){
        this.radi = radi;
        this.color = color;
    }

     /*Fin CONSTRUCTORES */   

    /*INICIO GET */
    
    public double getRadi(){
            return this.radi;
    }
    
    public String getColor(){
        return this.color;
    }

    /* FIN GET */

    /*INICIO SET */
    public void setColor(String colorEntrada){
        this.color = colorEntrada;
    }

    public void setRadi(int radiEntrada){    
        this.radi= radiEntrada;
    }

    /*FIN SET */

    /*INICIO DE APLICACION CALCULO CERCLE */

    public double calculaArea(){
       return this.getRadi()* this.getRadi()* Math.PI;
    }
    
       @Override
       
    public String toString () { 
        return "Cercle de radi-> " +  this.radi + " i color -> " + this.color;
    }

}

