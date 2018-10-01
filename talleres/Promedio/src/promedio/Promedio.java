/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author Familia
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /* Realice una aplicación que permita leer un archivo que contenga números y calcule el promedio de dichos
            números. */
        int numero, cont=0, aux=0;         
        File archivo = new File("archivo.txt");
        
        try {
                int num;            
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                Scanner reader = new Scanner(System.in);
                
                System.out.println("Ingrese los 10 numeros enteros: ");
                
                for(int i=0; i<10; i++){
                    num = reader.nextInt();
                    bw.write(num);
                    bw.newLine();
                 }
                    bw.close();
                } catch (FileNotFoundException e) {
                     e.printStackTrace();
                } catch (IOException e) {
                     e.printStackTrace();
                   }catch (java.util.InputMismatchException ex) { 
                       System.out.println("Error. Ingrese solo numeros enteros");
                   }
        
              
        
        try {
             FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr);
             String cadena;
              // aux es la variable que me permitirá contar la cantidad de numeros que hay almacenados en el archivo
                                        // cont es la variable que me permite sumar los numeros contenidos en el archivo
              cadena=br.readLine();                       
             do{           
                    System.out.println(cadena);
                    
                    numero=Integer.parseInt(cadena);
                    cont+= numero;
                    aux++;
                    System.out.println("bander 2");   
                }while ((cadena=br.readLine())!=null);
        } catch (FileNotFoundException e) {
                 e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();
        }
        
        System.out.println("El promedio de los numeros que se encuentran en el archivo es: "+ (cont/aux));
  }
    
}
