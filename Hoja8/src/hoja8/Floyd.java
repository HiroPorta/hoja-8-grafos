/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;


import java.io.IOException;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Floyd {
    Archivo a= new Archivo();
    InterfazGrafo D;
    int[][] P;
    InterfazGrafo grafo = new GraphMatrix();
    
    public Floyd(){
        
        try {
            a.obtenerArchivo("C:/Users/Mafer/Documents/Universidad del Valle de Guatemala/Cuarto semestre/Algoritmos y Estructuras de Datos/Hoja de trabajo 8/Hoja8/src/hoja8/datos.txt");
            a.arregloNombres();
            D = a.matrizCostos();
            P = new int[a.grafo.size()][a.grafo.size()];
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for(int n=0;n<a.grafo.size();n++){
            for(int m=0;m<a.grafo.size();m++){
                P[n][m]=0;
            }
        }
    }
    
    public void caminoCorto(){
        for(int k=0;k<a.grafo.size();k++){
            for(int i=0;i<a.grafo.size();i++){
                for(int j=0;j<a.grafo.size();j++){
                    if(D.getEdge(a.grafo.get(i),a.grafo.get(j))>(D.getEdge(a.grafo.get(i), a.grafo.get(k))+D.getEdge(a.grafo.get(k), a.grafo.get(j)))){
                        D.addEdge(a.grafo.get(i), a.grafo.get(j), (D.getEdge(a.grafo.get(i), a.grafo.get(k))+D.getEdge(a.grafo.get(k), a.grafo.get(j))));
                        P[i][j]=k;
                    }
                }
            }
        }
        System.out.println("Matriz final: ");
        D.show();
    }
}

    