// Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela
// esta duração no formato horas:minutos:segundos.

import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int segundosTotais, segundos, minutos, horas;

        System.out.println("Digite a duração em segundos: ");
        segundosTotais = sc.nextInt();

        horas = segundosTotais / 3600;
        minutos = (segundosTotais % 3600) / 60;
        segundos = segundosTotais % 60; 

        
        System.out.println(horas + ":" + minutos + ":" + segundos);
        
        sc.close();
    }
}
