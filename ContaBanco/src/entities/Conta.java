package entities;

public abstract class Conta implements IConta {
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    @Override
    public int getNumero() {
        return numero;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public abstract void sacar(double valor);
}