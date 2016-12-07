/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class B extends A {
       public B() {  // Constructor
      super();
      
      
      A.setCount();
      
      System.out.println("Constructor B " + A.getCount());
   }
   @Override
   public String toString() {
      return "Això és B";
   }

}
