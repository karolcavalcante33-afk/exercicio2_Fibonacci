import java.util.Scanner;

public class Fibonacci {

    public static void gerarFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Por favor, informe um número maior que zero.");
            return;
        }

        long t1 = 0, t2 = 1;

        System.out.print("Sequência de Fibonacci até o " + n + "º termo: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");

            long soma = t1 + t2;
            t1 = t2;
            t2 = soma;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GERADOR DE FIBONACCI ===");
        System.out.print("Quantos termos você deseja exibir? ");
        int n = scanner.nextInt();

        gerarFibonacci(n);

        scanner.close();
    }
}