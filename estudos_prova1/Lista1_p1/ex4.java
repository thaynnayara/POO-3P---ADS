

// Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência
// de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
// (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário
// informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código
// (até que seja válido). O programa será encerrado quando o código informado for o
// número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem como as
// quantidades de cada combustível.

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo, alcool = 0, gasolina = 0, diesel = 0;

        System.out.println("------------- TABELA DE PREFERÊNCIA --------------");
        System.err.println();
        System.out.println("1.Álcool");
        System.out.println("2.Gasolina");
        System.out.println("3.Diesel");
        System.out.println("4.Fim");

        while (true) {
            
            //exibirTabela();
            System.err.print("Digite o combústivel abastecido: ");
            codigo = sc.nextInt();
    
            if (codigo == 1) {
                System.out.println("Opção escolhida: Álcool");
                alcool++;

            } else if (codigo == 2){
                System.out.println("Opção escolhida: Gasolina");
                gasolina++;

            } else if (codigo == 3){
                System.out.println("Opção escolhida: Diesel");
                diesel++;

            } else if (codigo == 4){
                System.out.println("MUITO OBRIGADA!");
                break;
            } else{
                System.out.println("Digite outro número que seja válido de 1 a 4, sendo 4 para sair!");
            }

        }

        System.out.println();
        System.out.println("Quantidade de Álcool: " + alcool);
        System.out.println("Quantidade de Gasolina: " + gasolina);
        System.out.println("Quantidade de Diesel: " + diesel);
        sc.close();
    }

    //metodo para exibir tabela
    // private static void exibirTabela() {

    //     System.out.println("------------- TABELA DE PREFERÊNCIA --------------");
    //     System.out.println();
    //     System.out.println("1. Álcool");
    //     System.out.println("2. Gasolina");
    //     System.out.println("3. Diesel");
    //     System.out.println("4. Fim");
    //     System.out.println();

    // }
}
