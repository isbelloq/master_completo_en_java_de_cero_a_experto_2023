public class EjemploStringTestRendimientoConcat{
    public static void main(String[] args){
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++){
//            c = c.concat(a).concat(b).concat("\n"); // 500 => 7ms, 1000 => 10ms, 10000 => 92ms, 100000 => 3246ms
//            c += a + b + "\n"; // 500 => 47ms, 1000 => 54ms, 10000 => 117ms, 10000 => 1309ms
            sb.append(a).append(b).append("\n"); // 500 => 0ms, 1000 => 0ms, 10000 => 1ms, 100000 => 14ms
        }

        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
//        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
