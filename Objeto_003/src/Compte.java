/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Compte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CompteBanc c1 = new CompteBanc();
        CompteBanc c2 = new CompteBanc("02");
        CompteBanc c3 = new CompteBanc("03", 300.50);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        
        //Ejecutamos Metodos
        
        c1.debit(665.50);
        System.out.println(c1.toString());
        c1.credit(2345.50);
        System.out.println(c1.toString());
        
        
        
    }
    
}
