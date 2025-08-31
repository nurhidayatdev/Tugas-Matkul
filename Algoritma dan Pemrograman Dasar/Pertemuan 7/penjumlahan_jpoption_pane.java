import javax.swing.JOptionPane;

public class penjumlahan_jpoption_pane {
    public static void main(String[] args) {
        try {
            String inputA = JOptionPane.showInputDialog("Masukkan bilangan pertama (a):");
            int a = Integer.parseInt(inputA);

            String inputB = JOptionPane.showInputDialog("Masukkan bilangan kedua (b):");
            int b = Integer.parseInt(inputB);

            int sum = a + b;

            JOptionPane.showMessageDialog(null, "Hasil penjumlahan dari " + a + " + " + b + " = " + sum);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Input harus berupa angka.");
        }
    }
}