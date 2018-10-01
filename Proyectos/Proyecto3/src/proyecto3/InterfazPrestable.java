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
public interface InterfazPrestable {
    public boolean prestar();
    public boolean devolver();
    public boolean prestado();
    public int CuentaPrestados(Libros array_objetos[]);
    
    
}
