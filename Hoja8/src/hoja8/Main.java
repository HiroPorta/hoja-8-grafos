/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Maria Fernanda Martinez, Adrian Martinez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        
        Floyd matriz = new Floyd();
        matriz.caminoCorto();
        int seleccion;
        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Buscar ruta mas corta entre dos ciudades ");
        System.out.println("2. Nombre de la ciudad en el centro del grafo");
        System.out.println("3. Modificar grafo");
        System.out.println("4. Finalizar programa");
        seleccion = scan.nextInt();
        while(seleccion!=4){
            
            System.out.println("\nMatriz de adyacencia\n");
            matriz.D.show();
            if(seleccion==1){
                matriz.caminoCorto();
                System.out.println("Ingrese el nombre de la ciudad de salida");
                String ciudad1 = scan.next();
                System.out.println("Ingrese el nombre de la ciudad de destino");
                String ciudad2 = scan.next();
                if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                    System.out.println("\nLa ruta mas corta es: "+matriz.D.getEdge(ciudad1, ciudad2));
                    //FALTA MOSTRAR LAS CIUDADES INTERMEDIAS
                }
            }
            else if(seleccion==2){
                matriz.centroGrafo();
            }
            else if(seleccion==3){
                System.out.println("1. Hay interrupcion de trafico entre un par de ciudades");
                System.out.println("2. Establecer nueva conexion");
                opcion = scan.nextInt();
                if(opcion==1){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = scan.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = scan.next();
                    if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                        matriz.D.addEdge(ciudad1, ciudad2, 10000);
                    }
                }
                else if(opcion==2){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = scan.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = scan.next();
                    System.out.println("Ingrese la distancia entre las ciudades");
                    int distancia = scan.nextInt();
                    if(matriz.D.contains(ciudad1)&&matriz.D.contains(ciudad2)){
                        matriz.D.addEdge(ciudad1, ciudad2, distancia);
                    }
                    else{
                        matriz.D.add(ciudad1);
                        matriz.D.add(ciudad2);
                        matriz.D.addEdge(ciudad1, ciudad2, distancia);
                    }
                }
                matriz.caminoCorto();
                matriz.D.show();
            }
       
            System.out.println("1. Buscar ruta mas corta entre dos ciudades ");
            System.out.println("2. Nombre de la ciudad en el centro del grafo");
            System.out.println("3. Modificar grafo");
            System.out.println("4. Finalizar programa");
            seleccion = scan.nextInt();
        }
        
    }
}
