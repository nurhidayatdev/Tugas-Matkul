import java.util.Scanner;

public class operator_aritmatika {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Menampilkan pilihan menu
        System.out.println("Pilih menu restoran:");
        System.out.println("1: Nasi Goreng");
        System.out.println("2: Mie Goreng");
        System.out.println("3: Ayam Bakar");
        System.out.println("4: Soto Ayam");
        
        // Meminta input dari pengguna
        System.out.print("Masukkan nomor menu pilihan Anda: ");
        int pilihan = scanner.nextInt();
        
        // Menggunakan switch untuk menentukan menu yang dipilih
        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng.");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng.");
                break;
            case 3:
                System.out.println("A nda memilih Ayam Bakar.");
                break;
            case 4:
                System.out.println("Anda memilih Soto Ayam.");
                break;
            default:
                System.out.println("Pilihan menu tidak valid.");
                break;
        }
        
        scanner.close();
    }
}
