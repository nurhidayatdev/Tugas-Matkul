import java.util.Scanner;

public class konversi_mata_uang {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah dalam Rupiah (IDR): ");
            double jumlahIDR = scanner.nextDouble();

            System.out.println("Pilih mata uang untuk dikonversi:");
            System.out.println("1: Dolar AS (USD)");
            System.out.println("2: Euro (EUR)");
            System.out.println("3: Yen Jepang (JPY)");
            System.out.print("Masukkan pilihan (1/2/3): ");
            int pilihan = scanner.nextInt();
            double konversiIDR;
            
            switch (pilihan) {
                case 1 -> {
                    konversiIDR = jumlahIDR / 15000;
                    System.out.printf("Jumlah dalam Dolar AS (USD): %.2f USD%n", konversiIDR);
                }
                case 2 -> {
                    konversiIDR = jumlahIDR / 16500; 
                    System.out.printf("Jumlah dalam Euro (EUR): %.2f EUR%n", konversiIDR);
                }
                case 3 -> {
                    konversiIDR = jumlahIDR / 110;
                    System.out.printf("Jumlah dalam Yen Jepang (JPY): %.2f JPY%n", konversiIDR);
                }
                default -> System.out.println("Pilihan mata uang tidak valid.");
            }
        }
    }
}