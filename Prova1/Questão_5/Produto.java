package Prova1.Questão_5;

public class Produto {
    
    // b. Atributos do Produto
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos para acessar os dados (Getters)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " | Preço Unitário: R$" + String.format("%.2f", preco);
    }
}

