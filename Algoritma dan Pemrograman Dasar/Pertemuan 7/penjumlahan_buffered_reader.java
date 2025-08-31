import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class penjumlahan_buffered_reader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan bilangan pertama (a): ");
            int a = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan bilangan kedua (b): ");
            int b = Integer.parseInt(reader.readLine());

            int sum = a + b;

            System.out.println("Hasil penjumlahan dari " + a + " + " + b + " = " + sum);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input.");
        } catch (NumberFormatException e) {
            System.out.println("Input harus berupa angka.");
        }
    }
}