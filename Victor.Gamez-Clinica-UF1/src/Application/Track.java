/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

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

    /*
    TODO Constructor
    Paràmetres: Integer codi, Date dataTrack, String tipusMesura, String patient, Float valor
    Accions:
    - actualitzar les propietats que ens han passat per paràmetre
    - Nota: en aquest cas, el codi l'ha de donar l'usuari, no serà un comptador
    */    
    public Track(int codigo, Date data, String tipo, String paciente, float valor ){
        
        this.code = codigo;
        this.dataTrack = data;
        this.tipusMesura = tipo;
        this.patient = paciente;
        this.valor = valor;
        
    }
    /*
    TODO Mètodes accessors    
    */

    public Integer getCode() {
        return code;
    }

    public Date getDataTrack() {
        return dataTrack;
    }

    public String getTipusMesura() {
        return tipusMesura;
    }

    public String getPatient() {
        return patient;
    }

    public Float getValor() {
        return valor;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDataTrack(Date dataTrack) {
        this.dataTrack = dataTrack;
    }

    public void setTipusMesura(String tipusMesura) {
        this.tipusMesura = tipusMesura;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
    
    public static Track addTrack() {
        
        System.out.println("Inserta el codigo");
        Scanner codigo = new Scanner(System.in);
        System.out.println("Inserta el año");
        Scanner años = new Scanner(System.in);
        System.out.println("Inserta el mes");
        Scanner meses = new Scanner(System.in);
        System.out.println("Inserta el dia");
        Scanner dias = new Scanner(System.in);
        System.out.println("Inserta el tipo de medida");
        Scanner medida = new Scanner(System.in);
        System.out.println("Inserta el paciente");
        Scanner paciente = new Scanner(System.in);
        System.out.println("Inserta el valor");
        Scanner valor = new Scanner(System.in);
        
        int codigot = Integer.parseInt(codigo.next());
        int valores = Integer.parseInt(valor.next());
        int año = Integer.parseInt(años.next());
        int mes = Integer.parseInt(meses.next());
        int dia = Integer.parseInt(dias.next());
        Date fecha = new Date(año,mes,dia);
        
        Track nuevo = new Track(codigot,fecha,medida.next(),paciente.next(),valores);
        
        return nuevo;
    /*
    TODO 
    Paràmetres: sense
    Accions:
    - demanar les dades per consola per crear una nou registre(track) (són les dades que demana el constructor)
    Retorneu: El registre (track) creat
    */ 
    }

}
