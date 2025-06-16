package Prova1;

import java.util.Scanner;

// Faça um programa que leia um vetor de 10 posições. Verifique se existem valores iguais e os
// escreva na tela

public class P_ex03 {    


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        
        
        System.out.println("Digite 10 valores:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        
        boolean encontrouDuplicados = false;

        System.out.println("Valores iguais encontrados:");
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    System.out.println(vetor[i]);
                    encontrouDuplicados = true;
                    break; // Para evitar imprimir o mesmo valor várias vezes
                }
            }
        }

        if (!encontrouDuplicados) {
            System.out.println("Não foram encontrados valores iguais.");
        }

        scanner.close();
    }
}

