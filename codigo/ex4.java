package codigo;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        
        java.util.Scanner sc = new Scanner(System.in);
        int numero = 1;
        int soma = 0;

        while (numero != 0 ) {
            System.out.println("Digite um número: (ou 0 para sair): " );
            numero = sc.nextInt();
            //soma = soma + numero;
            soma += numero;

        }

        System.out.println("Soma: " + soma);
        sc.close();
    }
}
