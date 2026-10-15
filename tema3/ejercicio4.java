package tema3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Numero");
       int Numero1 = sc.nextInt();

       
       System.out.println("Numero");
       int Numero2 = sc.nextInt();

       System.out.println("La suma es: " + (Numero1 + Numero2));
       System.out.println("La resta es: " + (Numero1 - Numero2));
       System.out.println("La multiplicación es: " + (Numero1 * Numero2));
       System.out.println("La división es: " + (Numero1/Numero2));
    }
}
