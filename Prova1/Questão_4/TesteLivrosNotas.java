package Prova1.Questão_4;

import java.util.Scanner;

public class TesteLivrosNotas {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        LivroNotas meuLivroNotas = new LivroNotas("Programação Orientada Objeto");

        System.out.println("----------- Testando o método mostrarMensagem() -------");
        meuLivroNotas.mostraMensagem();
        System.out.println();
        System.out.println("------------------------");

        System.out.println("------------- Testando o método calculaMediaClasse -------");
        meuLivroNotas.calculaMediaClasse();
        System.out.println();
        System.out.println("-------------------------");

        System.out.println("--- Testando o método calculaConceito() ---");
        System.out.print("Digite uma nota avulsa para verificar o conceito: ");
        float notaParaTeste = sc.nextFloat();

        char conceitoRecebido = meuLivroNotas.calculaConceito(notaParaTeste);

        System.out.println("O conceito para a nota " + notaParaTeste + " é: " + conceitoRecebido);
        System.out.println("------------------------");

        sc.close();
    
    }
}
