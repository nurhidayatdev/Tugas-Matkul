import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Masukkan nama Anda:", "Input Nama", JOptionPane.QUESTION_MESSAGE);
        
        String ageInput = JOptionPane.showInputDialog(null, "Masukkan umur Anda:", "Input Umur", JOptionPane.QUESTION_MESSAGE);
        int age = Integer.parseInt(ageInput);
        
        String message = "Nama: " + name + "\nUmur: " + age + " tahun";
        JOptionPane.showMessageDialog(null, message, "Hasil Input", JOptionPane.INFORMATION_MESSAGE);
    }
}