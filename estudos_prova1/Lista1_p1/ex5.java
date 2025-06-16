// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar
// (imprimir os dados com quatro casas decimais):
// a) a área do quadrado que tem lado A
// b) a área do triângulo retângulo que base A e altura B
// c) a área do trapézio que tem bases A e B, e altura C

import java.util.Scanner;

public class ex5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double A, B, C, areaQ;

        System.out.println("Digite a medida de A: ");
        A = sc.nextDouble();

        System.out.println("Digite a medida de B: ");
        B = sc.nextDouble();

        System.out.println("Digite a medida de C: ");
        C = sc.nextDouble();

        //area do quadrado
        areaQ = A * A;

        
        //area do triangulo retangulo
        areaTR = 


        System.out.println("a) a área do quadrado que tem lado A: " + areaQ);
        System.out.println("b) a área do triângulo retângulo que base A e altura B: ");
        System.out.println("c) a área do trapézio que tem bases A e B, e altura C: ");


    }
}
