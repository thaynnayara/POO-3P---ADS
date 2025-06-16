// Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme
// exemplo.

import java.util.Scanner;

public class ex9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num, resultado;

        System.err.println("Escreva um número: ");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            resultado = num * i;
            System.err.println(num + " x " + i + " = " + resultado);

        }

        sc.close();
    }
}
