package tema4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer Numero");
        int num1 = sc.nextInt();

        System.out.println("SSegundo numero");
        int num2 = sc.nextInt();

        double media = num1/num2;

        System.out.println("La media es: " + media );
    }
}
