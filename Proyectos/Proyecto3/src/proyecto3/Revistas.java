/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

import java.util.ArrayList;

/**
 *
 * @author Familia
 */
public class Revistas extends Documento{
      int numero;
    
        
    public Revistas(String codigo, String titulo, String a_publicacion, int numero) {
        super(codigo, titulo, a_publicacion);
        this.numero = numero;
    }
    
    
     public String getCodigo() {
        return codigo;
    }

    public String getA_publicacion() {
        return a_publicacion;
    }
    
    public String toString(){
        
        String mensaje = "Las caracteristicas de la revista son: Codigo: "+
                codigo+ " titulo: "+titulo+ 
                "Año de publicacion: "  +a_publicacion+
                " Numero de la revista: " +numero ;
        
        return mensaje;
    }
    
    
}
