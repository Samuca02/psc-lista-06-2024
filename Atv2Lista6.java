import java.util.Scanner;
public class Atv2Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[10];

        // Leitura dos valores.
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            vetor[i] = scanner.nextDouble();
        }

        // Mostra os valores na ordem inversa.
        System.out.println("\nValores na ordem inversa:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}
