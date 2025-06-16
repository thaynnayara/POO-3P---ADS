// //Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. A seguir,
// determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou Q4). Se o ponto
// estiver na origem, escreva a mensagem “Origem”. Se o ponto estiver sobre um dos
// eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

import java.util.Scanner;

public class ex12 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double x, y;

        System.out.println("Digite o valor de X e Y, respectivaamente: ");
        x = sc.nextDouble();
        y = sc.nextDouble();

        System.out.println("O valor de X: " + x);
        System.out.println("O valor de Y: " + y);

        // Origem: O ponto está na origem se X=0 E Y=0.
        // Eixo X: O ponto está sobre o Eixo X (e não na origem) se Y=0 E X=0.
        // Eixo Y: O ponto está sobre o Eixo Y (e não na origem) se X=0 E Y=0.
        // Quadrante 1 (Q1): O ponto está no Q1 se X>0 E Y>0.
        // Quadrante 2 (Q2): O ponto está no Q2 se X<0 E Y>0.
        // Quadrante 3 (Q3): O ponto está no Q3 se X<0 E Y<0.
        // Quadrante 4 (Q4): O ponto está no Q4 se X>0 E Y<0.

        if (y == 0 && x != 0) {
            System.out.println("Eixo x");
        } else if(x == 0 && y != 0){
            System.out.println("Eixo y");
        } else if (x == 0 && y ==0){
            System.out.println("Origem");
        } else if(x > 0 && y > 0){
            System.out.println("Q1");
        } else if(x < 0 && y >0){
            System.out.println("Q2");
        } else if(x < 0 && y < 0){
            System.out.println("Q3");
        } else if(x > 0 && y < 0){
            System.out.println("Q4");
        }
        
        

    }
    
}
