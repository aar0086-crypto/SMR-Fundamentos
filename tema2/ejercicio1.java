package tema2;

public class ejercicio1 {
    public static void main(String[] args) {
        int Numero1 = 10; 
        int Numero2 = 5;
        int resultadoSuma;
        int resultadoDivision;
        int resultadoMultiplicacion;
        int resultadoResta;

        resultadoSuma = Numero1 + Numero2;
        resultadoResta = Numero1 - Numero2;
        resultadoMultiplicacion = Numero1 * Numero2;
        resultadoDivision = Numero1 / Numero2;

        System.out.println("--Numero1:" + Numero1);
        System.out.println("--Numero2:" + Numero2);
        System.out.println("--resultadoSuma:" + resultadoSuma);
        System.out.println("--resultadoResta:" + resultadoResta);
        System.out.println("--resultadoMultiplicacion:" + resultadoMultiplicacion);
        System.out.println("--resultadoDivision:" + resultadoDivision);
        
    }
}
