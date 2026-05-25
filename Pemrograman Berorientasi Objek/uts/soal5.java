abstract class Hewan {
    abstract void aksi();
    String nama;

    public void infoHewan() {
        System.out.println(nama);
    }
}
class Berenang extends Hewan {
    public void setDataHewan(String nama) {
        this.nama = nama; 
    }
    @Override
    void aksi() {
        System.out.println("Hewan Berenang:");
    }
}
class Terbang extends Hewan {
    public void setDataHewan(String nama) {
        this.nama = nama; 
    }
    @Override
    void aksi() {
        System.out.println("Hewan Terbang:");
    }
}

public class soal5 {
    public static void main(String[] args) {
        Berenang Ikan = new Berenang(); 
        Ikan.setDataHewan("Ikan");
        Ikan.aksi();
        Ikan.infoHewan();

        Berenang Buaya = new Berenang(); 
        Buaya.setDataHewan("Buaya");
        Buaya.aksi();
        Buaya.infoHewan();

        System.out.println(); 

        Terbang Merpati = new Terbang(); 
        Merpati.setDataHewan("Merpati");
        Merpati.aksi();
        Merpati.infoHewan();

        Terbang Elang = new Terbang(); 
        Elang.setDataHewan("Elang");
        Elang.aksi();
        Elang.infoHewan();

        System.out.println("-----------------");
        System.out.println("Nama: Nur Hidayat");
        System.out.println("NIM: 240209501052");
    }
}