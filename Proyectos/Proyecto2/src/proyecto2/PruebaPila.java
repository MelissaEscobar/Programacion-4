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
public class PruebaPila {

    
      //Coleccion_interfaz c 
    public void rellenar(Coleccion_interfaz c){
    
    for(int i=1; i<11; i++){
        c.añadir(i);
    }
    
}
    public void Mostrar_pila(Coleccion_interfaz c){
        
    for (int i=0; i<10; i++){
            System.out.println(c.extraer());
        }
    }
    
}
