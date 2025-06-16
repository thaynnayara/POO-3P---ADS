// No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância
// que conseguir. Você deve criar um programa para, dadas as medidas das três
// tentativas de lançamento, informar qual foi a maior.

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double arremesso;
        double maiorArremesso = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Distância do lançamento " + i + ": ");
            arremesso = sc.nextDouble();

            
            if (arremesso > maiorArremesso) {
                maiorArremesso = arremesso;
            }
        }

        System.out.println("A maior distância do lançamento foi: " + maiorArremesso);

        sc.close();
    }
}
