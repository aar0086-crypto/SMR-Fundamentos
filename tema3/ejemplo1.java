package tema3;

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String Nombre = sc.nextLine();

        System.out.print("Edad: ");
        int Edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime tu inicial ");
        char inicial = sc.nextLine().charAt(0);

        System.err.println(" Hola " + Nombre + " tiene " + Edad + " años ");
        System.out.println("Tu inicial es: " + inicial);

        

    }
}

