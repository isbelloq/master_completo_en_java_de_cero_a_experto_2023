public class SentenciaSwitchCase {
    public static void main(String[] args) {
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