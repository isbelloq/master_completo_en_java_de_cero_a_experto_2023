public class EjemploString{
    public static void main(String[] args){
        String curso = "Programación Java";
        String curso2 = new String("programación java");

        boolean esIgual = curso == curso2; //comparacion de referencia
        System.out.println("curso == curso2 = " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2); // comparacion por elementos
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);
    }
}