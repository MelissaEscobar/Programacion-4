/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author utp
 */
public class Disco extends Multimedia {
    String genero;

    public Disco() {
    }
    

    public Disco(String genero) {
        this.genero =  genero;
    }

    public String getGenero() {
        return genero;
    }

    public String toString (){
        String mensaje="El titulo es: "+titulo+
                " El autor es: "+autor+
                " El formato es: "+formato+
                " La duracion es: "+duracion+                
                 "El genero del disco es: "+genero;
        return mensaje;
    
    }
    
}
