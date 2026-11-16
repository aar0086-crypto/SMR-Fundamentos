package tema6;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad2 = sc.nextInt();

        if (edad2 <= 4) {
            System.out.println("billete gratis");
            
        } else if (edad2 <= 12 ) {
            System.err.println("Precio: 0,50 euros");
        } else if (edad2 <= 65) {
            System.out.println("Precio: 1,20 euros");
            
        } else if (edad2 <= 65) {
            System.out.println("billete gratis");
        } else
            System.out.println("edad no valida");
    }
}
