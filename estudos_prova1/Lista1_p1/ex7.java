// Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para
// cada leitura de senha incorreta informada, escreva a mensagem "Senha Inválida! Tente
// novamente:". Quando a senha for informada corretamente deve ser impressa a
// mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta
// é o valor 2002.

import java.util.Scanner;

public class ex7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senhainformada, senhacorreta;
        senhacorreta = 2002;

        while (true) {
        
            System.out.println("Informe uma senha:");
            senhainformada = sc.nextInt();


            if (senhacorreta == senhainformada) {
                System.out.println("Senha correta! ");
                break;
                
            } else {
                System.out.println("Senha incorreta!");
                System.out.println("Tente de novo: ");
            }

            
        }


        sc.close();
    }
}
