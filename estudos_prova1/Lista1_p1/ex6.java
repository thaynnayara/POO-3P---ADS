// Fazer um programa para ler a quantidade de glicose no sangue de uma pessoa e
// depois mostrar na tela a classificação desta glicose de acordo com a tabela de
// referência ao lado.

import java.util.Scanner;

public class ex6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double glicose;

        System.out.println("----------- TABELA GLICOSE -------------");
        System.out.println();
        System.out.println("Classificação   | Glicose");
        System.out.println("----------------|-------------------------");
        System.out.println("Normal          | Até 100 mg/dl");
        System.out.println("Elevado         | Maior que 100 até 140 mg/dl");
        System.out.println("Diabetes        | Maior de 140 mg/dl");

        System.out.println("Digite a medida da glicose: ");
        glicose = sc.nextDouble();

        if (glicose <= 100) {
            System.out.println("Classificação: normal");
        } else if(glicose <= 140){
            System.out.println("Classificação: Elevado");
        } else{
            System.out.println("Classificação: Diabete");
        }


        sc.close();


    }
}
