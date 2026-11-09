package tema5;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota: ");
        double nota1 = sc.nextDouble();

        if (nota1 >=5) {
            System.out.println(nota1 + " aprobado");

        }
        else {
            System.out.println(nota1 + " suspenso");
            
        }
    }
}
