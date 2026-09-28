package tema2;


public class ejemplo0 {
    public static void main(String[] args) {
        double baseImponible = 150; 
        double iva = baseImponible * 0.21;
        double total = baseImponible + iva;

        System.out.println("BaseImponible: + baseImponible");
        System.out.println("IVA (21%): " + iva);
        System.out.println("Total: " + total);
    }
}
