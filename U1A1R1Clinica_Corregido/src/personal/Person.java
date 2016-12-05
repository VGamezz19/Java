/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

/**
 *
 * @author victor
 */
public class Person {
    
    private String nif;
    private String name;
    private String lastname;
    
     public Person(String nif, String name, String lastname) {
        this.nif = nif;
        this.name = name;
        this.lastname = lastname;
    }

    
    public String getNif() {
        return nif;                
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
}
