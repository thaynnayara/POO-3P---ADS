package Prova1.Questão_4;

import java.util.Scanner;

// A implementação consiste em desenvolver uma classe que representa o livro de notas de uma
// curso, a funcionalidade de cada método será descrita abaixo:
// a. MostraMensagem(): Apresenta uma mensagem de boas vindas e informa o nome do
// curso ao qual o livro pertence;
// b. CalculaMediaClasse(): O método calcula a média de 10 notas informado pelo o
// usuário, (as escalas de notas são de 0-100);
// c. CalculaConceito(nota: float): O método recebe uma nota via parâmetro e retorna
// qual conceito da nota de acordo com a tabela

public class LivroNotas {
    private String nomeCurso;

    public LivroNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    
    public void mostraMensagem() {
        System.out.println("Bem-vindo ao livro de notas do curso: " + this.nomeCurso);
    }

    public void calculaMediaClasse() {
        Scanner sc = new Scanner(System.in);
        float somaTotal = 0;
        int totalNotas = 10;

        System.out.println("Por favor, informe as " + totalNotas + " notas da classe (escala de 0 a 100):");

        
        for (int i = 0; i < totalNotas; i++) {
            System.out.print("Informe a nota " + (i + 1) + ": ");
            float nota = sc.nextFloat();
            somaTotal += nota;
        }

        double media = somaTotal / totalNotas;
        
        System.out.printf("A média da classe é: %.2f\n", media);
        
    }

    public char calculaConceito(float nota) {
        if (nota >= 95 && nota <= 100) {
            return 'A';
        } else if (nota >= 80 && nota <= 94) {
            return 'B';
        } else if (nota >= 60 && nota <= 79) {
            return 'C';
        } else if (nota >= 40 && nota <= 59) {
            return 'D';
        } else if (nota >= 20 && nota <= 39) {
            return 'E';
        } else if (nota >= 0 && nota <= 19) {
            return 'F';
        } else {
            return 'X'; // Retorno para nota inválida
        }
    }
}

