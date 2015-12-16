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
public class Camion extends Vehiculo{
    private static int contador;
    
    public Camion() {
        this.color = "Plomo";
        this.placa = "TQ - 1912";
        this.puertas = 3;
        this.ruedas = 6;
        this.contador ++;
        System.out.println("contador Camion = " + contador);
    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", ruedas=" + ruedas + ", puertas=" + puertas + ", placa=" + placa + ", compañia fabricadora=" + companiaFabricadora + ", contador=" + this.contador +'}';
    }

    public static int getContador() {
        return contador;
    }
    
    
}
