package ex03;

public class TesteConta {
    

    public static void main(String[] args) {
        
        Conta contaDaThaynna = new Conta("Thaynná Yara", "1111-1", 15000);

        contaDaThaynna.exibirSaldo();
        System.out.println();

        contaDaThaynna.depositar(500.00);
        contaDaThaynna.exibirSaldo();
        System.out.println();

        contaDaThaynna.sacar(200.00);
        contaDaThaynna.exibirSaldo();
        System.out.println();

        contaDaThaynna.sacar(2000.00);
        contaDaThaynna.exibirSaldo();
        System.out.println();
    }
}
