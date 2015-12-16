/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23.satic.pkgfinal;

/**
 *
 * @author gerson
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SaticyFinal objSatic1 = new SaticyFinal();
        SaticyFinal objSatic2 = new SaticyFinal();
        SaticyFinal objSatic3 = new SaticyFinal();
        SaticyFinal objSatic4 = new SaticyFinal();
        
        System.out.println("" + objSatic4.getA());
        objSatic2.setA(30);
        System.out.println("" + objSatic4.getA());
        System.out.println("Total de objetos = " + objSatic1.getCont());
    }
    
}
