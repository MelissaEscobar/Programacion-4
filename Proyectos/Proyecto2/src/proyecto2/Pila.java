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
public class Pila implements Coleccion_interfaz {
        public ArrayList<Object> pila = new ArrayList<Object>();
        private static int cont=0;

    public Pila() {
    }
        
        
   @Override     
   public boolean estaVacia(){
       return pila.isEmpty();
   }
   
   @Override
   public Object extraer(){
       Object aux;
       aux = pila.get(0);
       pila.remove(0);
       if (cont>0){
           cont--;
       }
       return aux;
       
       
   }   
   
   @Override
   public Object primero(){
       return pila.get(0);
   }
   
   @Override
   public void añadir(Object a){
       pila.add(0, a);// cambio
       
   }


}
