import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo=0.0;

        System.out.println("Por favor, digite o numero da Agencia");
        agencia = scanner.next();

System.out.println("Por favor, digite o numero da conta bancaria");
numero=scanner.nextInt();

System.out.println("Por favor, digite seu nome");
scanner.nextLine();
nomeCliente=scanner.nextLine();

System.out.println("Por favor, digite seu saldo");
saldo=scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");

    }
}
