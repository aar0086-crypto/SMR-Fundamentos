package tema3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Pesetas");
       double pesetas = sc.nextDouble();

       final double Cambio = 166.386;

       double euros = pesetas/Cambio;
       System.out.println(pesetas + "pesetas son " + euros + ("euros"));
    }
    }

