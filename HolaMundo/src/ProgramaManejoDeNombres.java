import java.util.Scanner;

public class ProgramaManejoDeNombres{
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        StringBuilder resultado = new StringBuilder();

        for(int i = 0; i < 3; i++){
            System.out.print("Ingrese el nombre " + (i+1) + ": ");
            String nombre = scanner.next();
            int l = nombre.length();
            resultado.append(nombre.substring(1,2).toUpperCase()).append(".").append(nombre.substring(l-2,l).toLowerCase()).append("_");
        }
        int l = resultado.length();

        System.out.println(resultado.substring(0, l-1));
    }
}