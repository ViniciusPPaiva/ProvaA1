import java.util.Scanner;
public class ProvaUm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Programa de identificação de anos bissextos e não bissextos.");
// Entrada de dados:
        System.out.println("\nPor favor, informe o ano para verificação: ");
        int Ano = scanner.nextInt();
// Cálculos para saídas de dados:
        if (Ano % 400 == 0) {
            System.out.println("Ano BISSEXTO");

        } else if ((Ano % 4 == 0) && (Ano % 100 != 0)) {
            System.out.println("Ano BISSEXTO.");
        } else {
            System.out.println("Não é Bissexto");
        }

        scanner.close();
    }
}
