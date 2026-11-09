package tema5;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1 = sc.nextInt();

        if (num1 >= 0) {
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
            
        }

    }
}
