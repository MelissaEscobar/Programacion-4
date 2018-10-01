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
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* 
       Multimedia m = new Multimedia(" t", "String a ", "String f", "String d");
      // System.out.println(m.toString()); 
       Multimedia n = new Multimedia("a", "a", "String f", "String d");
       
      System.out.println(n.equals(n)); 
      
      Pelicula s = new Pelicula("Camilo", "Susana");
      
      System.out.println(s.toString()); 
    }

    */
       
       ListaMultimedia l = new ListaMultimedia(10);
       Pelicula peli1 = new Pelicula("J", "M");
       Pelicula peli2 = new Pelicula("S", "F");      
       Pelicula peli3 = new Pelicula("R", "G");
       
       peli1.titulo= "El fantasma de la opera";
       peli2.titulo= "E";
       peli3.titulo= "A";

       
       l.add(peli1);
       l.add(peli2);
       l.add(peli3);
       
       
     // System.out.println(l.toString());
      
      ListaMultimedia disc = new ListaMultimedia(20);
       Disco disc1 = new Disco();
       Disco disc2 = new Disco();    
       Disco disc3 = new Disco();
       
       disc1.titulo= "Opera";
       disc1.autor= "E";
       
       disc.add(disc1);
       disc.add(disc2);
       disc.add(disc3);
       
       
      System.out.println(disc.toString()); 


       

    }
    
}
