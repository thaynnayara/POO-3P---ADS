import java.util.Locale;

public class aula2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        int x = 32;
        float y = 32.25f;
        double salario = 2500.45;

        System.out.printf("O salário é: %.2f", salario);
        System.out.println(x);
        System.out.println(y);

    }
}