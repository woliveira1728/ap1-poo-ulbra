import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class SistemaDeLogin {
    public static void main(String[] args) {
        
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        final int MAX_TENTATIVAS = 3;
        boolean acessoPermitido = false;

        JOptionPane.showMessageDialog(null, "--- Sistema de Login ---");

        for (int i = 1; i <= MAX_TENTATIVAS; i++) {
            String login = JOptionPane.showInputDialog(null, "Login:", "Acesso ao Sistema", JOptionPane.PLAIN_MESSAGE);

            JPasswordField pf = new JPasswordField();
            int okCxl = JOptionPane.showConfirmDialog(null, pf, "Senha:", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            String senha = "";
            if (okCxl == JOptionPane.OK_OPTION) {
                senha = new String(pf.getPassword());
            }

            if (login == null || okCxl != JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                acessoPermitido = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, 
                    String.format("Login ou senha inválidos. Tentativa %d de %d.", i, MAX_TENTATIVAS), 
                    "Erro de Autenticação", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }

        if (acessoPermitido) {
            JOptionPane.showMessageDialog(null, "Acesso permitido! Bem-vindo ao sistema.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso bloqueado.", "Acesso Negado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
