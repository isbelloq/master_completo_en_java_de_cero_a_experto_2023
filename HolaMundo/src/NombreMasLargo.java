import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String nombreApellido1 = JOptionPane.showInputDialog(null, "Ingrese el primer nombre  y apellido: ");
        String nombreApellido2 = JOptionPane.showInputDialog(null, "Ingrese el segundo nombre  y apellido: ");
        String nombreApellido3 = JOptionPane.showInputDialog(null, "Ingrese el tercer nombre  y apellido: ");

        String nombre1 = nombreApellido1.split(" ")[0];
        String nombre2 = nombreApellido2.split(" ")[0];
        String nombre3 = nombreApellido3.split(" ")[0];

        int logitudNombre1 = nombre1.length();
        int logitudNombre2 = nombre2.length();
        int logitudNombre3 = nombre3.length();

        String nombreLargo;
        int longitudNombreLargo;

        nombreLargo = logitudNombre1 > logitudNombre2 ? nombreApellido1 : nombreApellido2;
        longitudNombreLargo = logitudNombre1 > logitudNombre2 ? logitudNombre1 : logitudNombre2;

        nombreLargo = longitudNombreLargo > logitudNombre3 ? nombreLargo : nombreApellido3;
        longitudNombreLargo = longitudNombreLargo > logitudNombre3 ? longitudNombreLargo : logitudNombre3;

        JOptionPane.showMessageDialog(null, nombreLargo + " tiene el nombre más largo.");
    }
}