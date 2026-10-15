package tema3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Euros");
       double euros = sc.nextInt();

       final double Cambio = 166.386;

       double pesetas = euros*Cambio;
       System.out.println(euros + "euros son " + pesetas + ("pesetas"));
    }
}
