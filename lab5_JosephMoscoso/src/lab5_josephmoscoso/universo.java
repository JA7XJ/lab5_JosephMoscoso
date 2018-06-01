/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_josephmoscoso;

/**
 *
 * @author joseph
 */
public class universo {
    private String codigo;
    private int edaduniverso;
    private int pesouniverso;

    public universo() {
    }

    public universo(String codigo, int edaduniverso, int pesouniverso) {
        this.codigo = codigo;
        this.edaduniverso = edaduniverso;
        this.pesouniverso = pesouniverso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getEdaduniverso() {
        return edaduniverso;
    }

    public void setEdaduniverso(int edaduniverso) {
        this.edaduniverso = edaduniverso;
    }

    public int getPesouniverso() {
        return pesouniverso;
    }

    public void setPesouniverso(int pesouniverso) {
        this.pesouniverso = pesouniverso;
    }

    @Override
    public String toString() {
        return "universo{" + "codigo=" + codigo + ", edaduniverso=" + edaduniverso + ", pesouniverso=" + pesouniverso + '}';
    }
    
}
