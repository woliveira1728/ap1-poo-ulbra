import javax.swing.JOptionPane;

public class SistemaDeAvaliacao {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "--- Sistema de Avaliação ---");

        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova: "));
        double notaTrabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: "));

        double media = (nota1 + nota2 + notaTrabalho) / 3.0;

        String situacao;
        if (media >= 6.0) {
            situacao = "APROVADO";
        } else {
            situacao = "REPROVADO";
        }

        String mensagem = String.format(
            "A média do aluno é: %.2f\n" +
            "Situação: %s",
            media, situacao
        );

        JOptionPane.showMessageDialog(null, mensagem);
    }
}