package tema3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Base");
       int Base = sc.nextInt();

       
       System.out.println("Altura");
       int Altura = sc.nextInt();

       System.out.println("El área es: " + (Base*Altura)/2);
    }
}
