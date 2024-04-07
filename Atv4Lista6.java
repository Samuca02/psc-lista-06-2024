package Lista6;
import java.util.Scanner;
public class Atv4Lista6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] vetorCaracteres = new char[10];
        int contadorConsoantes = 0;
        //Recebe os caracteres.
        System.out.println("Digite 10 caracteres:");

        for (int i = 0; i < 10; i++) {
            vetorCaracteres[i] = scanner.next().charAt(0);
            char caractere = Character.toUpperCase(vetorCaracteres[i]);

            if (caractere >= 'A' && caractere <= 'Z' && caractere != 'A' && caractere != 'E' && caractere != 'I' && caractere != 'O' && caractere != 'U') {
                contadorConsoantes++;
            }
        }
        //Exibe as consoantes digitadas.
        System.out.println("As consoantes digitadas foram:");
        for (char c : vetorCaracteres) {
            char caractere = Character.toUpperCase(c);
            if (caractere >= 'A' && caractere <= 'Z' && caractere != 'A' && caractere != 'E' && caractere != 'I' && caractere != 'O' && caractere != 'U') {
                System.out.print(c + " ");
            }
        }
        //Exibe quantidade de consoantes.
        System.out.println("\nQuantidade de consoantes lidas: " + contadorConsoantes);

        scanner.close();
    }
}