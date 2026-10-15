package tema3;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Cantidad en euros:");
       double cantidad1 = sc.nextDouble();

       final double cambio1 = 1.10;
       double dolares = cantidad1*cambio1;

       System.out.println("El precio en dolares es: " + dolares );
    }
}
