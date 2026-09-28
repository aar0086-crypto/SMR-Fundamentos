package tema2;

public class ejemplo1 {
    public static void main(String[] args) {
        int Entero1;
        int Entero2;
        boolean Correcto;
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;
        int resultadoDivision;

        Entero1 = 1;
        Entero2 = 2;
        Correcto = false;
        resultadoSuma = Entero1 + Entero2;
        resultadoResta = Entero1 - Entero2;
        resultadoMultiplicacion = Entero1 * Entero2;
        resultadoDivision = Entero1 / Entero2;

        Correcto = (resultadoSuma > resultadoResta) && false; 

        System.out.println("--Entero1:" + Entero1);
        System.out.println("--Entero2:" + Entero2);
        System.out.println("--Correcto:" + Correcto);
        System.out.println("--resultadoSuma:" + resultadoSuma);
        System.out.println("--resultadoResta:" + resultadoResta);
        System.out.println("--resultadoMultiplicacion:" + resultadoMultiplicacion);
        System.out.println("--resultadoDivision:" + resultadoDivision);

        }
}
