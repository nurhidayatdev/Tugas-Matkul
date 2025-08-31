import java.util.Scanner;

public class menu_restoran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih menu restoran:");
            System.out.println("1: Nasi Goreng");
            System.out.println("2: Mie Goreng");
            System.out.println("3: Ayam Bakar");
            System.out.println("4: Soto Ayam");
            
            System.out.print("Masukkan nomor menu pilihan Anda: ");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1 -> System.out.println("Anda memilih Nasi Goreng.");
                case 2 -> System.out.println("Anda memilih Mie Goreng.");
                case 3 -> System.out.println("Anda memilih Ayam Bakar.");
                case 4 -> System.out.println("Anda memilih Soto Ayam.");
                default -> System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}