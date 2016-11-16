/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestLibro {
    
      public static void main (String [] args){
      
      Autor autor1 = new Autor ("Victor", "Pictor.Gamez30@gmail.com", 'm');
      Libro libro1 = new Libro ("Mi pene es gordo", autor1, 30.00, 4);
      
      Libro libro2 = new Libro ("El segundoPeneGordo", 
                                new Autor("Andrea", "AndreaCasadevalle@yahoo.com",'f'),
                                25.0, 5);
                       /*-crear una instancia de Llibre amb una ‘instància anònima’ d’Autor */
      
      System.out.println (autor1.toString());
      System.out.println(libro1.toString());
       System.out.println(libro2.toString());
      
      System.out.println(autor1.getEmail());
      autor1.setEmail("VictorPutoANO@gmail.com");
      System.out.println(autor1.getEmail());
      }
      
    
}
