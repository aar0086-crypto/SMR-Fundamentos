package tema5;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        final double DESCUENTO = 0.10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu importe:");
        double importe = sc.nextDouble();
        double total = importe - (importe*DESCUENTO);

        if (importe > 100) {
           System.out.println("El precio con descuento es " + total);
        }
        else {
        System.out.println("el precio final es " + importe);


        }

    }
}
