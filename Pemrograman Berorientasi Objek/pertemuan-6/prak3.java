abstract class BangunDatar {
    abstract double hitungKeliling();
    void display() {
        System.out.println("Ini adalah bangun datar.");
    }
}

class Lingkaran extends BangunDatar {
    double r;
    Lingkaran(double r) {
        this.r = r;
    }
    @Override
    double hitungKeliling() {
        return 2 * Math.PI * r;
    }
}

class Segitiga extends BangunDatar {
    double s;
    Segitiga(double s) {
        this.s = s;
    }
    @Override
    double hitungKeliling() {
        return 3 * s;
    }
}

public class prak3 {
    public static void main(String[] args) {
        Lingkaran bundar = new Lingkaran(7);
        System.out.println("--- Objek Lingkaran ---");
        bundar.display();
        System.out.println("Keliling Lingkaran: " + bundar.hitungKeliling());

        System.out.println(); 

        Segitiga tiga = new Segitiga(10);
        System.out.println("--- Objek Segitiga ---");
        tiga.display();
        System.out.println("Keliling Segitiga: " + tiga.hitungKeliling());

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}