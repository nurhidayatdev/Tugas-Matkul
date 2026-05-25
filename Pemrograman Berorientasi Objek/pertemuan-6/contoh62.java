abstract class Bentuk { 
    public abstract double hitungLuas(); 
 
    public void display() { 
        System.out.println("Ini adalah sebuah bentuk."); 
    } 
} 
 
class Persegi extends Bentuk { 
    private double sisi; 
    public Persegi(double sisi) { 
        this.sisi = sisi; 
    } 
    public double hitungLuas() { 
        return sisi * sisi; 
    } 
} 
public class contoh62 { 
    public static void main(String[] args) { 
        Persegi persegi = new Persegi(5); 
        persegi.display(); 
        System.out.println("Luas Persegi: " + persegi.hitungLuas());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    } 
}