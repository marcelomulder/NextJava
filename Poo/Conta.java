public class Conta {
    String numero;
    String agencia;
    Double saldo;

    public Conta(String num, String agen, Double sald){
        numero = num;
        agencia = agen;
        saldo = sald;
    }

    public void debitarSaldo(Double saque){
        if (saldo != null && saldo > 0 && saldo >= saque) {
            saldo -= saque;
        } else {
            System.out.println("Não há saldo suficiente!!!");
        }      

    }
    
    public void creditarSaldo(Double saque){
        saldo += saque;
        
    }
}
