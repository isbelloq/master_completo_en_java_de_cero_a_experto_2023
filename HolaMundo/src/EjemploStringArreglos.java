import javax.sound.midi.Soundbank;

public class EjemploStringArreglos {
    public static void main(String[] args) {
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());

        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);

        for(int i = 0; i<largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("trabalengua.split(\"a\") = " + trabalengua.split("a"));
        String[] arreglo2 = trabalengua.split("a");
        int l = arreglo2.length;
        for(int j = 0; j < l ; j++){
            System.out.println(arreglo2[j]);
        }

        String archivo = "algun.archivo.jpg";
        String[] archivoArr = archivo.split("\\."); //[.]
        l = archivoArr.length;
        for(int j = 0; j < l ; j++){
            System.out.println(archivoArr[j]);
        }
        System.out.println("extension = " + archivoArr[l-1]);

    }
}