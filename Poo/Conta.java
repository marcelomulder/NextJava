public class Conta {
    String numero;
    String agencia;
    Double saldo;

    public Conta(String num, String agen, Double sal) {
        numero = num;
        agencia = agen;
        saldo = sal;
    }

    public void debitarSaldo(Double saque) {
        if (saldo != null && saldo > 0 && saldo >= saque) {
            saldo -= saque;
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }
    }

    public void creditarSaldo(Double valor) {
        saldo += valor;
    }
}
