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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Archivo a = new Archivo();
        Floyd matriz = new Floyd();
        
        matriz.caminoCorto();
        
        
        
    }
}
