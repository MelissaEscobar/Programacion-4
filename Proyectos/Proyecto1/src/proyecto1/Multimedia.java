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
public class Multimedia {
    
    String titulo;
    String autor;
    String formato, duracion;

    public Multimedia(String titulo, String autor, String formato, String duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    public Multimedia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getFormato() {
        return formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public String toString (){
        String mensaje="El titulo es: "+titulo+
                " El autor es: "+autor+
                " El formato es: "+formato+
                " La duracion es: "+duracion;
        return mensaje;
    }
    
     public boolean equals(Multimedia a){
        return  a.autor.equals(a.titulo);
      }   
 }
