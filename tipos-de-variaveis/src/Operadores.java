public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.print(nomeCompleto);

        String concatenacao = "? ";
        System.out.print(concatenacao);
        concatenacao = 1 + 1 + 1 + "1"+" ";
        System.out.print(concatenacao);
        concatenacao = 1 + "1" + 1 + 1+" ";
        System.out.print(concatenacao);
        concatenacao = 1 + "1" + 1 + "1"+" ";
        System.out.print(concatenacao);
        concatenacao = "1" + 1 + 1 + 1+" ";
        System.out.print(concatenacao);
        concatenacao = " 1" + (1 + 1 + 1);
        System.out.print(concatenacao);
    }
}
