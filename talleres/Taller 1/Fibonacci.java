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
public class Fibonacci {
    int x0 = 1;
        int x1 = 1;
        int n = 10; // numero n 
        
        if(n==0){
            System.out.print(x0 + ", ");
        } else if(n==1){
            System.out.print(x1 + ", ");
        }else{
            
        System.out.print(x0 + ", ");
        System.out.print(x1 + ", ");
 
        for(int i = 0; i<n-2; i++){
            x1 = x0 + x1;
            x0 = x1 - x0;
            System.out.print(x1 + ", ");
        }
        
        }
    
}
