import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarContaCorrente(Cliente cliente, Banco banco) {
        contas.add(new ContaCorrente(cliente, banco));
    }

    public void adicionarContaPoupanca(Cliente cliente, Banco banco) {
        contas.add(new ContaPoupanca(cliente, banco));
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    @Override
    public String toString() {
        return "Banco [contas=" + contas + "]";
    }
}
