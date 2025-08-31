import java.util.Scanner;

public class jumlah_digit_ganjil {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Masukkan bilangan bulat positif: ");
            int angka = scanner.nextInt();
            int jumlahDigitGanjil = 0;
            
            while (angka > 0) {
                int digit = angka % 10; 
                if (digit % 2 != 0) {
                    jumlahDigitGanjil++;
                }
                angka /= 10;
            }   
            System.out.println("Jumlah digit ganjil: " + jumlahDigitGanjil);
        }
    }
}