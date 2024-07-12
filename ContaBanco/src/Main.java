import entities.*;

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("Eduardo", "123.456.789-00");
        Cliente cliente2 = new Cliente("Antônia", "987.654.321-00");

        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente(1, cliente1, 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, cliente2, 0.01);

        // Adicionando contas aos clientes
        cliente1.adicionarConta(contaCorrente);
        cliente2.adicionarConta(contaPoupanca);

        // Criando banco e adicionando clientes e contas
        Banco banco = new Banco();
        banco.adicionarCliente(cliente1);
        banco.adicionarCliente(cliente2);
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Realizando operações
        contaCorrente.depositar(500);
        contaCorrente.sacar(200);
        contaPoupanca.depositar(300);
        contaPoupanca.aplicarJuros();

        // Imprimindo informações
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Conta Corrente: " + contaCorrente.getNumero() + " - Saldo: " + contaCorrente.getSaldo());


        // Buscando e imprimindo contas pelo banco
        IConta contaBuscada1 = banco.buscarConta(1);
        IConta contaBuscada2 = banco.buscarConta(2);

        System.out.println("Conta Buscada 1: " + contaBuscada1.getNumero() + " - " + contaBuscada1.getCliente().getNome() + " - Saldo: " + contaBuscada1.getSaldo());
        System.out.println("Conta Buscada 2: " + contaBuscada2.getNumero() + " - " + contaBuscada2.getCliente().getNome() + " - Saldo: " + contaBuscada2.getSaldo());
    }
}
