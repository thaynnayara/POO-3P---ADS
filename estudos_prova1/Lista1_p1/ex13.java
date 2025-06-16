// Fazer um programa para ler três medidas A, B e C. Em seguida, calcular e mostrar
// (imprimir os dados com quatro casas decimais):
// a) a área do quadrado que tem lado A
// b) a área do triângulo retângulo que base A e altura B
// c) a área do trapézio que tem bases A e B, e altura C

//%.4f%n

import java.util.Scanner;

public class ex13 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double a, b, c, areaQua, areaTra, areaTri;

        System.out.println("Escreva valores para A, B e C, respectivamente: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();   
        
        areaQua = a * a;
        areaTri = (a * b) / 2;
        areaTra = ((a + b) * c) / 2;

        String areaQuaF = String.format("%.4f%n", areaQua);
        String areaTriF = String.format("%.4f%n", areaTri);
        String areaTraF = String.format("%.4f%n", areaTra);

        System.out.println("ÁREA QUADRADO: " + areaQuaF);
        System.out.println("ÁREA TRIÂNGULO: " + areaTriF);
        System.out.println("ÁREA TRAPÉZIO: " + areaTraF);

    }
}
