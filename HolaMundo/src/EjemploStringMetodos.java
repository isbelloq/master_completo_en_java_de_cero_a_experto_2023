public class EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre = "Santiago";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Santiago\") = " + nombre.equals("Santiago"));
        System.out.println("nombre.equals(\"santiago\") = " + nombre.equals("santiago"));
        System.out.println("nombre.equalsIgnoreCase(\"santiago\") = " + nombre.equalsIgnoreCase("santiago"));
        System.out.println("nombre.compareTo(\"Santiago\") = " + nombre.compareTo("Santiago"));
        System.out.println("nombre.compareTo(\"Aron\") = " + nombre.compareTo("Aron"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", "."));
        System.out.println("trabalengua = " + trabalengua);
        System.out.println("trabalengua.indexOf('a') = " + trabalengua.indexOf('a'));
        System.out.println("trabalengua.lastIndexOf('a') = " + trabalengua.lastIndexOf('a'));
        System.out.println("trabalengua.indexOf('z') = " + trabalengua.indexOf('z'));
        System.out.println("trabalengua.contains(\"t\") = " + trabalengua.contains("t"));
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));
        System.out.println("trabalengua.endsWith(\"lenguas\") = " + trabalengua.endsWith("lenguas"));
        System.out.println("  trabalenguas  ");
        System.out.println("  trabalenguas  ".trim());
    }
}