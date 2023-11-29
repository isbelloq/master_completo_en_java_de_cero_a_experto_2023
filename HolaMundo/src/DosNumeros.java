import java.util.Scanner;

public class DosNumeros{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese otro numero numero: ");
        int numero2 = scanner.nextInt();

        String mensaje = "El orden de los numero de mayor a menor es: ";

        mensaje = numero1 > numero2 ? mensaje + numero1 + ", " + numero2 : mensaje + numero2 + ", " + numero1;

        System.out.println(mensaje);
    }
}