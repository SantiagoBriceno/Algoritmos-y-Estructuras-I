/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvaluacionNro1;

import java.math.BigInteger;


public class MetodosCalculadores {
    
    /*1.- Suma y promedio de la diagonal secundaria\n"
                + "2.- Potencia del elemento mayor elevado al menor positivo\n"
                + "3.- Evaluar si el elemento menor positivo es primo\n"
                + "4.- División del elemento mayor entre el menor \n"
                + "5.- Elementos de la diagonal principal Ordenada de mayor a menor en\n     forma de Vector."*/
    
    public static void llenarMatrizRandom(int[][] numerosRandom, int dimension) {

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                numerosRandom[i][j] = (int) (Math.random() * (999 - (-999)) - 999);
            }
        }

    }

    public static int sumaDiagonalSecundaria(int[][] matriz, int dimension) {
        int result = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {

                if ((i + j) == (dimension - 1)) {
                    result += matriz[i][j];
                }
            }

        }

        return result;
    } // 1 ejercicio
    
    /*public static BigInteger mayorAlMenor(int menor, int mayor) {
        BigInteger mayorBi = new BigInteger("" + mayor), result;

        result = mayorBi.pow(menor);

        return result;

    }*/
    
    public static BigInteger mayorAlMenor(int[][] matriz){
        BigInteger result, mayorBi = new BigInteger("" + elementoMayorEnMatrizCuadrada(matriz, matriz.length));
        
        result = mayorBi.pow(elementoMenorPositivoEnMatrizCuadrada(matriz, matriz.length));
        return result;
    }
//2 ejercicio
    
    public static boolean elementoMenorPrimo(int[][] matriz){
        
        int menor = elementoMenorPositivoEnMatrizCuadrada(matriz, matriz.length);
        boolean esPrimo = true;
        for(int i = 2; i < menor; i++){
            if(menor % i == 0){
                esPrimo = false;
            }
        }
        return esPrimo;
    } //3 ejercicio
    
    public static double elementoMayorEntreMenor(int[][] matriz){
        double result = 0;
        result = (double) elementoMayorEnMatrizCuadrada(matriz, matriz.length) / elementoMenorEnMatrizCuadrada(matriz, matriz.length);
        return result;
    } //4 ejericcio
    
    public static String mostrarDiagonalPrincipalOrdenada(int [][] matriz){
        String r = "";
        int[] dP = diagonalPrincipal(matriz);
        ordenamientoBurbuja(dP);
        for(int i = 0; i < dP.length; i++){
            r = String.format("%5d", dP[i]) + r;
        }
        
        return r;
    } // 5 ejercicio
    
    public static int elementoMenorPositivoEnMatrizCuadrada(int[][] matriz, int dimension) {
        int menor = 999;
        
        
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                               
                if (matriz[i][j] < menor && matriz[i][j] > 0) {
                    menor = matriz[i][j];
                }

            }
        }

        return menor;
    }
    
    public static int elementoMenorEnMatrizCuadrada(int[][] matriz, int dimension){
        int menor = matriz[0][0];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }

            }
        }

        return menor;
    }

    public static int elementoMayorEnMatrizCuadrada(int[][] matriz, int dimension) {
        int mayor = 0;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == 0 && j == 0) {
                    mayor = matriz[0][0];
                } else {
                    if (matriz[i][j] >= mayor) {
                        mayor = matriz[i][j];
                    }
                }
            }
        }

        return mayor;
    }
    
    public static String mostrarDiagonalSecundaria(int[][] matriz, int dimension){
        
        String diagSecun = "";
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                if(j + i == dimension - 1){
                    diagSecun += matriz[i][j] + "  ";
                }
            }
        }
        
        return diagSecun;
    }
    
    public static int[] diagonalPrincipal(int[][] matriz){
        int[] dP = new int[matriz.length];
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                if(i == j){
                    dP[i] = matriz[i][j];
                }
            }
        }
        
        return dP;
    }
    
    private static void ordenamientoBurbuja(int[] arr){
        int i;
        
        for(i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 ; j++ ){
                
                if(arr[j] > arr[j + 1]){
                    cambiarLugar(arr, j, j + 1);
                    
                }
            }
            
        }
    }
    
    public static String mostrarMatriz(int[][] matriz){
        String result  = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                result += String.format("%-12d ", matriz[i][j]);
                
            }
            result += "\n";
        }
        return result;
    }
    
    private static void cambiarLugar(int[] arr, int indice1, int indice2){
        int aux = arr[indice1];
        arr[indice1] = arr[indice2];
        arr[indice2] = aux;
        
    }
    
    

}
