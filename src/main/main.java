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
         
        int suma = 0;
        float promedio = 0;
        for(int r =0; r < matriz1.length; r++){
            for(int t = 0;t < matriz1.length; t++){
                suma = suma + matriz1[r][t];
            }
        }
        promedio = suma/25;
        System.out.println("/***************************************************/");
        System.out.println("El promedio de la Matriz es: ");
        System.out.printf("%.2f", +promedio);
        System.out.println("");
        System.out.println("/***************************************************/");
     
    int mayor = 0, contador = 0;
    for(int k = 0; k < matriz1.length; k++){
        for(int n = 0; n < matriz1.length; n++){
            if(matriz1[k][n] == mayor){
                contador++;                  
            }
            if(matriz1[k][n]>mayor){                
                mayor=matriz1[k][n]; 
           
            }
        }
    }
    System.out.println("/*******************************************************/");
    System.out.println("El numero mayor es " +mayor);
    System.out.println("El número " +mayor+ " se repite " +contador+ " veces");
    System.out.println("/*******************************************************/");
    }
     
}
