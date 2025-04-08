package Desafio5;

public class BancoKonoha {

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.consultarSaldo() >= valor) {
           origem.saldo -= valor;
           destino.depositar(valor);
            System.out.println("transferenicia realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }
}
