package tema3;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Radio");
       double radio = sc.nextDouble();

       final double PI = 3.14159;

       double area = radio*radio*PI;
       System.out.println("El area del circulo es:" + area);
    }
}
