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
public class mundod {
    private String nombre;
    private int pesot;
    ArrayList<criaturas> cr=new ArrayList();

    public mundod() {
    }

    public mundod(String nombre, int pesot) {
        this.nombre = nombre;
        this.pesot = pesot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPesot() {
        return pesot;
    }

    public void setPesot(int pesot) {
        this.pesot = pesot;
    }

    public ArrayList<criaturas> getCr() {
        return cr;
    }

    public void setCr(ArrayList<criaturas> cr) {
        this.cr = cr;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
