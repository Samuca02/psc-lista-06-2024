import java.util.Scanner;
public class Atv7Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        int soma = 0;
        int multiplicacao = 1;

        // Leitura dos valores
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }

        // Exibe os números
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.print(vetor[i] + " ");
        }

        // Exibe a soma e multiplicação
        System.out.println("\nSoma dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);

        scanner.close();
    }
}