package tema7;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Café   b) Té   c) Zumo");
        char opcion = sc.next().charAt(0);


        double precio = 0;

        switch (opcion) {
            case 'a':
                precio = 1.2;
                System.out.println("Has elegido Café");
                break;
            case 'b':
                precio = 1;
                System.out.println("Has elegido Té");
                break;
            case 'c':
                precio = 2;
                System.out.println("Has elegido Zumo");
                break;
            default:
                System.out.println("Opción incorrecta");
        }

        System.out.println("El precio final es " + precio);

    }
}
