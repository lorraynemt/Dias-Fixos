public class EscopoConta {
    public class conta {
        double saldo = 10.0;

        public void sacar(double valor) {
            double novoSaldo = saldo - valor;
        }

        public void imprimirSaldo() {
            System.out.println(saldo);
        }

        public double calcularDividaExponencial() {
            double valorParcela = 50.0;
            double valorMontante = 0.0;

            for (int x = 1; x <= 5; x++) {
                double valorCalculado = valorParcela * x;
                valorMontante = valorMontante + valorCalculado;
            }
            return valorMontante;
        }
    }
}