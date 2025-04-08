package Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial, TipoConta.POUPANCA);
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor * 0.99; //desconto de 1%
        saldo += valorComTaxa;
    }
}
