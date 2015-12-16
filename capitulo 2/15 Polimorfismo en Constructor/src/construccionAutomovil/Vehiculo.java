/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionAutomovil;

/**
 *
 * @author gerson
 */
public class Vehiculo {
    private String color;
    private int ruedas, puertas;
    public String sobreNombre;

    public Vehiculo(String color, int ruedas, int puertas) {
        this.color = color;
        this.ruedas = ruedas;
        this.puertas = puertas;
    }

    public Vehiculo() {
        color = "Azul";
        ruedas = 4;
        puertas = 5;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "color=" + color + ",\nruedas=" + ruedas + ",\npuertas=" + puertas;
    }
    
    
}
