package tema6;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la edad: ");
        int edad1 = sc.nextInt();

        if (edad1 >=0 && edad1 <=11) {
            System.out.println("Niño");
            
        } else if (edad1 >=12 && edad1 <=17) {
            System.out.println("Adolescente");
            
        } else if (edad1 >=18 && edad1 <=64) {
            System.out.println("Adulto");
            
        } else  {
            System.out.println("Mayor");
            
        }

        
        
            
        }
            
        }    
            
        
      