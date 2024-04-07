import java.util.Scanner;
public class Atv5Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[20];
        int[] par = new int[20];
        int[] impar = new int[20];
        int countPar = 0;
        int countImpar = 0;

        // Leitura dos valores
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            vetor[i] = scanner.nextInt();

            if (vetor[i] % 2 == 0) {
                par[countPar] = vetor[i];
                countPar++;
            } else {
                impar[countImpar] = vetor[i];
                countImpar++;
            }
        }

        // Exibição dos vetores
        System.out.println("\nVetor original:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\nVetor PAR:");
        for (int i = 0; i < countPar; i++) {
            System.out.print(par[i] + " ");
        }

        System.out.println("\nVetor ÍMPAR:");
        for (int i = 0; i < countImpar; i++) {
            System.out.print(impar[i] + " ");
        }

        scanner.close();
    }
}