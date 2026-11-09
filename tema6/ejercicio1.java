package tema6;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero: ");
        int num1 = sc.nextInt();

        if (num1 >=1) {
            System.out.println(num1 + " Positivo");
        }
        else if (num1<0) {
            System.out.println(num1 + "Negativo");
        }

        else  {
            System.out.println(num1 + " cero");
            
        }
            
        }
    }

