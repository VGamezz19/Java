/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class TestCasting {
   public static void main(String[] args) {
      A a1 = new C();   // upcast
      System.out.println(a1);  // executa toString() de C
      B b1 = (B)a1;     // downcast ok
      C c1 = (C)b1;     // downcast ok

      A a2 = new B();  // upcast
      System.out.println(a2);  // executa toString() de B
      B b2 = (B)a2;    // downcast ok
      C c2 = (C)a2;    // execution error ClassCastException
   }
}

