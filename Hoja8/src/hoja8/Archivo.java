package hoja8;

import java.io.*;

/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Archivo{
    
    File archivo;
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    PrintWriter pw;
    InterfazGrafo grafo = new GraphMatrix();

    
    /**
     * Nombre: obtenerArchivo
     * Descripcion: obtiene el archivo
     * No hay valor de retorno
     * @param direccion
     * @throws FileNotFoundException
     */
    public void obtenerArchivo(String direccion) throws FileNotFoundException{
       archivo=new File(direccion); 
    }  
    
    /**
     * Nombre: arregloNombres
     * Descripcion: obtiene los nombres de los nodos para el grafo
     * No tiene parametros
     * @return
     * @throws IOException
     */
    public InterfazGrafo arregloNombres() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;
        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.add(tmp[0]);
            grafo.add(tmp[1]);
        }
        return grafo;
    }
    
    /**
     * Nombre: write
     * Descripcion: escritura del archivo
     * Pre: no hay
     * Post: archivo escrito
     * No hay valor de retorno
     * @param cadena
     * @throws IOException
     */
    public void write(String cadena) throws IOException{
        fw = new FileWriter(archivo);
        pw = new PrintWriter(fw);
        pw.println(cadena);
    }
    
    /**
     * Nombre: matrizCostos
     * Descripcion: obtiene los pesos de los arcos entre nodos del grafo
     * No tiene parametros
     * @return
     * @throws IOException
     */
    public InterfazGrafo matrizCostos() throws IOException{
        // Lectura del fichero
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        String linea;

        while((linea=br.readLine())!=null){
            String[] tmp;
            tmp=linea.split(" ");
            grafo.addEdge(tmp[0], tmp[1], tmp[2]);
        }
        return grafo;
    }
    

}
