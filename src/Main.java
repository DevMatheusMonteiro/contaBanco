import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu número: ");
        int numero = sc.nextInt();
        System.out.print("Digite sua agência: ");
        String agencia = sc.nextLine();
        sc.nextLine();
        System.out.print("Digite seu saldo: ");
        float saldo = sc.nextFloat();
        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nome, saldo);

        System.out.println(contaTerminal);
    }
}