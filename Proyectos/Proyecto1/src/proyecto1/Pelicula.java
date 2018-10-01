/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Familia
 */
public class Pelicula extends Multimedia{
    String actor_principal;
     String actriz_principal;

    public Pelicula(String actor_principal, String actriz_principal) {
        
        if (actor_principal== null && actriz_principal == null){
        System.out.println("Error, sólo puede ingresar uno de los dos como cadena vacía");
    }else{
           this.actor_principal = actor_principal;
           this.actriz_principal = actriz_principal ;
          }
        
    }

    public String getActor_principal() {
        return actor_principal;
    }

    public String getActriz_principal() {
        return actriz_principal;
    }
    @Override
     public String toString (){
        String mensaje="El titulo es: "+titulo+
                " El autor es: "+autor+
                " El formato es: "+formato+
                " La duracion es: "+duracion+" El actor principal es: "+actor_principal+
                " La actriz principal es: "+actriz_principal;
        return mensaje;
    }
     
     
    
}
