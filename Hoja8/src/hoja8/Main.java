/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Archivo a = new Archivo();
        InterfazGrafo grafo = new GraphMatrix();
        try {
            a.obtenerArchivo("C:/Users/Mafer/Documents/Universidad del Valle de Guatemala/Cuarto semestre/Algoritmos y Estructuras de Datos/Hoja de trabajo 8/Hoja8/src/hoja8/datos.txt");
            a.arregloNombres();
            a.matrizCostos();
            System.out.println("Matriz inicial: ");
            a.grafo.show();
            
        } catch (FileNotFoundException ex) {
            System.out.println("No se ha encontrado el archivo");
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        Floyd matriz = new Floyd();
        
        matriz.caminoCorto();
        matriz.centroGrafo();
        
        
    }
}
