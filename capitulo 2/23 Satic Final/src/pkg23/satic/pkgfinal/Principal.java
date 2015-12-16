/*
 * el metodo estatico, se puede llamar sin la necesidad de crear un objeto
 */
package pkg23.satic.pkgfinal;

/**
 *
 * @author gerson
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        metodoSatico();// se llamo a este metodo, sin la necesidad de crear un objeto.
        
        Principal objPrinc = new Principal();
        objPrinc.metodoSinSerStatico();//Para llamar a este metodo se tuvo que crear el objeto obligatoriamente.  
    }
    
    public static void metodoSatico(){
        
    }
    public void metodoSinSerStatico(){
        
    }
}
