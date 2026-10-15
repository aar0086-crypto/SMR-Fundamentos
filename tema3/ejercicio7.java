package tema3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Horas");
       int Horas = sc.nextInt();

       
       System.out.println("Precio");
       int Precio = sc.nextInt(); 

       System.out.println("Salario Semanal: " + (Horas*Precio));
    }
}
