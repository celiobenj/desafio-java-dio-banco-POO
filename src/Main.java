public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", "123456789-00");

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);

        corrente.depositar(100);

        corrente.transferir(25, poupanca);

        corrente.imprimirExtrato();
        System.out.println("");
        poupanca.imprimirExtrato();
    }
}
