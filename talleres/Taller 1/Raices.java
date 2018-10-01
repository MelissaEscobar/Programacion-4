/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1;

/**
 *
 * @author Familia
 */
public class Raices {
     float a=1, b=4, c=3, x1, x2, det;
        
        det = (b*b)-(4*a*c);
        
        x1 = (float) ((-b + Math.sqrt(det)) / (2*a));
        x2 = (float) ((-b - Math.sqrt(det)) / (2*a));
        
        System.out.print( "Las raices de la ecuacion son: X1= "+ x1 + ", X2= " + x2);
    
}
