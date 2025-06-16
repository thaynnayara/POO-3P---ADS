package ex04;

// Exercício Elevador
// a. Criar uma classe denominada Elevador para armazenar as informações de um
// elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo =
// 0), total de andares no prédio (desconsiderando o térreo), capacidade do
// elevador e quantas pessoas estão presentes nele. A classe deve também
// disponibilizar os seguintes métodos:
// b. Construtor: que deve receber como parâmetros a capacidade do elevador e o
// total de andares no prédio (os elevadores sempre começam no térreo e vazio);
// c. Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda
// houver espaço);
// d. Sair: para remover uma pessoa do elevador (só deve remover se houver
// alguém dentro dele);
// e. Subir: para subir um andar (não deve subir se já estiver no último andar);
// f. Descer: para descer um andar (não deve descer se já estiver no térreo).

public class Elevador {
    
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public Elevador(int totalAndares, int capacidade) {
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public void entrar(){
        if (this.pessoasPresentes < this.capacidade) {
            this.pessoasPresentes++;
            System.out.println("Uma pesssoa entrou. Total: " + this.pessoasPresentes);
        } else {
            System.out.println("Elevador lotado! Não é possivel entrar");
        }
    }

    public void sair(){
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
            System.out.println("Uma pessoa saiu. Total: " + this.pessoasPresentes);
        } else {
            System.out.println("Elevador vazio! Não é possivél remover");
        }
    }

    public void subir(){
        if (this.andarAtual < this.totalAndares) {
            this.andarAtual++;
            System.out.println("Subindo para o andar " + this.andarAtual);
        } else {
            System.out.println("Não é possivel subir. Elevador no ultimo andar");
        }
    }

    public void descer(){
        if (this.andarAtual > 0) {
            this.andarAtual--;
            System.out.println("Descendo para o andar " + this.andarAtual);
        } else {
            System.out.println("Não é possivel descer. Elevador no primeiro andar");
        }
    }

    public void status() {
        System.out.println("--- Status do Elevador ---");
        System.out.println("Andar Atual: " + this.andarAtual);
        System.out.println("Pessoas a Bordo: " + this.pessoasPresentes);
        System.out.println("--------------------------");
    }
}
