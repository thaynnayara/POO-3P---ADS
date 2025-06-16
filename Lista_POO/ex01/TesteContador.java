package ex01;
public class TesteContador {

    public static void main(String[] args) {

        Contador meuContador = new Contador();

        System.out.println("Valor inicial: " + meuContador.getValor());

        meuContador.incrementar();
        meuContador.incrementar();
        System.out.println("Valor após 2 incrementos: " + meuContador.getValor());

    }
}   