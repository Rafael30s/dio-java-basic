public class Main {
    public static void main(String[] args) {
        Cliente rafael = new Cliente();
        rafael.setNome("Rafael");

        Conta cc = new ContaCorrente(rafael);
        Conta poupanca = new ContaPoupanca(rafael);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
