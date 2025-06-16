package codigo;
import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double x1, x2, a = 0, b = 0, c = 0; 

        System.out.println("Digite o a: ");
        a = sc.nextDouble();
        System.out.println();


        System.out.println("Digite o b: ");
        b = sc.nextDouble();
        System.out.println();
        
        System.out.println("Digite o c: ");
        c = sc.nextDouble();
        System.out.println();

        double delta = Math.pow(b, 2.0) - 4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2.0* a);
        x2 = (-b - Math.sqrt(delta)) / (2.0* a);

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println();

        System.out.println("O delta correspondentes é: ");
        System.out.println(delta);
        System.out.println();

        System.out.println("Os Xs correspondentes são: ");
        System.out.println(x1);
        System.out.println(x2);
        
        sc.close();
    }
}
