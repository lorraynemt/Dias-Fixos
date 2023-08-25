public class Operadores {
    public static void main(String[] args) throws Exception {
        /*String nomeCompleto = "LINGUAGEM " + "JAVA";
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

        int numero = 5;
        System.out.println(- numero);

        numero ++;
        System.out.println(numero);

        boolean verdadeiro = true;
        System.out.print(verdadeiro);

        System.out.print("Inverteu " + !verdadeiro);*/

        int a, b;
        a = 5;
        b = 6;

        String resultado;
        if (a == b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        
        System.out.println(resultado);

        String resultado2 = (a == b) ? "verdadeiro" : "falso";
        System.out.println(resultado2);

    }
}
