package tema5;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu edad");
        int numero = sc.nextInt();

        if (numero >=18) {
            System.out.println("Puede entrar");
        }
        else {
            System.out.println("No puede entrar");    
        }
            
        
    }
}
