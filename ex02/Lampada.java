package ex02;

// Exercício Lâmpada
// a. Criar uma classe Lâmpada que pode ser ligada e desligada. Também deve ser
// possível observar o estado da lâmpada.
// b. O programa deve instanciar objetos da classe Lampada e utilizar seus
// métodos.

public class Lampada {
    
    private boolean ligada;

    public Lampada(){
        this.ligada = false;
    }

    public void ligar(){
        this.ligada = true;
    }

    public void desligar(){
        this.ligada = false;
    }

    public void observar(){
        if (this.ligada) {
            System.out.println("A lâmpada está LIGADA");
        } else {
            System.out.println("A lâmpada está DESLIGADA");
        }
    }
}
