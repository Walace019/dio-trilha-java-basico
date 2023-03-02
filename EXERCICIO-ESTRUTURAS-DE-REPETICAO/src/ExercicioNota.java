import java.util.Scanner;

public class ExercicioNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Digite sua Nota: ");
        nota = scanner.nextInt();


        while (nota <0 | nota > 10) {
            System.out.println("Nota Invalida, Digite novamente");
            nota =scanner.nextInt();
        }
        System.out.println("Nota válida");

    }
}
