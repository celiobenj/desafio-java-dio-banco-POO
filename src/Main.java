public class Main {
    public static void main(String[] args) {

        Banco banco1 = new Banco("Banco 1");
        Cliente cliente1 = new Cliente("Cliente 1", "123456789-00");

        Conta corrente = new ContaCorrente(cliente1, banco1);
        banco1.adicionarContaCorrente(corrente.getCliente(), corrente.getBanco());
        
        Conta poupanca = new ContaPoupanca(cliente1, banco1);
        banco1.adicionarContaPoupanca(poupanca.getCliente(), poupanca.getBanco());

        corrente.depositar(100);

        corrente.transferir(25, poupanca);

        corrente.imprimirExtrato();
        System.out.println("");
        poupanca.imprimirExtrato();

        System.out.println(banco1);
    }
}
