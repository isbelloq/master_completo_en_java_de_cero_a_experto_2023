import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes entre 1 - 12:");

        int mes = s.nextInt();
        String nombreMes = null;
        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
        }

        System.out.println("nombreMes = " + nombreMes);

        char num = 'a';
        switch (num){
            case '0':
                System.out.println("El num es cero");
                break;
            case '1':
                System.out.println("El num es uno");
                break;
            case '2':
                System.out.println("El num es dos");
                break;
            case '3':
                System.out.println("El num es tres");
                break;
            case 'a':
                System.out.println("El num es a");
                break;
            default:
                System.out.println("Numero o caracter desconosido");
        }

        String nombre = "andres";
        switch(nombre){
            case "admin":
                System.out.println("Hola " + nombre + ", bienvenido!");
                break;
            case "andres":
                System.out.println("Hola " + nombre);
                break;
            case "pepe":
                System.out.println("Hola " + nombre + "!");
                break;
            default:
                System.out.println("Usuario desconocido");
        }
    }
}