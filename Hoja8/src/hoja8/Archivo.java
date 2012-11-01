/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.io.*;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Archivo {
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    boolean existe=false;
    int contador=0;
    int numero=10;
    String[] nombres;
    int elementos=0;
    
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  
    
    public String[] arregloNombres() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        String[] arreglo= new String[numero];
        for(int i=0;i<numero;i++){
            arreglo[i]="";
        }
        int i=0;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            arreglo[i]=tmp[0];
            elementos++;
            for(int j=0;j<arreglo.length;j++){
                if(!arreglo[j].contentEquals("")){
                    if(arreglo[i].contentEquals(arreglo[j])){
                        contador++;
                        if(contador>1){
                            arreglo[i]="";
                            i--;
                            elementos--;
                        }
                    }
                }
            }
            contador=0;
            i++;
            arreglo[i]=tmp[1];
            elementos++;
            for(int j=0;j<arreglo.length;j++){
                if(!arreglo[j].contentEquals("")){
                    if(arreglo[i].contentEquals(arreglo[j])){
                        contador++;
                        if(contador>1){
                            arreglo[i]="";
                            i--;
                            elementos--;
                        }
                    }
                }
            }
            contador=0;
            i++;
        }
        
        for(int j=0; j<arreglo.length; j++)
        {         System.out.println(arreglo[j]);}
        
        nombres=arreglo;
        return arreglo;
    }
    
    public int[][] matrizCostos() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        int[][] arreglo= new int[elementos][elementos];
        for(int i=0;i<elementos;i++){
            for(int j=0;j<elementos;j++){
                if(i==j){
                    arreglo[i][j]=0;
                }
                else{
                    arreglo[i][j]=10000;
                }
            }
        }
        int i=0;
        int j=0;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            for(int a=0;a<nombres.length;a++){
                if(nombres[a].contentEquals(tmp[0])){
                    i=a;
                    break;
                }
            }
            for(int b=0;b<nombres.length;b++){
                if(nombres[b].contentEquals(tmp[1])){
                    j=b;
                    break;
                }
            }
            int costo = Integer.parseInt(tmp[2]);
            System.out.println("El costo es "+costo);
            arreglo[i][j]=costo;
        }
        for(int a=0;a<arreglo.length;a++){
            for(int b=0;b<arreglo.length;b++){
                System.out.print(""+arreglo[a][b]+" ");
            }
            System.out.println("");
        }
        return arreglo;
    }
    
    
    
}
