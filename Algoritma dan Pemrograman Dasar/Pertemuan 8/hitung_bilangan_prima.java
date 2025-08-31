import java.util.Scanner;

public class hitung_bilangan_prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif n: ");
        int n = scanner.nextInt();
        int total_prima = 0; 
        int i = 2;
    
        while (i <= n) {
            boolean prima = true;
            int j = 2; 
            
            while (j * j <= i) {
                if (i % j == 0) {
                    prima = false;
                    break; 
                }
                j++;
            }
            
            if (prima) {
                total_prima++;
            }
            i++; 
        }
        
        System.out.println("Jumlah bilangan prima dari 1 hingga " + n + " adalah: " + total_prima);
    }
}