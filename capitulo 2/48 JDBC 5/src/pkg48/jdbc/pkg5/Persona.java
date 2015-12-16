/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg48.jdbc.pkg5;

/**
 *
 * @author gerson
 */
public class Persona {
    private String nombApell= "", telf = "", loc = "", dirc = "";
    //private String nombApell, telf, loc, dirc;

    public Persona(String nombApell, String telf, String loc, String dirc) {
        this.nombApell = nombApell;
        this.telf = telf;
        this.loc = loc;
        this.dirc = dirc;
    }

    public String getNombApell() {
        return nombApell;
    }

    public void setNombApell(String nombApell) {
        this.nombApell = nombApell;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getDirc() {
        return dirc;
    }

    public void setDirc(String dirc) {
        this.dirc = dirc;
    }

    
    
    
}
