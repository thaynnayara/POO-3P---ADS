package ex03;

// Exercício Conta
// a. Criar uma classe Conta que contenha o nome do cliente, o número da conta e
// o saldo. Estes valores deverão ser informados no construtor da classe;
// b. Criar um método depositar e um método sacar para realizar o depósito e o
// saque de valores da conta;
// c. O programa deve instanciar objetos da classe Conta e utilizar seus métodos.

public class Conta {
    
    private String nomeCliente;
    private String numeroConta;
    private double saldo;

    public Conta(String nomeCliente, String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + "realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saque não realizado. saldo insuficiente ou valor inválido");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual da conta " + this.numeroConta + ": R$" + this.saldo);
    }
    
}
