/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author Familia
 */
public class Proyecto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libros p1 = new Libros("123", "Lois", "1234");
        Libros libro1 = new Libros ("123", "Lois", "1234");
        libro1.prestar();
        
        Libros array_1[]= new Libros[4];
        array_1[0] = libro1;
        array_1[1] = libro1;
        array_1[2] = new Libros("105", "Lies", "1998");
        array_1[3] = new Libros("106", "Jasu", "1998");
        
        p1.CuentaPrestados(array_1);
        
        
    }
    
}
