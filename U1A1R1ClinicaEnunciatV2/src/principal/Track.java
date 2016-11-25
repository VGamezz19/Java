/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MiguelAngel
 */
public class Track {

    private Integer code;
    private Date dataTrack;
    private String tipusMesura;
    private String patient;
    private Float valor;

    public Track(Integer code, Date dataTrack, String tipusMesura, String patient, Float valor) {
        this.code = code;
        this.dataTrack = dataTrack;
        this.tipusMesura = tipusMesura;
        this.patient = patient;
        this.valor = valor;
       /*
    TODO Constructor
    Paràmetres: Integer codi, Date dataTrack, String tipusMesura, String patient, Float valor
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */         
    }
    /*
    TODO Mètodes accessors    
    */
    public static Track addTrack() {
        
        
        
        Scanner teclado = new Scanner (System.in);
        Integer code;
        Date dataTrack = null;
        String tipusMesura;
        String patient;
        Float valor;

        System.out.println("Introduce codigo Track");
        code= Integer.parseInt(teclado.next());
        
        System.out.println("Introduce fecha Track");
        String formatData = "dd/MM/yyyy";
        try {
          dataTrack = new SimpleDateFormat(formatData).parse(teclado.next());    
        } catch (Exception e) { 
            System.out.println ("Error HIREDATE");
        }
        
        System.out.println("Introduce tipo de medida");
        tipusMesura= teclado.next();
        System.out.println("Introduce nombre del paciente");
        patient= teclado.next();
        System.out.println("Introduce el valor");
        valor= Float.parseFloat(teclado.next());
        
        
        
        return new Track(code,dataTrack,tipusMesura,patient,valor);
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nou registre(track) (són les dades que demana el constructor)
    Retorneu: El registre (track) creat
    */ 
    }

}
