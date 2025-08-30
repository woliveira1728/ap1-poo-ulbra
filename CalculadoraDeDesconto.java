import java.util.Scanner;

public class CalculadoraDeDesconto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Desconto ---");

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a porcentagem de desconto (ex: 10 para 10%): ");
        double percentualDesconto = scanner.nextDouble();

        double valorDesconto = valorProduto * (percentualDesconto / 100);

        double precoFinal = valorProduto - valorDesconto;

        System.out.println("\n--- Resultado ---");
        System.out.printf("Valor do Desconto: R$ %.2f\n", valorDesconto);
        System.out.printf("Preço Final do Produto: R$ %.2f\n", precoFinal);

        scanner.close();
    }
}