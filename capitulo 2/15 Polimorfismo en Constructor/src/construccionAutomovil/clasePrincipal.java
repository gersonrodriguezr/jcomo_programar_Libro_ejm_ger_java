/*
 * En este caso al constructor es una especie de polimorfismo,
 * ya que hay dos constructores con el mimo nombre, pero diferente numero de argumentos.
 * polimorfismo = puede tomar muchas formas.
 */
package construccionAutomovil;

/** 
 *
 * @author gerson
 */
public class clasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo objVehiculo1 = new Vehiculo("Rojo", 6, 5);
        Vehiculo objVehiculo2 = new Vehiculo();
        
        objVehiculo1.sobreNombre = "Furioso"; // Como es publico, puedo acceder directamente a sus atributo sobreNombre en este caso.
        //objVehiculo1.color = "Verde"; // Esto no se puede hacer ya que el color es de tipo privado
               
       
        System.out.println("objVehiculo1 :\n" + objVehiculo1.toString());
        System.out.println("objVehiculo1 Sobre Nmbre: " + objVehiculo1.sobreNombre);
        System.out.println("");
        System.out.println("objVehiculo2 :\n" + objVehiculo2.toString());
        
        
    }
    
}
