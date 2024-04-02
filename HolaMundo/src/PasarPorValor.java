public class PasarPorValor{
    public static void main(String[] arg){

        int i = 10;
        System.out.println("Iniciamos el método main con i = " + i);
        test(i);
        System.out.println("Finalizamos el método main con i (se mantiene igual)= " + i);
    }

    public static void test(int i){
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finalizamos el método test con i = " + i);
    }
}