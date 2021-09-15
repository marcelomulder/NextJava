public class App {
    public static void main(String[] args) throws Exception {
        Conta contaDoMarcelo = new Conta("456456-7", "0001", 10000.0);
        Conta contaBBDoMarcelo = new Conta("456785-7", "0005", 500.0);

        // Saque
        System.out.println("Saldo antes do saque: " + contaDoMarcelo.saldo);
        contaDoMarcelo.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaDoMarcelo.saldo);

        System.out.println("------------------");

        System.out.println("Saldo antes do saque: " + contaBBDoMarcelo.saldo);
        contaBBDoMarcelo.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaBBDoMarcelo.saldo);
    }
}
