public class PrimitivosBoolean{
    public static void main(String[] args){
        boolean datoLogicoLiteral = false;
        boolean datoLogicoInstancia = Boolean.TRUE;
        System.out.println("datoLogicoLiteral = " + datoLogicoLiteral);
        System.out.println("datoLogicoInstancia = " + datoLogicoInstancia);

        double d = 98765.43e-3; //98.76543
        System.out.println("d = " + d);

        float f = 1.2345e2f; //123.45
        System.out.println("f = " + f);

        boolean datoLogico;
        datoLogico = d < f;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3-3 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}