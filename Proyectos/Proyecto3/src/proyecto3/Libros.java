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
public class Libros extends Documento implements InterfazPrestable{
    
    
    public boolean prestado;
    
   
    
    public Libros(String codigo, String titulo, String a_publicacion) {
        super(codigo, titulo, a_publicacion);
    }
    
     public boolean Libros() {
        return this.prestado = false;
    }
     
    public boolean prestar(){
        if (prestado == false){
            System.out.println("Se ha prestado el libro solicitado");
            return this.prestado = true;
        }else{
            System.out.println("El libro ya se encuentra prestado");
             return this.prestado = true;
        }
        
    }
    
    public boolean devolver(){
        if (prestado == true){
            System.out.println("Se ha devuelto el libro");
            return this.prestado = false;
        }else{
            System.out.println("El libro no se encuentra prestado");
             return this.prestado = false;
        }
    }
    
    public boolean prestado(){ // este metodo verifica si el libro esta prestado o no
        return this.prestado;        
    }

       

    public String getCodigo() {
        return codigo;
    }

    
    public String getA_publicacion() {
        return a_publicacion;
    }
        
    public String toString(){
        
        String mensaje = "Las caracteristicas del libro son: Codigo: "+
                codigo+ " titulo: "+titulo+ 
                "Año de publicacion: "  +a_publicacion+
                " ¿El libro se encunetra prestado?" +prestado               
                ;
        
        
        return mensaje;
    }
    
    public int CuentaPrestados(Libros array_objetos[]){
        int i, cont=0;
                 
        for (i=0; i< array_objetos.length; i++){
            if (array_objetos[i].prestado == true){
                cont ++;
            }
        }
        System.out.println("El total de los objetos prestados es:"+ cont);
        
        return cont;
    }
    
}
