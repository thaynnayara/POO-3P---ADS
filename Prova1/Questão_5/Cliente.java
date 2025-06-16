package Prova1.Questão_5;

import java.util.ArrayList;

public class Cliente {

    // a. Atributos do Cliente
    private String nome;
    private String email;
    private String cpf;
    private String endereco;
    
    // c, d. Carrinho de compras vinculado ao cliente
    private ArrayList<Produto> carrinho;

    // e. Variável estática para controlar o total de contas criadas
    private static int totalContasCriadas = 0;

    public Cliente(String nome, String email, String cpf, String endereco) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.carrinho = new ArrayList<>(); // O carrinho é iniciado vazio
        totalContasCriadas++; // Incrementa o contador a cada novo cliente
    }

    // Métodos para acessar os dados (Getters)
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public ArrayList<Produto> getCarrinho() {
        return carrinho;
    }

    // Método estático para obter o total de contas
    public static int getTotalContasCriadas() {
        return totalContasCriadas;
    }
    
    // Métodos para manipular o carrinho
    public void adicionarProdutoAoCarrinho(Produto produto) {
        this.carrinho.add(produto);
    }
    
    public void removerUltimoProdutoDoCarrinho() {
        if (!this.carrinho.isEmpty()) {
            this.carrinho.remove(this.carrinho.size() - 1);
        }
    }
}

