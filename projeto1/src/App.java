import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * int a = 1;
         * int b = 2;
         * int c = a + b;
         * System.out.println("A soma e igual a : " + c);
         * 
         * Screen teste = new Screen();
         * teste.Texto();
         */
        Soma(1.7, 3.8);
    }

    public static double Soma(double x, double y) {
        double somaxy = x + y;
        System.out.println("A soma e igual a : " + somaxy);
        JOptionPane.showMessageDialog(null, "A soma e igual a : " + somaxy);
        return somaxy;
    }

}
