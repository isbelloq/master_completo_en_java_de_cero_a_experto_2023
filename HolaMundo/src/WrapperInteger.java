public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObject = intObjeto.shortValue();
        System.out.println("shortObject = " + shortObject); // Perdida de info, fuera del limite de Short

        Byte byteObject = intObjeto.byteValue();
        System.out.println("byteObject = " + byteObject); // Perdida de info, fuera del limite de Byte

        Long longObject = intObjeto.longValue();
        System.out.println("longObject = " + longObject);

    }
}