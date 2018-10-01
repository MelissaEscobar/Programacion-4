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
public class Primo {
     int x= 3; // x e sel numero a evaluar
    int c = 2;// c va a ser el contador que me permitirá hacer divisiones 
              //sucesivas para saber si el numero es primo
    int aux =0;
    if (x ==1){
            System.out.println("El numero no es primo");
    } else if (x==2) {
      System.out.println("El numero es primo");
      
    } else {
      while (c <= x){
        if (x % c == 0){
          aux++;
          break;
        }else{
          aux =aux;
        }
        c++;        
      }

      if (aux==0) {
        System.out.println("El numero es primo");
      } else {
        System.out.println("El numero no es primo");
      }
        
    }
    
    
}
