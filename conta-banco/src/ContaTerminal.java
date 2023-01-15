import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Informe seu nome: ");
        nomeCliente = scan.next();
        System.out.println("Informe a sua agencia: ");
        agencia = scan.next();
        System.out.println("Informe o numero de sua conta bancaria: ");
        numeroConta = scan.nextInt();
        System.out.println("Informe o valor a ser depositado: ");
        saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
