/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

 import java.util.*;
/**
 *
 * @author Familia
 */
public class ListaMultimedia {
    ArrayList<Multimedia> r = new ArrayList<Multimedia>();
    int max, aux; // aux es el atributo en el que se contará los elementos que hay en la lista

    public ListaMultimedia(int a) {
        max = a; // numero maximo de elementos que va a almacenar
        
    }
    
    public int size(){
       return aux = r.size();
    }
    
    public boolean add(Multimedia ob){
        
        if (max > r.size()){
            r.add(ob);
            return true;
        } else{
            return false;
        }
       
    }
  
   
    @Override
    public String toString(){
        
        String mensaje = "Los elementos que contiene la lista son: ";
        for(int i=0; i<this.r.size(); i++){
            mensaje = mensaje + " Elemento # "+ i+ r.get(i).toString();            
        }
        
        return mensaje;
    }
    
}
