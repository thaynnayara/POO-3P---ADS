package Jogo_da_Velha;

public class JogoDaVelha {
    
    public static char[][] = new char[3];
    public static char jogadorAtual = 'X';

    public static void main(String[] args) {
        
        inicializarTabu();
        exibirTabuleiro();

        while (true) {
            jogada();
            exibirTabuleiro();

            if (verificarVitoria) {
                System.out.println("Jogador " + jogadorAtual + " venceu!");
                break;
            }

            if (verificarEmpate) {
                System.out.println("empatou!");
                break;
            }

            


        }
    }
}
