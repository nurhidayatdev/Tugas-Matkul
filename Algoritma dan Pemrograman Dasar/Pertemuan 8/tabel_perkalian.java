import java.util.Scanner;

public class tabel_perkalian {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan bilangan bulat: ");
            int n = scanner.nextInt();
            
            System.out.println("Tabel Perkalian " + n);
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}