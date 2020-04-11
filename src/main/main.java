/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author CruzArdila
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Crear la matriz
        int matriz1[][] = new int [5][5];
        int matrizFinal[][] = new int [5][5];
        //Captura de valores de la Matriz de forma aleatoria.
        System.out.println("Los números signados para la matriz son: ");
        for(int x = 0;x < matriz1.length;x++){
            for(int y = 0;y < matriz1.length;y++){                   
                int numero = (int)(Math.random()*101);
                matriz1[x][y]=numero;
                matrizFinal[x][y]=matriz1[x][y];
                System.out.print(matriz1[x][y]+ "|");
               }
        }
         System.out.println("");
            for(int x = 0;x < matriz1.length;x++){
                for(int y = 0;y < matriz1.length;y++){
                    System.out.print(matrizFinal[x][y]+ "|");
                }
            }
    }
    
}
