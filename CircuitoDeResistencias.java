import javax.swing.JOptionPane;

public class CircuitoDeResistencias {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "--- Análise de Circuito de Resistências em Série ---");

        double[] resistencias = new double[4];
        double resistenciaEquivalente = 0;

        for (int i = 0; i < 4; i++) {
            String resistenciaStr = JOptionPane.showInputDialog(String.format("Digite o valor da resistência %d (em Ohms):", i + 1));
            resistencias[i] = Double.parseDouble(resistenciaStr);
            resistenciaEquivalente += resistencias[i];
        }

        double maiorResistencia = resistencias[0];
        double menorResistencia = resistencias[0];

        for (int i = 1; i < resistencias.length; i++) {
            if (resistencias[i] > maiorResistencia) {
                maiorResistencia = resistencias[i];
            }
            if (resistencias[i] < menorResistencia) {
                menorResistencia = resistencias[i];
            }
        }
        
        String resultado = String.format(
            "--- Resultados ---\n" +
            "Resistência Equivalente (Série): %.2f Ohms\n" +
            "Maior Resistência: %.2f Ohms\n" +
            "Menor Resistência: %.2f Ohms",
            resistenciaEquivalente, maiorResistencia, menorResistencia
        );

        JOptionPane.showMessageDialog(null, resultado);
    }
}
