import java.util.Scanner;

public class ControleFluxoDecisao {
    public static void main(String[] args) {
        /* Switch é para valores exatos e if para expressoes booleanas
         * Evitar usar o default do Switch para "cases genéricos"
         * Evitar o efeito "flecha" dos if's
         * Evitar muitos if's aninhados
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Mês");
        int mes = scanner.nextInt();
        if (mes == 6) {
            System.out.println("Mês de Junho");
        } else if (mes == 7 || mes == 12 || mes == 1) {
            System.out.println("Férias !! ");
        } else {
            System.out.println("Mês inválido");
        }
    }
}
