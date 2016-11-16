/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objeto_002;

/**
 *
 * @author User
*/
public class TestCercle {
    
        public static void main (String [] args) {

            /*Definicion de variables Cierculo, Prueva de los TRES constructores */

                    Cercle C1 = new Cercle();
                    Cercle C2 = new Cercle(2);
                    Cercle C3 = new Cercle(5,"Blau");
                    
            System.out.println("el primer element te un color " + C1.getColor());
            System.out.println("el segon element te un color " + C2.getColor());
            System.out.println("el tercer element te un color " + C3.getColor());
            System.out.println("el primer element te una area de  " + C1.calculaArea());
            System.out.println("el segundo element te una area de  " + C2.calculaArea());
            System.out.println("el tercer element te una area de  " + C3.calculaArea());
            
            /*Se puede imprimir implicitamente (va a buscar el toString de la clase, o implicitamente
            que, llamando la clase "C2.toString)s
            */
            
            System.out.println(C1);
            System.out.println(C2.toString());
        }
        
}
