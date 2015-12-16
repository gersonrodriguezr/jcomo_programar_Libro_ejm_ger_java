/*
 * Los atributos privados no pueden ser heredados, ni modificados
 * Protected quiere decir que no va a poder ser accedida desde otra clase, pero si heredada
 * Public va a poder ser accedida desde cualquier lado y heredadda.
 */
package construccionVehiculo;

import java.util.Objects;

/**
 *
 * @author gerson
 */
public class Vehiculo {
    private static int contadorTotal;
    public static int contador;
    //protected static int contador;
    public static final String companiaFabricadora = "Trasnportes Java";
    protected String color;
    protected int ruedas;
    protected int puertas;
    protected String placa;

    public Vehiculo(String color, int ruedas, int puertas, String placa) {
        this.color = color;
        this.ruedas = ruedas;
        this.puertas = puertas;
        this.placa = placa;
        contadorTotal++;
//        contador++;
//        System.out.println("contadorTotal Vehiculo =" + contadorTotal);
//        System.out.println("contador Vehiculo =" + contador);
    }

    public Vehiculo() {
        color = "Azul";
        ruedas = 4;
        puertas = 4;        
        placa = "Beta";
        contadorTotal++;
        contador++;
        System.out.println("contadorTotal Vehiculo =" + contadorTotal);
        System.out.println("contador Vehiculo =" + contador);
    }

    public static int getContadorTotal() {
        return contadorTotal;
    }

    public static String getCompaniaFabricadora() {
        return companiaFabricadora;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public int getPuertas() {
        return puertas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

//    @Override
//    public String toString() {
//        return "Vehiculo{" + "color=" + color + ", ruedas=" + ruedas + ", puertas=" + puertas + ", placa=" + placa + '}';
//    }
    
    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", ruedas=" + ruedas + ", puertas=" + puertas + ", placa=" + placa + ", contadorTotal=" + contadorTotal + ", compañia fabricadora=" + placa + ", contador=" + this.contador +'}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (this.ruedas != other.ruedas) {
            return false;
        }
        if (this.puertas != other.puertas) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }



    
    
}
