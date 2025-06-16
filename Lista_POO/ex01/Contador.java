package ex01;

// Exercício Contador
// a. Criar uma classe Contador que encapsule um valor usado para a contagem de
// itens ou eventos. A classe deve conter métodos que devem:
// b. Zerar o contador;
// c. Incrementar o contador em uma unidade;
// d. Retornar o valor do contador;
// e. O programa deve instanciar objetos da classe Contador e utilizar seus
// métodos.

public class Contador {

    private int valor;

    public Contador() {
        this.valor = 0;
    }

    public void zerar() {
        this.valor = 0;
        System.out.println("Contador zerado.");
    }

    public void incrementar() {
        this.valor++;
    }

    public int getValor() {
        return this.valor;
    }
}