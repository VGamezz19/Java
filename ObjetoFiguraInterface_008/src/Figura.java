/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
abstract interface Figura {
    
        /*
    !!
    Si toda la clase fuera con metodos abstractos
    no tendriamos que poner Abstract public class
    Pero si utilizamos algun metodo publico, ya no seria 
    una interfaz y nos saltaria error.
    public interface class Figura {
    Para llamar la interface en las otras figuras, tendriams
    que poner public class Triangulo implements Figura {
    !!
    
    Los nombres de interfaces normalmente terminana en -able,
    como un adjetivo. (codigo de programadores para entendernos)
    */

    
    abstract public double CalculaArea();
    
}
