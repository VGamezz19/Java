/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestFigura {
    
    public static void main (String [] args){
        
        Medible f1 = new Triangulo( 3,5, "azul");
        Medible f2 = new Rectangulo("amarillo", 6, 8);
        
        System.out.println(f1.toString());
        System.out.println("Triangulo Area: "+ f1.CalculaArea());
        System.out.println(f2.toString());
        System.out.println("Rectangulo Area: "+f2.CalculaArea());


    }
    
}
