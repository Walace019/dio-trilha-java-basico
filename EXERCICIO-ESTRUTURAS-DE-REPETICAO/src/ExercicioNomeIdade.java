import java.util.Scanner;

public class ExercicioNomeIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;

        while (true) {
            System.out.println("Nome: ");
            nome = scanner.nextLine();
            System.out.println("Idade: ");
            idade = scanner.nextInt();

            if (nome.equals("0")) break;
            if (idade == 0) break;
            System.out.println("Digite 0 para encerrar o programa");
            System.out.println("Seu nome é : " +  nome);
            System.out.println("Sua idade é : " +idade);
        }
        System.out.println("Programa Encerrado");
    }
}
