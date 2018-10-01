/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo_s;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Properties;
/**
 *
 * @author Familia
 */
public class Archivo_S {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Persona p;
            try {
             File archivo = new File("archivo.txt");
             FileOutputStream fos = new FileOutputStream(archivo);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             p =new Persona(1, "A", "B");
             oos.writeObject(p);
             p =new Persona(1, "C", "D");             
             oos.writeObject(p);
             p =new Persona(1, "E", "F");
             oos.writeObject(p);
            } catch (FileNotFoundException e) {
             e.printStackTrace();
            } catch (IOException e) {
             e.printStackTrace();
            }
        
            File archivo2 = new File("propiedades.properties");
            try {
                FileInputStream fis = new FileInputStream(archivo2);
             Properties archivo2Propiedades = new Properties();
             archivo2Propiedades.load(fis);

             for(int i=1; i<=4; i++){
             String dato = archivo2Propiedades.getProperty("Propiedad"+i);
            System.out.println(dato);
             }
            } catch (FileNotFoundException e) {
             e.printStackTrace();
            } catch (IOException e) {
             e.printStackTrace();
            }
                }

            }
