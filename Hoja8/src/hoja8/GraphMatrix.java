/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.util.Vector;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class GraphMatrix<V,E> implements InterfazGrafo<V,E>{

    private Vector vertices = new Vector();
    private int[][] arcos;
    
    
    @Override
    public void add(V label) {
        
        if(!vertices.contains(label)){
            vertices.add(label);
        }
        arcos = new int[vertices.size()][vertices.size()];
        for(int i=0;i<vertices.size();i++){
            for(int j=0;j<vertices.size();j++){
                if(i==j){
                    arcos[i][j]=0;
                }
                else{
                    arcos[i][j]=10000;
                }
            }
        }
        
    }

    @Override
    public void addEdge(V vtx1, V vtx2, E label) {
        int i = vertices.indexOf(vtx1);
        int j = vertices.indexOf(vtx2);        
        String tmp = ""+label;
        int peso = Integer.parseInt(tmp);
        arcos[i][j]=peso;
    }
    
    @Override
    public void show(){
        for(int a=0;a<vertices.size();a++){
            for(int b=0;b<vertices.size();b++){
                System.out.print(""+arcos[a][b]+" ");
            }
            System.out.println("");
        }
    }
    
    @Override
    public int size(){
        return vertices.size();
    }
    
    @Override
    public int getEdge(V label1, V label2){
        return arcos[vertices.indexOf(label1)][vertices.indexOf(label2)];
    }
    
    @Override
    public V get(int label){
        
        return (V)vertices.get(label);
        
    }
}
