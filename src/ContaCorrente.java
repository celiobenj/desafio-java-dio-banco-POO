public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Informações Conta Corrente:");
        super.imprimirInfosmacoes();
    }
}
