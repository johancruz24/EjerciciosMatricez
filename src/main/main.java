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
         
        //Lineas para calcular promedio de los elementos de la matriz
        int suma = 0;
        float promedio = 0;
        for (int[] matriz11 : matriz1) {
            for (int t = 0; t < matriz1.length; t++) {
                suma = suma + matriz11[t];
            }
        }
        promedio = suma/25;
        System.out.println("/***************************************************/");
        System.out.println("El promedio de la Matriz es: ");
        System.out.printf("%.2f", +promedio);
        System.out.println("");
        System.out.println("/***************************************************/");
     
        //Lineas para calcular mayor de la matriz y las veces que se repite
        int mayor = 0, contador = 0;
        for (int[] matriz11 : matriz1) {
            for (int n = 0; n < matriz1.length; n++) {
                if (matriz11[n] == mayor) {
                    contador++;                  
                }
                if (matriz11[n] > mayor) {
                    mayor = matriz11[n];
                }
            }
        }
        System.out.println("/*******************************************************/");
        System.out.println("El numero mayor es " +mayor);
        System.out.println("El número " +mayor+ " se repite " +contador+ " veces");
        System.out.println("/*******************************************************/");
        
        //Lineas para calcular los números primos dentro de la matriz
        System.out.println("/***************************************************/");
        System.out.println("Los números primos que se encuentran en la matriz son ");
        for(int[]matriz11: matriz1){
            for(int a = 0; a < matriz1.length; a++){
                int aux = 0;
                for(int b = 1; b < (matriz11[a]+1); b++){
                    if(matriz11[a] % b == 0){
                        aux++;
                    }
                }if(aux == 2){
                    System.out.print(matriz11[a]+ "|");
                    }                    
            }
        }
        System.out.println("");
        System.out.println("/***************************************************/");
        }
     
}
