/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operations;

import patients.Patient;
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
    TODO
    */
    public Track(Integer code, Date dataTrack, String tipusMesura, String patient, Float valor) {
        this.code = code;
        this.dataTrack = dataTrack;
        this.tipusMesura = tipusMesura;
        this.patient = patient;
        this.valor = valor;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Date getDataTrack() {
        return dataTrack;
    }

    public void setDataTrack(Date dataTrack) {
        this.dataTrack = dataTrack;
    }

    public String getTipusMesura() {
        return tipusMesura;
    }

    public void setTipusMesura(String tipusMesura) {
        this.tipusMesura = tipusMesura;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    /*
    TODO
    */
    public static Track addTrack() {
        Scanner teclado = new Scanner(System.in);
        Integer code;
        Date dataTrack = null;
        String tipusMesura;
        String patient;
        Float valor;
        System.out.println("Codi del registre:");
        code = teclado.nextInt();
        System.out.println("Tipus de mesura:");
        tipusMesura = teclado.next();
        System.out.println("Pacient:");
        patient = teclado.next();
        System.out.println("Valor del registre:");
        valor = teclado.nextFloat();
        System.out.println("Data del registre (dd/mm/aaaa):");
        String dateFormat = "dd/MM/yyyy";
        try {
            dataTrack = new SimpleDateFormat(dateFormat).parse(teclado.next());
        } catch (Exception e) {
        }

        return new Track(code, dataTrack, tipusMesura, patient, valor);
    }

}
