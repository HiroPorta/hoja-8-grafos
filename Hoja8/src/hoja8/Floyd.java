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
 * @author Mafer
 */
public class Floyd {
    Archivo a= new Archivo();
    int[][] D;
    int[][] P;
    
    public Floyd(){
        try {
            a.obtenerArchivo("C:/Users/Mafer/Documents/Universidad del Valle de Guatemala/Cuarto semestre/Algoritmos y Estructuras de Datos/Hoja de trabajo 8/Hoja8/src/hoja8/datos.txt");
            a.arregloNombres();
            D = a.matrizCostos();
            P = new int[a.elementos][a.elementos];
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for(int n=0;n<a.elementos;n++){
            for(int m=0;m<a.elementos;m++){
                System.out.println("m "+m+" n "+n);
                P[n][m]=0;
            }
        }
    }
    
    public void caminoCorto(){
        for(int k=0;k<a.elementos;k++){
            for(int i=0;i<a.elementos;i++){
                for(int j=0;j<a.elementos;j++){
                    if(D[i][j]>(D[i][k]+D[k][j])){
                        D[i][j]=D[i][k]+D[k][j];
                        P[i][j]=k;
                    }
                }
            }
        }
        
        for(int i=0;i<a.elementos;i++){
            for(int j=0;j<a.elementos;j++){
                System.out.print(""+D[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
    