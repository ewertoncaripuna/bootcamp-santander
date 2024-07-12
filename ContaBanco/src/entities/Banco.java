package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<IConta> contas;
    private List<Cliente> clientes;

    public Banco() {
        contas = new ArrayList<>();
        clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
        conta.getCliente().adicionarConta(conta);
    }

    public IConta buscarConta(int numero) {
        for (IConta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}