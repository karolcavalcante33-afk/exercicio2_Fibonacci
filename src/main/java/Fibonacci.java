import java.util.Scanner;

public class Fibonacci {

    // Método utilizado pelos testes unitários (JUnit) para validar o TDD
    public long calcular(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O índice não pode ser negativo.");
        }
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        long a = 0, b = 1, temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

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