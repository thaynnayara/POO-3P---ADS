package ex02;

public class TesteLampada {
    
    public static void main(String[] args) {
        
        Lampada lampadaDaSala = new Lampada();

        lampadaDaSala.observar();

        lampadaDaSala.ligar();
        lampadaDaSala.observar();

        lampadaDaSala.desligar();
        lampadaDaSala.observar();
    }
}
