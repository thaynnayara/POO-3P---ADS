package Prova1.Questão_5;

import java.util.ArrayList;
import java.util.Scanner;

public class SoftwareBox {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Produto> listaProdutosDisponiveis = new ArrayList<>();

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarProduto();
                    break;
                case 3:
                    buscarCliente();
                    break;
                case 4:
                    adicionarProdutoNoCarrinho();
                    break;
                case 5:
                    excluirProdutoDoCarrinho();
                    break;
                case 6:
                    gerarNotaFiscal();
                    break;
                case 7:
                    System.out.println("Total de contas de clientes criadas: " + Cliente.getTotalContasCriadas());
                    break;
                case 0:
                    System.out.println("Encerrando o sistema. Obrigado por usar o compreaqui.com!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println("\nPressione Enter para continuar...");
            scanner.nextLine();

        } while (opcao != 0);
        
        scanner.close();
    }

    public static void exibirMenu() {
        System.out.println("\n--- Sistema de Vendas compreaqui.com ---");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Cadastrar produto");
        System.out.println("3. Buscar cliente");
        System.out.println("4. Adicionar produto no carrinho");
        System.out.println("5. Excluir último produto do carrinho");
        System.out.println("6. Gerar Nota Fiscal");
        System.out.println("7. Ver total de contas de clientes");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // i. Cadastro de cliente
    public static void cadastrarCliente() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        Cliente novoCliente = new Cliente(nome, email, cpf, endereco);
        listaClientes.add(novoCliente);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    // ii. Cadastro de produto
    public static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Produto novoProduto = new Produto(nome, preco, quantidade);
        listaProdutosDisponiveis.add(novoProduto);
        System.out.println("Produto cadastrado com sucesso!");
    }
    
    // iii. Buscar cliente
    public static Cliente buscarCliente() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        for (Cliente cliente : listaClientes) {
            if (cliente.getCpf().equals(cpf)) {
                System.out.println("Cliente encontrado: " + cliente.getNome());
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    // iv. Adicionar produto no carrinho
    public static void adicionarProdutoNoCarrinho() {
        Cliente cliente = buscarCliente();
        if (cliente == null) return;

        if (listaProdutosDisponiveis.isEmpty()) {
            System.out.println("Nenhum produto disponível para compra.");
            return;
        }

        System.out.println("Produtos disponíveis:");
        for (int i = 0; i < listaProdutosDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + listaProdutosDisponiveis.get(i));
        }
        
        System.out.print("Escolha o número do produto a adicionar: ");
        int escolha = scanner.nextInt() - 1;
        scanner.nextLine();

        if (escolha >= 0 && escolha < listaProdutosDisponiveis.size()) {
            Produto produtoEscolhido = listaProdutosDisponiveis.get(escolha);
            cliente.adicionarProdutoAoCarrinho(produtoEscolhido);
            System.out.println(produtoEscolhido.getNome() + " adicionado ao carrinho de " + cliente.getNome());
        } else {
            System.out.println("Escolha inválida.");
        }
    }

    // v. Excluir produto
    public static void excluirProdutoDoCarrinho() {
        Cliente cliente = buscarCliente();
        if (cliente != null) {
            cliente.removerUltimoProdutoDoCarrinho();
            System.out.println("Último produto removido do carrinho de " + cliente.getNome());
        }
    }

    // vi. Nota Fiscal
    public static void gerarNotaFiscal() {
        Cliente cliente = buscarCliente();
        if (cliente == null) return;
        
        System.out.println("\n========== NOTA FISCAL ==========");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("---------------------------------");
        
        ArrayList<Produto> carrinho = cliente.getCarrinho();
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
            System.out.println("===============================");
            return;
        }

        double valorTotalCarrinho = 0;
        for (Produto produto : carrinho) {
            // Para este exercício, vamos assumir que a quantidade comprada é 1.
            // Uma melhoria seria perguntar a quantidade no momento de adicionar ao carrinho.
            int quantidadeComprada = 1; 
            double precoTotalProduto = produto.getPreco() * quantidadeComprada;
            System.out.println("Produto: " + produto.getNome());
            System.out.println("  Qtde: " + quantidadeComprada + " x R$" + String.format("%.2f", produto.getPreco()));
            System.out.println("  Subtotal: R$" + String.format("%.2f", precoTotalProduto));
            valorTotalCarrinho += precoTotalProduto;
        }

        System.out.println("---------------------------------");
        System.out.println("VALOR TOTAL: R$" + String.format("%.2f", valorTotalCarrinho));
        System.out.println("===============================");
    }
}
