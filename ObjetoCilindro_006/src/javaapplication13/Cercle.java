
package javaapplication13;
/**
 *
 * @author super
 */
public class Cercle {  // nom de la clase
   
   //variables membres
   private double radi; 
   private String color;
   
   
   //constructors
   public Cercle(){
       this.radi=1.0;
       this.color="vermell";
   }

   public Cercle(double radi){
       this.radi=radi;
       this.color="vermell";
   }

   public Cercle(double radi, String color){
       this.radi=radi;
       this.color=color;
   }    
   
   //getters/setters
   public String getColor() {
       return this.color;
   }
   
   public double getRadi() {
       return this.radi;
   }
   
   public void setColor(String color) {
       this.color = color;
   }

   public void setRadi(double radi) {
       this.radi = radi;
   }
   
   //altres metodes
   public double calculaArea() {
       return this.radi*this.radi*Math.PI;
   }
   
   @Override
   public String toString(){
       return "Cercle de radi= " + this.radi + " i color= " + this.color
               + " i area " + this.calculaArea();
   }
}
