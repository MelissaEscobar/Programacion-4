/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;
import java.util.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Familia
 */
public class Capturar_n {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          try {
                int numero;            
                File archivo;
                archivo = new File("archivo.txt");
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                Scanner reader = new Scanner(System.in);
                
                System.out.println("Ingrese los 10 numeros enteros: ");
                
                for(int i=0; i<10; i++){
                    numero = reader.nextInt();
                    bw.write(numero);
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
   }
    
}
