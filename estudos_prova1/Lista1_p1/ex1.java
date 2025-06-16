import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
       
        double notaP1, notaP2, notaS1, notaS2;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------PRIMEIRO SEMESTRE---------------");
        System.out.println();

        System.out.print("Digite a primeira nota: ");
        notaP1 = sc.nextDouble(); 
        System.out.println();

        System.out.print("Digite a segunda nota: ");
        notaP2 = sc.nextDouble();
        System.out.println();

        System.out.println("-------------SEGUNDO SEMESTRE---------------");
        System.out.println();

        System.out.print("Digite a primeira nota: ");
        notaS1 = sc.nextDouble(); 
        System.out.println();
        
        System.out.print("Digite a segunda nota: ");
        notaS2 = sc.nextDouble();

        double notaFinal = (notaP1 + notaP2 + notaS1 + notaS2) / 4;

        if (notaFinal < 60.0) {
            System.out.println("REPROVADO");
        } else {
            System.out.println("APROVADO");
        }
        
        System.out.println("Nota final: " + notaFinal);
    
        sc.close(); //----lembrar de fechar o Scanner
    } 
}