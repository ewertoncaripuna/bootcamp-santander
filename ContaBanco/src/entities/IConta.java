package entities;

public interface IConta {
    void depositar(double valor);
    void sacar(double valor);
    int getNumero();
    double getSaldo();
    Cliente getCliente();
}