import javax.swing.JOptionPane;

public class CalculadoraDeITBI {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "--- Calculadora de ITBI ---");

        String transacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel: ");
        double valorTransicao = Double.parseDouble(transacaoStr);

        String venalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel: ");
        double valorVenal = Double.parseDouble(venalStr);

        String impostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI: ");
        double percentualImposto = Double.parseDouble(impostoStr);

        double baseDeCalculo = Math.max(valorTransicao, valorVenal);

        double valorImposto = baseDeCalculo * (percentualImposto / 100);

        String resultado = String.format(
            "--- Resultado do Cálculo de ITBI ---\n" +
            "Valor de Transação: R$ %.2f\n" +
            "Valor Venal: R$ %.2f\n" +
            "Base de Cálculo (maior valor): R$ %.2f\n" +
            "Valor do Imposto ITBI: R$ %.2f",
            valorTransicao, valorVenal, baseDeCalculo, valorImposto
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}