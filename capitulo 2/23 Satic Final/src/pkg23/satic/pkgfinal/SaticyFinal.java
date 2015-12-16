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
public class SaticyFinal {
     public static int a = 20;//Esto no se hace, por que rompe con las reglas del encapsulamiento
     public static int cont;
     public final int variable = 10 ; // Final significa que no se va a cambiar el tipo de variable
    public SaticyFinal() {
        cont ++;
    }

    public static int getCont() {
        return cont;
    }

    public static int getA() {
        return a;
    }

    public static void setA(int a) {
        SaticyFinal.a = a;
    }
     
}
