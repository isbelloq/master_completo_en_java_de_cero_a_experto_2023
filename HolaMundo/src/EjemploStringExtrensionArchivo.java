public class EjemploStringExtrensionArchivo {
    public static void main(String[] args){
        String archivo = "algun.archivo.jpg";
        System.out.println("archivo = " + archivo);
        String extencion = archivo.substring(archivo.lastIndexOf('.') + 1);
        System.out.println("extencion = " + extencion);
    }
}