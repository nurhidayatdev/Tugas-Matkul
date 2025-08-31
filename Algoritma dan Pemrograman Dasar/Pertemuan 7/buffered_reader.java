import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffered_reader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan nama Anda: ");
            String name = reader.readLine();

            System.out.print("Masukkan umur Anda: ");
            String age = reader.readLine();

            System.out.println("Nama: " + name);
            System.out.println("Umur: " + age + " tahun.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        }
    }
}