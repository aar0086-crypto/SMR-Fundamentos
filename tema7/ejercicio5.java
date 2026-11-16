package tema7;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoge el idioma ");
        String idioma = sc.nextLine();


        switch (idioma) {
            case "es":
                System.out.println("Hola");
                break;

            case "en":
                System.out.println("Hello");
                break;

            case "fr":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Idioma no válido");
                break;
        }
    }
}
