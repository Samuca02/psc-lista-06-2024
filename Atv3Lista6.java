package Lista6;
import java.util.Scanner;
public class Atv3Lista6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Recebe os valores.
        System.out.print("Digite a primeira nota: ");
        double a = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double b = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double c = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double d = scanner.nextDouble();
        //Média dos valores
        double media = (a + b + c + d) / 4;
        //Mostra os valores e a média.
        System.out.println("Notas digitadas: " + a + ", " + b + ", " + c + ", " + d);
        System.out.printf("Média das notas é: " + media);

        scanner.close();
    }
}