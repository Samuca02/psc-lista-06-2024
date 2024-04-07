import java.util.Scanner;
public class Atv6Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double[] medias = new double[10];
        int alunosAprovados = 0;

        // Leitura das notas de 10 alunos
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1));
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }

            // Cálculo da média
            double somaNotas = 0;
            for (double nota : notas) {
                somaNotas += nota;
            }
            medias[i] = somaNotas / 4;

            // Verificação da aprovação
            if (medias[i] >= 7.0) {
                alunosAprovados++;
            }
        }

        // Exibição das médias e do número de alunos que foram aprovados
        System.out.println("\nMédias dos alunos:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ": " + medias[i]);
        }

        System.out.println("\nNúmero de alunos aprovados: " + alunosAprovados);

        scanner.close();
    }
}