package AULAS;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo3 {

    public static final double PI = 3.14159;
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o raio: ");
        double raio = input.nextDouble();

        double c = circunferencia(raio);

        double v = volume(raio);

        System.out.printf("O valor de PI: %.2f", PI);
        System.out.printf("O valor da circunferencia: %.2f", c);
        System.out.printf("O valor do volume: %.2f", v);
        
    }

    public static double circunferencia(double raio){
        return 2.0 * PI * raio;

    }

    public static double volume(double raio){
        return 4.0 * PI * raio * raio * raio / 3.0;
        return 4.0 * PI * Math.pow(raio, 3) / 3.0;
    }
}