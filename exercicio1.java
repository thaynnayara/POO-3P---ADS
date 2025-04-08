public class exercicio1 {

    public static void main(String[] args){

        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.5;
        double medicao = 53.234567;

        System.out.println("---Produtos---");
        System.out.println();

        System.out.printf(produto1, ", seu preço é: R$%.2f", preco1);
        System.out.println();
        System.out.printf(produto2, ", seu preço é: R$%.2f", preco2);

        System.out.println();
        System.out.printf("Record: ", idade, ", código ", codigo, " e genero ", genero);
        System.out.println();

        System.out.printf("Medição com oitos casas decimais: %.8f", medicao);
        System.out.println();
        System.out.printf("Medição com três casas decimais: %.3f", medicao);
    }
}