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
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo objVehiculo1 = new Vehiculo();
        System.out.println("Termine objVehiculo1\n");
       
        Vehiculo objVehiculo2 = new Vehiculo();
        System.out.println("Termine objVehiculo2\n");
        
        Auto objAuto1 = new Auto();
        System.out.println("Termine objAuto1\n");
        
        Auto objAuto2 = new Auto();
        System.out.println("Termine objAuto2\n");
        
        Camion objCamion1 = new Camion();
        System.out.println("Termine objCamion1\n");
        
        Camion objCamion2 = new Camion();
        System.out.println("Termine objCamion2\n");
        
        Camion objCamion3 = new Camion();
        System.out.println("Termine objCamion3\n");
        
        Camion objCamion4 = new Camion();
        System.out.println("Termine objCamion4\n");
        
        
        System.out.println("objVehiculo1 : " + objVehiculo1.toString());
        System.out.println("objVehiculo1 : " + objVehiculo1.toString());
        System.out.println("objAuto1 : " + objAuto1.toString());
        System.out.println("objAuto2 : " + objAuto2.toString());
        System.out.println("auto:" + objAuto2.contador);
        System.out.println("objCamion1 : " + objCamion1.toString());
        System.out.println("objCamion2 : " + objCamion2.toString());
        System.out.println("objCamion3 : " + objCamion3.toString());
        System.out.println("objCamion4 : " + objCamion4.toString());            
        
        System.out.println("\nTotal de Vehiculos son : " + Vehiculo.getContadorTotal());
        System.out.println("Total de Autos son : " + Auto.getContador());
        System.out.println("Total de Camiones son : " + Camion.getContador());
        
        
    }
    
}
