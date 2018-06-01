/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephmoscoso;

import java.util.ArrayList;

/**
 *
 * @author joseph
 */
public class criaturas {
    private String raza;
    private int numero;
    private int años;
    private String region;
    private int cantidad;
    private int pesoc;
    ArrayList l=new ArrayList();

    public criaturas() {
    }

    public criaturas(String raza, int numero, int años, String region, int cantidad, int pesoc) {
        this.raza = raza;
        this.numero = numero;
        this.años = años;
        this.region = region;
        this.cantidad = cantidad;
        this.pesoc = pesoc;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPesoc() {
        return pesoc;
    }

    public void setPesoc(int pesoc) {
        this.pesoc = pesoc;
    }
    
    public ArrayList getL() {
        return l;
    }

    public void setL(ArrayList l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return raza;
    }
    
    
}
