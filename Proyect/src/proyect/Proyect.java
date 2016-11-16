/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

/**
 *
 * @author User
 */
public class Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    // el punto desde donde se ejecuta 
       
        //Imprimir sencillo
        
	System.out.println("1_pene pati!");
        
        //--------------------------------------------------------------
        
        //IF, minitutorial + Crear una bariable boolean
        
        boolean b = false;
        
        // Siempre ha de estar empaquetado
        
        if (b == false) { //las condiciones entre parentesis
            System.out.println("2_es falso miniño");
        } else {
            System.out.println("2_es mas true que tu");
         }
        
        //------------------------------------------------------------------
        
        //Switch (La misma funcion que el IF ) PERO SOLO PUEDE SER CON UN INTEGER O VARCHAR 
        //Switch con in INTEGER
        int p =5;
        
        switch ( p ) {
            case 1:
               System.out.println("3_vale 1"); 
               break;
               //Si quitamos el Break, se ejecutaria hasta que encuentre el break
            case 2:
               System.out.println("3_vale 2"); 
               break;
               //Default es como un "ELSE" si no encuentras nada del "CASE" pasa directo a la funcion
               //del default.
            default:
                System.out.println("3_no vale ni 1 ni dhooogg"); 
        }
        
        
        //---------------------------------------------------
        
        //Switch con un VARCHAR
        
        char a = 'b';
        
           //En este caso nos interesa no poner el Break, porque queremos que lo ejecute entero.
        switch ( a ) {
               case 'a':               
               case 'e':               
               case 'i':               
               case 'o':                  
               case 'u':
                   
                System.out.println("4_es una vocal"); 
                               break;
               default:
               System.out.println("4_es una consonante"); 
               
           
        }
        
        
        
        
        //--------------------------------------------------
        
        //FOR
        //No hace falta hacer un cambio con el To char
        
        for (int i=0; i<10; i++) {
            System.out.println("5_valor de i:" +i);
        }
        
        
        //--------------------------------------------------
        
        //OTRO TIPO DE FOR
        
        for (int i= 0, n= 500; i<10; i++, n-=10) {
        System.out.println("6_valor de n:" +n);
    }
        
        //--------------------------------------------------
        
        //WHILE
        int n = 0;
        
        while (n < 10) {
            System.out.println("7_valor de n:" +n);
            n++;
        }
        
        
        //----------------------------------------------------
        //DO
        
        int x=100;
        
        do {
            if(x%2==0){
        System.out.println("8_valor de x:" +x);
    }
          x--;      
            
        }while (x>0);
        
        //---------------------------------------------------
        //OTRO TIPO DE FOR
        
        for (int i=0; i< 1000; i++) {
            if (i == 836) break; //cuando llege a 836, terminara el FOR
            
            if (i % 3 != 0) continue; 
            //si el numero no es divisible entre 3 vuelve al for. solo se imprimiran
            //los valores divisibles entre 3
            
             System.out.println("9_El valor de i es:" +i);
        }
       
	//-------------------------------------------------
        //CLASe PUBLIC STATIC BOOLEAN
        
        //La clase se ha de sacar fuera
        int z = 0;
        
        if (esZero(z)) {
             System.out.println("10_El valor Z es 0 ");
        }
        
       
}
    
     public static boolean esZero(int unnumero) {
            return (unnumero==0);
     }

}