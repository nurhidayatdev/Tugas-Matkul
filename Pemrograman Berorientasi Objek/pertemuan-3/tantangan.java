class BangunDatar {
    public double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double hitungLuasLingkaran(double radius, double porsi) {
        return Math.PI * Math.pow(radius, 2) * porsi;
    }
}

public class tantangan {
    public static void main(String[] args) {
        BangunDatar kalkulator = new BangunDatar();

        double alasSegitiga = 6.74;
        double tinggiSegitiga = 6.74;
        double rLingkaranBesar = 2.00; 
        double rLingkaranKecil = 1.00; 

        double luasSegitiga = kalkulator.hitungLuasSegitiga(alasSegitiga, tinggiSegitiga);
        double luasSetengahLingkaranLubang = kalkulator.hitungLuasLingkaran(rLingkaranBesar, 0.5);
        double luasLingkaranBiruKecil = kalkulator.hitungLuasLingkaran(rLingkaranKecil, 1.0);

        double totalLuasBiru = (luasSegitiga - luasSetengahLingkaranLubang) + luasLingkaranBiruKecil;

        // Output hasil
        System.out.println("=== Perhitungan Luas Area Biru ===");
        System.out.printf("Luas Segitiga           : %.4f cm2\n", luasSegitiga);
        System.out.printf("Luas Lubang (Setengah)  : %.4f cm2\n", luasSetengahLingkaranLubang);
        System.out.printf("Luas Lingkaran Kecil    : %.4f cm2\n", luasLingkaranBiruKecil);
        System.out.println("----------------------------------");
        System.out.printf("Total Luas Area Biru    : %.4f cm2\n", totalLuasBiru);
        System.out.println("----------------------------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}