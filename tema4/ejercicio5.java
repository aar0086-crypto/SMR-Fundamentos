package tema4;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primer Numero");
        String n1 = sc.nextLine();

        System.out.println("Segundo Numero");
        String n2 = sc.nextLine();

        int numero = Integer.parseInt(n1);
        int numero2 = Integer.parseInt(n2);

        System.out.println("La Suma es: " + (numero + numero2));
    }
}
