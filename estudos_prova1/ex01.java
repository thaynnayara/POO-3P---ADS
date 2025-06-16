package estudos_prova1;

import java.util.Random;

public class ex01 {
    
    static int [][] criaMatriz(int N, int M){
        int [][] matriz = new int[N][M];
        Random gerador = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = gerador.nextInt(100);

            }
        }
        return matriz;
    }

    static vois imprimeMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    // static void main(String[] args){
        
    //     for (int i = 0; i < matriz.length; i++) {
    //         for (int j = 0; j < matriz[0].length; j++) {
    //             System.out.println(matriz[i][j] + "\t");
    //         }
    //         System.out.println("\n");
    //     }
    // }

    static int [][] transposta(int [][] matriz){
        int [][] matrizTransposta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matrizTransposta.length; i++) {
            for (int j = 0; j < matrizTransposta[0].length; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }
        return matrizTransposta;
    }

    public static void main(String[] args){
        int [][] matriz = criaMatriz(3, 4);
        System.out.println();
        int [][] transposta = transposta(matriz);
        imprimeMatriz(transposta);
    }
}
