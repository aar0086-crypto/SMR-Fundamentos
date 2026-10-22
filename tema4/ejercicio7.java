package tema4;

public class ejercicio7 {
    public static void main(String[] args) {
        int edad = 19;
        boolean aprobadoTeorico = true;

        boolean puedeSacarCarnet = (edad>=18) && aprobadoTeorico;
        System.out.println("Se puede sacar el carnet: " + puedeSacarCarnet);

    }
}
