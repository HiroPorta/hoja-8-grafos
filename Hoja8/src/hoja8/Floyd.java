/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Floyd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Archivo a = new Archivo();
        try{
            a.obtenerArchivo("C:/Users/Mafer/Documents/Universidad del Valle de Guatemala/Cuarto semestre/Algoritmos y Estructuras de Datos/Hoja de trabajo 8/Hoja8/src/hoja8/datos.txt");
            a.arregloNombres();
            a.matrizCostos();
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        
    }
}
