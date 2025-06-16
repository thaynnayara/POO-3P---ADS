// Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para
// cada X e Y uma mensagem que indique se estes valores foram digitados em ordem
// crescente ou decrescente. O programa deve finalizar quando forem digitados dois
// valores iguais.

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = 0,y = 0;

        while (x != y) {
            
            System.out.println("Digite um valor para 'x': ");
            x = sc.nextInt();

            System.out.println("Digite um valor para 'y': ");
            y = sc.nextInt();

            if (x < y) {
                System.out.println("CRESCENTE");
            }else{
                System.out.println("DECRESCENTE");
            }

        }

        sc.close();

    }
}
