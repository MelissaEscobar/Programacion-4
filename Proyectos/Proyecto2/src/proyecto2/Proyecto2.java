/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;
import java.util.*;
/**
 *
 * @author utp
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila s = new Pila();
        PruebaPila e = new PruebaPila();
        
        e.rellenar(s);
        e.Mostrar_pila(s);

        
    }
    
}
