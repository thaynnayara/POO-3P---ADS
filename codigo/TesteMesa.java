package codigo;

import java.util.Scanner;

public class TesteMesa {
    
    public static void main(String[] args) {
        
        java.util.Scanner sc = new Scanner(System.in);
        int x = 2;
        int y = 0;

        while (x < 60 ) {
            System.out.println(x);
            x = x * 2;
            y = y + 10;

        }

        sc.close();
    }
}
