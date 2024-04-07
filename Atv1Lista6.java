package Lista6;
import java.util.Scanner;
public class Atv1Lista6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] vetor = new int[5];
    
            // Leitura dos valores
            for (int i = 0; i < 5; i++) {
                System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
                vetor[i] = scanner.nextInt();
            }
    
            // Exibição dos números
            System.out.println("\nNúmeros digitados:");
            for (int i = 0; i < 5; i++) {
                System.out.print(vetor[i] + " ");
            }
    
            scanner.close();
        }
    }