
// Fazer um programa para ler as medidas da largura e comprimento de um terreno
// retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
// com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
// terreno, bem como o valor do preço do terreno, ambos com duas casas decimais,
// conforme exemplo.

import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        Double largura, comprimento, valorMetroQua, area, precoTerreno;
        
        System.out.println("Digite a largura do terreno:");
        largura = sc.nextDouble();
        
        System.out.println("Digite o comprimento do terreno:");
        comprimento = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado:");
        valorMetroQua = sc.nextDouble();

        area = largura * comprimento;

        precoTerreno = area * valorMetroQua;

        System.out.printf("Área do terreno: %.2f m²%n", area);

        System.out.printf("Preço total do terreno: R$ %.2f%n", precoTerreno);


        sc.close();
    }
}
