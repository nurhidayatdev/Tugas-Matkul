import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input_tiga_bilangan {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan Nilai Pertama: ");
            String nilaiSatu = reader.readLine();

            System.out.print("Masukkan Nilai Kedua: ");
            String nilaiDua = reader.readLine();

            System.out.print("Masukkan Nilai Ketiga: ");
            String nilaiTiga = reader.readLine();

            int nilai1 = Integer.parseInt(nilaiSatu);
            int nilai2 = Integer.parseInt(nilaiDua);
            int nilai3 = Integer.parseInt(nilaiTiga);

            int tukar;

            if (nilai1 > nilai2) {
                tukar = nilai1;
                nilai1 = nilai2;
                nilai2 = tukar;
            }
            if (nilai1 > nilai3) {
                tukar = nilai1;
                nilai1 = nilai3;
                nilai3 = tukar;
            }
            if (nilai2 > nilai3) {
                tukar = nilai2;
                nilai2 = nilai3;
                nilai3 = tukar;
            }

            System.out.println("Masukkan Nilai Pertama = " + nilai1);
            System.out.println("Masukkan Nilai Kedua = " + nilai2);
            System.out.println("Masukkan Nilai Ketiga = " + nilai3);
            System.out.println("Nilai-Nilai yang dimasukkan = " + nilai1 + "," + nilai2 + "," + nilai3);
            System.err.println();
            System.out.println("Nilai Terbesar adalah = " + nilai3);
            System.out.println("Nilai Terkecil adalah = " + nilai1);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }
}