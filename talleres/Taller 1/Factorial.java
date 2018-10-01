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
public class Factorial {
    int x;
    int n=1;
    int fact=1;
    
    if(x==0 || x==1){
            System.out.println("El factorial es 1");
    }else{
        
    while(n <= x){
        fact= fact * n;
        n = n+1;        
    }
            System.out.println("El factorial de " + x + " es: " + fact);   
    
    }
    
}
