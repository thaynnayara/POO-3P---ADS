package ex04;

public class TesteElevador {
    
    public static void main(String[] args) {
        
        Elevador elevadorSocial = new Elevador(5, 10);

        elevadorSocial.status();

        elevadorSocial.entrar();
        elevadorSocial.entrar();
        elevadorSocial.subir();
        elevadorSocial.subir();
        elevadorSocial.subir();

        elevadorSocial.status();

        elevadorSocial.sair();
        elevadorSocial.descer();
        
        elevadorSocial.status();

        elevadorSocial.descer();
        elevadorSocial.descer();
        elevadorSocial.descer();//erro pois já está no primeiro andar
    }
}
