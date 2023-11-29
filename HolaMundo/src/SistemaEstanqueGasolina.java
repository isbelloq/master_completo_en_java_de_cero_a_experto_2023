import java.util.Scanner;

public class SistemaEstanqueGasolina{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los litros de gasolina:");
        double litrosEstanque = scanner.nextDouble();

        if (litrosEstanque == 70d){
            System.out.println("Estanque lleno");
        } else if ((litrosEstanque < 70d) && (litrosEstanque >= 60d)) {
            System.out.println("Estanque casi lleno");
        } else if ((litrosEstanque < 60d) && (litrosEstanque >= 40d)) {
            System.out.println("Estanque  3/4");
        } else if ((litrosEstanque < 40d) && (litrosEstanque >= 35d)) {
            System.out.println("Medio Estanque");
        } else if ((litrosEstanque < 35d) && (litrosEstanque >= 20d)) {
            System.out.println("Suficiente");
        } else if ((litrosEstanque < 20) && (litrosEstanque >= 1d)) {
            System.out.println("Insuficiente");
        }

    }
}