public class PrimitivosCaracteres {
    public static void main(String[] args){
        char caracter = '\u0040'; //solo 1 caracter, de tipo unicode
        char decimal = 64;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal: " + (decimal == caracter));

        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter: " + (simbolo == caracter));

        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("char corresponde en byte =" + System.lineSeparator() + Character.BYTES);
        System.out.println("char corresponde en bites  = " + System.getProperty("line.separator") + Character.SIZE);
        System.out.println("Character.MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: " + Character.MIN_VALUE);
    }
}