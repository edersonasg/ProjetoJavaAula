import javax.swing.JOptionPane;

public class Screen {
    public void Texto() {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite a"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite b"));
        int c = a + b;
        JOptionPane.showMessageDialog(null, "A soma e igual a : " + c);
    }
}
