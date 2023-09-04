import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Olá, me chamo " + nome + " " + sobreNome);
            System.out.println("tenho " + idade + " anos");
            System.out.println("eu tenho " + altura + "cm");
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e/ou altura precisam ser números com virgula!");
        }
    }
}
