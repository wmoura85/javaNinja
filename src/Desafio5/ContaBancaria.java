package Desafio5;

public abstract class ContaBancaria implements Conta {
    double saldo;
    TipoConta tipo;

    public ContaBancaria(double saldoInicial, TipoConta tipo) {
        this.saldo = saldoInicial;
        this.tipo = tipo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public abstract void depositar(double valor);
}
