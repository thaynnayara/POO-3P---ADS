import java.util.Scanner;

public class aula4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int numero = 0;
        int soma = 0;

        System.out.print("Digite o valor N: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numero = sc.nextInt();
            soma += numero;

        }

        System.out.print("Soma: " + soma);
        sc.close();
    }
}
