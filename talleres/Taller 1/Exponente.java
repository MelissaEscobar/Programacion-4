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
public class Exponente {
    int y =5; // y es la base
    int x=4; // x es el exponente
    int m=1; // m es la variable donde se almacenará el resultado de la multiplicación
    int cont=1; // contador
    
    
    while(cont <= x){
    m = m * y;
    cont++;   
}   
     System.out.println(y+ " elevado a la " + x + " es: "+ m);
    
    
}
