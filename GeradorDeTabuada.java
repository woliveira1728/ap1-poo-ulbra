import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "--- Gerador de Tabuada ---");
        
        String numeroStr = JOptionPane.showInputDialog("Digite um número para ver sua tabuada:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabuada = new StringBuilder();
        tabuada.append(String.format("--- Tabuada do %d ---\n\n", numero));

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(String.format("%d x %d = %d\n", numero, i, resultado));
        }

        JTextArea textArea = new JTextArea(tabuada.toString());
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        textArea.setEditable(false);

        JOptionPane.showMessageDialog(null, textArea, "Resultado da Tabuada", JOptionPane.PLAIN_MESSAGE);
    }
}
