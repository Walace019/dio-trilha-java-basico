import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Agencia;
        int Numero;
        String NomeCliente;
        double Saldo = 5.000;

        System.out.println("Bem vindo ao Sistema de Criação de conta do Banco !" + " Digite suas informações a seguir: ");
        System.out.println("Por Favor, digite o número da Agência : ");
        Agencia = scanner.next();
        System.out.println("Digite seu número de Usuario : ");
        Numero = scanner.nextInt();
        System.out.println("Muito bom !, Agora digite o seu nome: ");
        NomeCliente = scanner.next();
        System.out.println("Conta criada com sucesso! ");
        System.out.println();
        System.out.println("Olá " + NomeCliente + " , obrigado por criar uma conta em nosso banco, " + "sua agência é " + Agencia + ", conta " + Numero );
        System.out.printf("Seu saldo é de: %.3f", Saldo);


    }
}