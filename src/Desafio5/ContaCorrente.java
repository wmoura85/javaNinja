package Desafio5;

public class ContaCorrente extends ContaBancaria {

    public ContaCorrente(double saldoInicial) {
        super(saldoInicial, TipoConta.CORRENTE);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
}
