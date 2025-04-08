package Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(1000);
        ContaPoupanca conta2 = new ContaPoupanca(500);

        conta1.depositar(150);
        conta2.depositar(100);

        System.out.println("Saldo conta 1: R$ " + conta1.consultarSaldo());
        System.out.println("Saldo conta 2: R$ " + conta2.consultarSaldo());

        BancoKonoha banco = new BancoKonoha();
        banco.transferir(conta1, conta2, 500);

        System.out.println("Após trasferencia:");
        System.out.println("Saldo conta 1: R$ " + conta1.consultarSaldo());
        System.out.println("Saldo conta 2: R$ " + conta2.consultarSaldo());
    }
}
