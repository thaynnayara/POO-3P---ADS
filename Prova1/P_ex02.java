package Prova1;
import java.util.Scanner;

// Faça um programa que leia uma matriz 5x5. Calcule a soma dos elementos dessa matriz que
// pertencem à diagonal principal ou secundária. Calcule também a soma dos elementos que não
// pertencem a nenhuma das duas diagonais. Imprima na tela a diferença entre os dois valores.

public class P_ex02 {

    public class CalculoMatriz {

    public static void main(String[] args) {
    

        final int tamanho = 5;

        int[][] matriz = new int[tamanho][tamanho];
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 5x5:");
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz Digitada:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Pula para a próxima linha
        }

        int somaDiagonais = 0;
        int somaNaoDiagonais = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                
                // Condição para a diagonal principal: linha == coluna (ex: [0][0], [1][1])
                // Condição para a diagonal secundária: linha + coluna == tamanho - 1 (ex: [0][4], [1][3])
                
                if (i == j || (i + j) == (tamanho - 1)) {
                    somaDiagonais += matriz[i][j];
                } else {
                    somaNaoDiagonais += matriz[i][j];
                }
            }
        }

        int diferenca = somaDiagonais - somaNaoDiagonais;

        System.out.println("\n--- Resultados ---");
        System.out.println("Soma dos elementos das diagonais (principal + secundária): " + somaDiagonais);
        System.out.println("Soma dos elementos que NÃO pertencem às diagonais: " + somaNaoDiagonais);
        System.out.println("\nDiferença (Soma Diagonais - Soma Não Diagonais): " + diferenca);

        
        scanner.close();
    }
}

}
