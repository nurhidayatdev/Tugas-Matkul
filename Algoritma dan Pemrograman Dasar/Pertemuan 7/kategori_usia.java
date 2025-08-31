import java.time.Year;
import java.util.Scanner;

public class kategori_usia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int tahunSekarang = Year.now().getValue();
            
            System.out.print("Masukkan tahun lahir Anda: ");
            int tahunLahir = scanner.nextInt();
            
            int usia = tahunSekarang - tahunLahir;
            
            if (tahunLahir > tahunSekarang) {
                System.out.println("Tahun lahir tidak valid.");
            } else {
                if (usia <= 12) {
                    System.out.println("Kategori: Anak-anak");
                } else if (usia <= 17) {
                    System.out.println("Kategori: Remaja");
                } else if (usia <= 64) {
                    System.out.println("Kategori: Dewasa");
                } else {
                    System.out.println("Kategori: Lansia");
                }
            }
        }
    }
}