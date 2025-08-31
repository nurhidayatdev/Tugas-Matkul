import java.util.Scanner;

public class paket_data {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan budget Anda (dalam ribuan Rupiah): ");
            int budget = input.nextInt();
            
            if (budget >= 100) {
                System.out.println("Paket yang dipilih: Paket Unlimited");
            } else if (budget >= 50 && budget < 100) {
                System.out.println("Paket yang dipilih: Paket 20GB");
            } else if (budget >= 20 && budget < 50) {
                System.out.println("Paket yang dipilih: Paket 5GB");
            } else if (budget > 0 && budget < 20) {
                System.out.println("Paket yang dipilih: Paket 1GB");
            } else {
                System.out.println("Budget tidak valid");
            }
        }
    }
}