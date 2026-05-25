abstract class Kendaraan {
    abstract void jalankan(int kecepatan);
    void berhenti() {
        System.out.println("Kendaraan berhenti.");
    }
}
class Mobil extends Kendaraan {
    @Override
    void jalankan(int kecepatan) {
        System.out.println("Mobil melaju dengan kecepatan " + kecepatan + " km/jam.");
    }
}
class Sepeda extends Kendaraan {
    @Override
    void jalankan(int kecepatan) {
        System.out.println("Sepeda dikayuh dengan kecepatan " + kecepatan + " km/jam.");
    }
}

public class prak2 {
    public static void main(String[] args) {
        Mobil mobilKu = new Mobil();
        System.out.println("--- Status Mobil ---");
        mobilKu.jalankan(80); 
        mobilKu.berhenti();

        System.out.println(); 

        Sepeda sepedaKu = new Sepeda();
        System.out.println("--- Status Sepeda ---");
        sepedaKu.jalankan(15); 
        sepedaKu.berhenti();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}