/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class CompteBanc {
    
    // Start CONSTRUCTORES 
       private String numeroCompte;
       private Double  saldo;
       
       
        public CompteBanc (){
        this.numeroCompte = "01";
        this.saldo = 1000.00;       
    }
    
      public CompteBanc (String numeroCuenta){
        this.numeroCompte = numeroCuenta;
        this.saldo = 1000.00;       
    }
    
        public CompteBanc (String numeroCuenta, Double saldo){
        this.numeroCompte = numeroCuenta;
        this.saldo = saldo;       
    }
        //Fin CONSTRUCTORES
        
        // Start Get
    public String getNumeroCompte (){
        return this.numeroCompte;
    }
    public Double getSaldo (){
        return this.saldo;
    }
        //Fin Get
    
        //Start Set
    public void setSaldo(Double saldo){
        this.saldo = saldo;
    }
        //Fin Set
   
        // Start ToString
    
       @Override  //porque hay otra funcion que se llama ToString, predefinida por defecto
                    //pero la sobrescribimos con el @Override
    public String toString () {
        
        return "|Compte numero: " + getNumeroCompte() + "| Saldo: " + getSaldo() + " €|";
    }
        //Fin ToString
    
    
    //Star Metodos
    
    public double credit(Double saldo){
         this.setSaldo(this.getSaldo() + saldo);
        return getSaldo();
    }  
    public double debit(Double saldo){
        this.setSaldo(this.getSaldo() - saldo);
        return getSaldo();
    }
    
    //Fin Metodos
    

       
}
