/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class C extends B {
   public C() {  // Constructor
      
      super();
      B.setCount();
      
      System.out.println("Constructor C " + B.getCount());
   }
   @Override
   public String toString() {
      return "Això és C";
   }
}

