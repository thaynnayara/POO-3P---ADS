import java.util.Scanner;

public class codigo3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.next();
        sc.nextLine();

        System.out.print("Digite um nome composto: ");
        String nome = sc.nextLine();

        System.out.print("Digite uma idade: ");


        System.out.print("Digite um número: ");
        int valor = sc.nextInt();

        System.out.println("Idade: ", idade);
        System.out.println("Nome composto: ", nome);
        System.out.println("Palavra: ", palavra);
        System.out.println("Valor: ", valor);
    }
}   