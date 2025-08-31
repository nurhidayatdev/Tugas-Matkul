import java.util.Scanner;

public class reverse_bilangan {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.print("Masukkan bilangan bulat positif: ");
            int angka = scanner.nextInt();
            
            if (angka < 0) {
                System.out.println("Harap masukkan bilangan bulat positif.");
                return;
            }
            
            int bilangan_terbalik = 0;
            
            while (angka > 0) {
                int digit = angka % 10;
                bilangan_terbalik = (bilangan_terbalik * 10) + digit;
                angka = angka / 10;
            }
            System.out.println("Bilangan terbalik: " + bilangan_terbalik);
        }
    }
}