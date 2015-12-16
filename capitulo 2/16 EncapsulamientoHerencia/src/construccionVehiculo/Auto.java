/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construccionVehiculo;

/**
 *
 * @author gerson
 */
public class Auto extends Vehiculo{
    
    public static int contador;
    
    public Auto() {
        this.color = "Rojo";
        this.placa = "SD - 4417";
        this.puertas = 2;
        this.ruedas = 4;
        this.contador ++;
        System.out.println("contador Auto = " + contador);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", ruedas=" + ruedas + ", puertas=" + puertas + ", placa=" + placa + ", compañia fabricadora=" + companiaFabricadora + ", contador=" + this.contador +'}';
    }

    public static int getContador() {
        return contador;
    }
    
    
}
