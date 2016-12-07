/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class A {
    
    static int cont;
       public A() {  // Constructor
      
      
      this.setCount();
      
      System.out.println("Constructor A letras creadas:" + this.getCount());
      
   }
       
    public static void setCount(){
        A.cont++;
    }
    
    public static int getCount(){
        return A.cont;
    }
    
       @Override
   public String toString() {
      return "This is A";
   }

}
