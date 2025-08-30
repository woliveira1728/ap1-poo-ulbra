import javax.swing.JOptionPane;

public class CalculadoraDeAposentadoria {

    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "--- Calculadora de Aposentadoria (Regras Simplificadas) ---");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        
        String sexoInput = JOptionPane.showInputDialog("Digite seu sexo (M para masculino, F para feminino):");
        char sexo = sexoInput.toUpperCase().charAt(0);

        int anosContribuicao = Integer.parseInt(JOptionPane.showInputDialog("Digite seus anos de contribuição:"));

        boolean podeAposentar = false;
        
        if (sexo == 'M') {
            if (idade >= 65 || anosContribuicao >= 35) {
                podeAposentar = true;
            }
        } else if (sexo == 'F') {
            if (idade >= 62 || anosContribuicao >= 30) {
                podeAposentar = true;
            }
        }

        String mensagemFinal;
        if (podeAposentar) {
            mensagemFinal = "Parabéns! Você já pode se aposentar.";
        } else {
            String analise = "";
            if (sexo == 'M') {
                int anosFaltamIdade = 65 - idade;
                int anosFaltamContribuicao = 35 - anosContribuicao;
                analise = String.format("Faltam %d anos por idade ou %d anos por tempo de contribuição.",
                                  anosFaltamIdade > 0 ? anosFaltamIdade : 0,
                                  anosFaltamContribuicao > 0 ? anosFaltamContribuicao : 0);
            } else if (sexo == 'F') {
                int anosFaltamIdade = 62 - idade;
                int anosFaltamContribuicao = 30 - anosContribuicao;
                 analise = String.format("Faltam %d anos por idade ou %d anos por tempo de contribuição.",
                                  anosFaltamIdade > 0 ? anosFaltamIdade : 0,
                                  anosFaltamContribuicao > 0 ? anosFaltamContribuicao : 0);
            }
            mensagemFinal = "Você ainda não pode se aposentar.\n\nAnálise:\n" + analise;
        }
        
        JOptionPane.showMessageDialog(null, mensagemFinal);
    }
}
